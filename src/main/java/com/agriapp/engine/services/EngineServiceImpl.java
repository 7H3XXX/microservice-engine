package com.agriapp.engine.services;

import com.agriapp.engine.dto.EngineRequestDTO;
import com.agriapp.engine.dto.EngineResponseDTO;
import com.agriapp.engine.entity.Engine;
import com.agriapp.engine.mappers.EngineMapper;
import com.agriapp.engine.repository.EngineRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EngineServiceImpl implements EngineService {

    private EngineRepository engineRepository;

    public EngineServiceImpl(EngineRepository engineRepository) {
        this.engineRepository = engineRepository;
    }

    @Override
    public EngineResponseDTO addEngine(EngineRequestDTO erd) {
        Engine engine = EngineMapper.INSTANCE.engineRequestDtoToEngine(erd);
        return EngineMapper.INSTANCE.engineToEngineResponseDTO(engineRepository.save(engine));
    }

    @Override
    public List<EngineResponseDTO> getEngines() {
        return EngineMapper.INSTANCE.enginesToEngineResponseDTO(engineRepository.findAll());
    }

    @Override
    public EngineResponseDTO getEngine(Long id) {
        return EngineMapper.INSTANCE.engineToEngineResponseDTO(engineRepository.findById(id).get());
    }

    @Override
    public EngineResponseDTO updateEngine(EngineRequestDTO erd) {
        Engine engine = EngineMapper.INSTANCE.engineRequestDtoToEngine(erd);
        return EngineMapper.INSTANCE.engineToEngineResponseDTO(engineRepository.save(engine));
    }

    @Override
    public void deleteEngine(Long id) {
        engineRepository.deleteById(id);
    }
}

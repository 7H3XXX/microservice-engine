package com.agriapp.engine.mappers;

import com.agriapp.engine.dto.EngineRequestDTO;
import com.agriapp.engine.dto.EngineResponseDTO;
import com.agriapp.engine.entity.Engine;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EngineMapper {
    EngineMapper INSTANCE = Mappers.getMapper(EngineMapper.class);

    //@Mapping(source = "nom", target = "name")
    EngineResponseDTO engineToEngineResponseDTO(Engine engine);
    List<EngineResponseDTO> enginesToEngineResponseDTO(List<Engine> engines);
    Engine engineRequestDtoToEngine(EngineRequestDTO engineRequestDTO);
}

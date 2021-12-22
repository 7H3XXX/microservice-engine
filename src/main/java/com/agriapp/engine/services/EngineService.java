package com.agriapp.engine.services;

import com.agriapp.engine.dto.EngineRequestDTO;
import com.agriapp.engine.dto.EngineResponseDTO;

import java.util.List;

public interface EngineService {
    public EngineResponseDTO addEngine(EngineRequestDTO erd);
    public List<EngineResponseDTO> getEngines();
    public EngineResponseDTO getEngine(Long id);
    public EngineResponseDTO updateEngine(EngineRequestDTO erd);
    public void deleteEngine(Long id);
}

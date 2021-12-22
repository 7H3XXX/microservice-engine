package com.agriapp.engine.controller;

import com.agriapp.engine.dto.EngineRequestDTO;
import com.agriapp.engine.dto.EngineResponseDTO;
import com.agriapp.engine.services.EngineService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/engines")
public class EngineController {

    private EngineService engineService;

    public EngineController(EngineService engineService){
        this.engineService = engineService;
    }

    @PostMapping(path = "/add")
    EngineResponseDTO addEngine(@RequestBody EngineRequestDTO dto){
        return engineService.addEngine(dto);
    }

    @GetMapping(path = "/all")
    List<EngineResponseDTO> getAll(){
        return engineService.getEngines();
    }

    @GetMapping(path = "/engine")
    @ResponseBody
    EngineResponseDTO findEngine(@RequestParam Long id){
        return engineService.getEngine(id);
    }

    @PatchMapping(path = "/update")
    EngineResponseDTO editEngine(@RequestBody EngineRequestDTO dto){
        return engineService.updateEngine(dto);
    }

    @DeleteMapping(path = "/del")
    void delEngine(@RequestParam Long id) {
        engineService.deleteEngine(id);
    }
}

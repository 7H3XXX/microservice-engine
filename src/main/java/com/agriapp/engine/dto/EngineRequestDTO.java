package com.agriapp.engine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EngineRequestDTO {
    private Long Id;

    private String reference;

    private String description;
}

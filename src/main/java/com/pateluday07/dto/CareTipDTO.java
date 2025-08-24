package com.pateluday07.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CareTipDTO {

    private Long plantId;
    private String tip;
    private String message;

    public CareTipDTO(Long plantId, String message) {
        this.plantId = plantId;
        this.message = message;
    }

}

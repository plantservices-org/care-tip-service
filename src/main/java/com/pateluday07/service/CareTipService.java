package com.pateluday07.service;

import com.pateluday07.dto.CareTipDTO;
import com.pateluday07.dto.CareTipResponseDTO;

public interface CareTipService {

    CareTipDTO getCareTipByPlantId(Long plantId);

    CareTipResponseDTO saveCareTip(CareTipDTO careTipDTO);
}

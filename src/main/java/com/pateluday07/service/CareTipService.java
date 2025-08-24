package com.pateluday07.service;

import com.pateluday07.dto.CareTipDTO;

public interface CareTipService {

    CareTipDTO getCareTipByPlantId(Long plantId);

    CareTipDTO saveCareTip(CareTipDTO careTipDTO);
}

package com.pateluday07.service;

import com.pateluday07.dto.CareTipDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class CareTipServiceImpl implements CareTipService {

    private static final Map<Long, CareTipDTO> CARE_TIP_DUMMY_DB = new LinkedHashMap<>();

    @Override
    public CareTipDTO getCareTipByPlantId(Long plantId) {
        if (!CARE_TIP_DUMMY_DB.containsKey(plantId))
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Care tip not found for plant ID: " + plantId);
        return CARE_TIP_DUMMY_DB.get(plantId);
    }

    @Override
    public CareTipDTO saveCareTip(CareTipDTO careTipDTO) {
        if (careTipDTO.getPlantId() == null || careTipDTO.getTip() == null || careTipDTO.getTip().isEmpty())
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Plant ID and tip cannot be null or empty");

        CARE_TIP_DUMMY_DB.put(careTipDTO.getPlantId(), careTipDTO);

        return new CareTipDTO(careTipDTO.getPlantId(), "Care tip saved successfully");
    }
}

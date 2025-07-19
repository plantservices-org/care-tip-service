package com.pateluday07.controller;

import com.pateluday07.dto.CareTipDTO;
import com.pateluday07.dto.CareTipResponseDTO;
import com.pateluday07.service.CareTipService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/care-tips")
@AllArgsConstructor
public class CareTipController {

    private final CareTipService careTipService;

    @GetMapping("/{plantId}")
    public ResponseEntity<CareTipDTO> getCareTipByPlantId(@PathVariable Long plantId) {
        return ResponseEntity.ok(careTipService.getCareTipByPlantId(plantId));
    }

    @PostMapping
    public ResponseEntity<CareTipResponseDTO> saveCareTip(@RequestBody CareTipDTO careTipDTO) {
        return ResponseEntity.ok(careTipService.saveCareTip(careTipDTO));
    }
}

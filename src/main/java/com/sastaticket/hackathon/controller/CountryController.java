package com.sastaticket.hackathon.controller;

import com.sastaticket.hackathon.dto.reponse.CountryDto;
import com.sastaticket.hackathon.entity.Country;
import com.sastaticket.hackathon.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/country")
public class CountryController {

    private final CountryService service;

    @GetMapping("/all")
    public ResponseEntity<List<CountryDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}

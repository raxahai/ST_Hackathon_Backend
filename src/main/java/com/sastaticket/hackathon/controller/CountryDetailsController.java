package com.sastaticket.hackathon.controller;

import com.sastaticket.hackathon.dto.reponse.CountryDetailsDto;
import com.sastaticket.hackathon.services.CountryDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/country/details")
@RequiredArgsConstructor
public class CountryDetailsController {

    private final CountryDetailsService service;

    @GetMapping
    public ResponseEntity<CountryDetailsDto> findBy(@RequestParam("countryId") Long countryId){
        return ResponseEntity.ok(service.findBy(countryId));
    }
}

package com.sastaticket.hackathon.controller;

import com.sastaticket.hackathon.dto.reponse.FaqDto;
import com.sastaticket.hackathon.services.FaqService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/faq")
@RequiredArgsConstructor
public class FaqController {

    private final FaqService service;

    @GetMapping
    public ResponseEntity<FaqDto> findBy(@RequestParam("countryId") Long countryId){
        return ResponseEntity.ok(service.findAllBy(countryId));
    }
}

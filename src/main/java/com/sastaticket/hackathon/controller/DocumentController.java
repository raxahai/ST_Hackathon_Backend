package com.sastaticket.hackathon.controller;

import com.sastaticket.hackathon.dto.reponse.DocumentDto;
import com.sastaticket.hackathon.services.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/document")
@RequiredArgsConstructor
public class DocumentController {

    private final DocumentService service;

    @GetMapping
    public ResponseEntity<DocumentDto> findAllBy(@RequestParam("countryId") Long countryId){
        return ResponseEntity.ok(service.findAllBy(countryId));
    }
}

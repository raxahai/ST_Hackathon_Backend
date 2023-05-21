package com.sastaticket.hackathon.services.impl;

import com.sastaticket.hackathon.dto.reponse.DocumentDto;
import com.sastaticket.hackathon.repository.DocumentRepository;
import com.sastaticket.hackathon.services.DocumentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository repository;

    @Override
    public DocumentDto findAllBy(Long countryId) {
        return DocumentDto.builder()
                .documents(repository.findAllByCountryId(countryId))
                .build();
    }
}

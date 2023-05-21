package com.sastaticket.hackathon.services.impl;

import com.sastaticket.hackathon.dto.reponse.FaqDto;
import com.sastaticket.hackathon.repository.FaqRepository;
import com.sastaticket.hackathon.services.FaqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FaqServiceImpl implements FaqService {

    private final FaqRepository repository;

    @Override
    public FaqDto findAllBy(Long countryId) {
        return FaqDto.builder()
                .faqs(repository.findAllByCountryId(countryId))
                .build();
    }
}

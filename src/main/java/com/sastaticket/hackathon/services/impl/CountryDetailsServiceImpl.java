package com.sastaticket.hackathon.services.impl;

import com.sastaticket.hackathon.dto.reponse.CountryDetailsDto;
import com.sastaticket.hackathon.entity.CountryDetails;
import com.sastaticket.hackathon.repository.CountryDetailsRepository;
import com.sastaticket.hackathon.repository.CountryRepository;
import com.sastaticket.hackathon.services.CountryDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountryDetailsServiceImpl implements CountryDetailsService {

    private final CountryRepository countryRepository;

    private final CountryDetailsRepository repository;

    @Override
    public CountryDetailsDto findBy(Long countryId) {
        CountryDetails countryDetails = repository.findByCountryId(countryId)
                .orElseThrow(() -> new RuntimeException("No country details found"));

        return CountryDetailsDto.builder()
                .details(countryDetails)
                .visa(countryDetails.getCountry().getVisa())
                .build();
    }
}

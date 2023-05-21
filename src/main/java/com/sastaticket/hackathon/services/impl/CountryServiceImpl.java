package com.sastaticket.hackathon.services.impl;

import com.sastaticket.hackathon.dto.reponse.CountryDto;
import com.sastaticket.hackathon.entity.Country;
import com.sastaticket.hackathon.repository.CountryRepository;
import com.sastaticket.hackathon.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository repository;

    @Override
    public List<CountryDto> findAll() {
        List<Country> countries = repository.findAll();

        return countries.stream().map(country-> CountryDto.builder()
                .country(country)
                .images(country.getImages())
                .build()).collect(Collectors.toList());
    }
}

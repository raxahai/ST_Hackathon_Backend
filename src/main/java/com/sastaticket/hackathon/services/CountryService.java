package com.sastaticket.hackathon.services;

import com.sastaticket.hackathon.dto.reponse.CountryDto;
import com.sastaticket.hackathon.entity.Country;

import java.util.List;

public interface CountryService {
    List<CountryDto> findAll();
}

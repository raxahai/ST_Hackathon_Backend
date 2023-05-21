package com.sastaticket.hackathon.services;

import com.sastaticket.hackathon.dto.reponse.CountryDetailsDto;

public interface CountryDetailsService {
    CountryDetailsDto findBy(Long countryId);
}

package com.sastaticket.hackathon.services;

import com.sastaticket.hackathon.dto.reponse.FaqDto;
import com.sastaticket.hackathon.entity.FAQ;

import java.util.List;

public interface FaqService {
    FaqDto findAllBy(Long countryId);
}

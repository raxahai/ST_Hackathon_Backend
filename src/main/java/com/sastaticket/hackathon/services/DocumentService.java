package com.sastaticket.hackathon.services;

import com.sastaticket.hackathon.dto.reponse.DocumentDto;
import com.sastaticket.hackathon.entity.Document;

import java.util.List;

public interface DocumentService {
    DocumentDto findAllBy(Long countryId);
}

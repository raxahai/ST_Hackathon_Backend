package com.sastaticket.hackathon.dto.reponse;

import com.sastaticket.hackathon.entity.CountryDetails;
import com.sastaticket.hackathon.entity.Visa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDetailsDto {
    private CountryDetails details;
    private Visa visa;
}

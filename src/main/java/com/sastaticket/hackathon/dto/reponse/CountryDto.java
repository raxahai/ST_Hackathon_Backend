package com.sastaticket.hackathon.dto.reponse;

import com.sastaticket.hackathon.entity.Country;
import com.sastaticket.hackathon.entity.CountryImages;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto {
    private Country country;
    private List<CountryImages> images;
}

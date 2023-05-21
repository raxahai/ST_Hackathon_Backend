package com.sastaticket.hackathon.repository;

import com.sastaticket.hackathon.entity.CountryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryDetailsRepository extends JpaRepository<CountryDetails, Long> {
    Optional<CountryDetails> findByCountryId(Long countryId);
}

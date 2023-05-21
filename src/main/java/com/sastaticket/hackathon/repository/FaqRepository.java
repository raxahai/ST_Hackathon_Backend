package com.sastaticket.hackathon.repository;

import com.sastaticket.hackathon.entity.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FaqRepository extends JpaRepository<FAQ, Long> {
    List<FAQ> findAllByCountryId(Long countryId);
}

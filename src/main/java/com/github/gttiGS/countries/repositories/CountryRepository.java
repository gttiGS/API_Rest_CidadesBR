package com.github.gttiGS.countries.repositories;

import com.github.gttiGS.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

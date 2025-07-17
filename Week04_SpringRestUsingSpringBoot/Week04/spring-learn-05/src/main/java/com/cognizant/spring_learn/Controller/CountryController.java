package com.cognizant.spring_learn.Controller;

import com.cognizant.spring_learn.Entity.Country;
import com.cognizant.spring_learn.Repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    private final CountryRepository countryRepository;

    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        List<Country> countries = countryRepository.findAll();
        logger.info("GET /api/countries called. Returning {} countries.", countries.size());
        countries.forEach(c -> logger.info("Country: {}", c));
        return countries;
    }
}

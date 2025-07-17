package com.cognizant.spring_learn.Service;

import com.cognizant.spring_learn.Entity.Country;
import com.cognizant.spring_learn.Repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;
    private static final Logger logger = LoggerFactory.getLogger(CountryService.class);

    public Country createCountry(Country country) {
        Country saved = countryRepository.save(country);
        logger.info("Created country: {}", saved);
        return saved;
    }

    public List<Country> getAllCountries() {
        List<Country> list = countryRepository.findAll();
        logger.info("Fetched {} countries", list.size());
        return list;
    }

    public Optional<Country> getCountryById(Long id) {
        Optional<Country> found = countryRepository.findById(id);
        logger.info("Fetched country by id {}: {}", id, found);
        return found;
    }

    public Optional<Country> updateCountry(Long id, Country updated) {
        return countryRepository.findById(id).map(existing -> {
            existing.setCode(updated.getCode());
            existing.setName(updated.getName());
            existing.setPopulation(updated.getPopulation());
            existing.setContinent(updated.getContinent());
            existing.setCurrency(updated.getCurrency());
            Country saved = countryRepository.save(existing);
            logger.info("Updated country with id {}: {}", id, saved);
            return saved;
        });
    }

    public Optional<Country> deleteCountry(Long id) {
        return countryRepository.findById(id).map(existing -> {
            countryRepository.deleteById(id);
            logger.info("Deleted country with id {}", id);
            return existing;
        });
    }
}

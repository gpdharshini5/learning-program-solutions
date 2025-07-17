package com.cognizant.spring_learn;

import com.cognizant.spring_learn.Entity.Country;
import com.cognizant.spring_learn.Repository.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DataSeeder.class);

    private final CountryRepository countryRepository;

    public DataSeeder(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public void run(String... args) {
        List<Country> countries = List.of(
                new Country(null, "IN", "India", 1400000000L, "Asia", "INR"),
                new Country(null, "US", "United States", 331000000L, "North America", "USD"),
                new Country(null, "CN", "China", 1440000000L, "Asia", "CNY"),
                new Country(null, "JP", "Japan", 126000000L, "Asia", "JPY"),
                new Country(null, "DE", "Germany", 83000000L, "Europe", "EUR"),
                new Country(null, "BR", "Brazil", 213000000L, "South America", "BRL"),
                new Country(null, "RU", "Russia", 146000000L, "Europe", "RUB"),
                new Country(null, "NG", "Nigeria", 206000000L, "Africa", "NGN"),
                new Country(null, "MX", "Mexico", 128000000L, "North America", "MXN"),
                new Country(null, "AU", "Australia", 26000000L, "Oceania", "AUD")
        );

        countryRepository.saveAll(countries);
        logger.info("Inserted countries into the database:");
    }
}

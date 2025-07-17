package com.cognizant.spring_learn.Controller;

import com.cognizant.spring_learn.Entity.Country;
import com.cognizant.spring_learn.Service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;


    @PostMapping
    public ResponseEntity<Country> create(@RequestBody Country country) {
        Country created = countryService.createCountry(country);
        return ResponseEntity.ok(created);
    }

    @GetMapping
    public ResponseEntity<List<Country>> getAll() {
        List<Country> list = countryService.getAllCountries();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getById(@PathVariable Long id) {
        return countryService.getCountryById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Country> update(@PathVariable Long id, @RequestBody Country country) {
        return countryService.updateCountry(id, country)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Country> delete(@PathVariable Long id) {
        return countryService.deleteCountry(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}



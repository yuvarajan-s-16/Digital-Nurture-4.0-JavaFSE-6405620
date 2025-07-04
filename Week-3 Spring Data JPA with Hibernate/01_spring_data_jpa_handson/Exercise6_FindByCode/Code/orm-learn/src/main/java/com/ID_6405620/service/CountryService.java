package com.ID_6405620.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ID_6405620.model.Country;
import com.ID_6405620.repository.CountryRepository;


@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService ( @Autowired CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    public String updateCountry(Country country) {
        countryRepository.save(country);
        return "Country updated successfully";
    }

    public String deleteCountry(String code) {
        countryRepository.deleteById(code);
        return "Country deleted successfully";
    }

    public String addNewCountry(Country country) {
        countryRepository.save(country);
        return "New country added successfully";
    }
}

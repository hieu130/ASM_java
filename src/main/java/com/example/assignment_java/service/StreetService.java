package com.example.assignment_java.service;

import com.example.assignment_java.entity.Districts;
import com.example.assignment_java.entity.Street;
import com.example.assignment_java.exception.NotFoundException;
import com.example.assignment_java.repository.DistrictsRepository;
import com.example.assignment_java.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetService {
    @Autowired
    DistrictsRepository districtRepository;
    @Autowired
    StreetRepository streetRepository;

    public Street save(Street street) {
        Districts district = (Districts) districtRepository.findById(street.getDistrict_id()).orElse(null);
        if (district == null) {
            throw new NotFoundException("No district found!");
        } else {
            street.setDistrict(district);
            streetRepository.save(street);
        }
        return street;
    }

    public List<Street> findAll() {
        return streetRepository.findAll();
    }
}

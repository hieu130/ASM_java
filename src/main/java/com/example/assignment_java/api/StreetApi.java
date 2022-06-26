package com.example.assignment_java.api;

import com.example.assignment_java.entity.Street;
import com.example.assignment_java.service.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/street")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class StreetApi {
    @Autowired
    StreetService streetService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Street>> getList() {
        return ResponseEntity.ok(streetService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Street> create(@RequestBody Street street) {
        return ResponseEntity.ok(streetService.save(street));
    }
}

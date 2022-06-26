package com.example.assignment_java.api;

import com.example.assignment_java.entity.Districts;
import com.example.assignment_java.service.DistrictsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/district")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class DistrictsApi {
    @Autowired
    DistrictsService districtService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Districts>> getList() {
        return ResponseEntity.ok(districtService.findAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Districts> create(@RequestBody Districts districts) {
        return ResponseEntity.ok(districtService.save(districts));
    }
}

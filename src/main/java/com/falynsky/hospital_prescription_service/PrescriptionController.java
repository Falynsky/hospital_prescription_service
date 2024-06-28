package com.falynsky.hospital_prescription_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @GetMapping
    public ResponseEntity<String> getPrescriptions(@RequestHeader("Authorization") String token) {
        return ResponseEntity.ok("String");
    }
}
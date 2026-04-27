package org.practice.practicenextback.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public ResponseEntity<Map<String, String>> hello() {
        Map<String, String> res = new HashMap<>();
        res.put("message", "Hello from Spring Boot");
        return ResponseEntity.ok(res);
    }

    @GetMapping("/time")
    public ResponseEntity<Map<String, Object>> time() {
        Map<String, Object> res = new HashMap<>();
        res.put("timestamp", Instant.now().toString());
        return ResponseEntity.ok(res);
    }

    @PostMapping("/echo")
    public ResponseEntity<Map<String, Object>> echo(@RequestBody Map<String, Object> body) {
        // simply return the received JSON back to the client
        Map<String, Object> res = new HashMap<>();
        res.put("received", body);
        return ResponseEntity.ok(res);
    }
}


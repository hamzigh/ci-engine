package com.hamzigh.ciengine.api.controller;

import com.hamzigh.ciengine.api.request.JobSubmissionRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/jobs")
public class JobController {

    @GetMapping("{jobId}")
    public ResponseEntity<Object> getJobDetails(@PathVariable String jobId) {
        return ResponseEntity.ok(Map.of("jobId", jobId));
    }

    @PostMapping()
    public ResponseEntity<Object> submitJob(@Valid @RequestBody JobSubmissionRequest request) {

        return ResponseEntity.accepted().body(request);
    }

}

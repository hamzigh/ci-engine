package com.hamzigh.ciengine.api.controller;

import com.hamzigh.ciengine.api.request.JobSubmissionRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/v1/job")
public class JobController {

    @GetMapping("{jobId}")
    public ResponseEntity<Object> getJobDetails(@PathVariable String jobId) {
        return ResponseEntity.ok(Map.of("jobId", jobId));
    }

    @PostMapping("submit")
    public ResponseEntity<Object> submitJobQueue(@Valid @RequestBody JobSubmissionRequest request) {

        return ResponseEntity.ok(request);
    }

}

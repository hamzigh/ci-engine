package com.hamzigh.ciengine.api.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record JobSubmissionRequest(

        @NotBlank(message = "Repository URL is required")
        @Pattern(
                regexp = "^(https?://|git@).+",
                message = "Repository URL must be HTTP, HTTPS, or SSH"
        )
        String repositoryUrl,

        @NotBlank(message = "Branch is required")
        @Size(max = 255, message = "Branch must not exceed 255 characters")
        String branch,

        @NotBlank(message = "Pipeline script is required")
        @Size(max = 20_000, message = "Pipeline script is too large")
        String pipelineScript,

        @Min(value = 1, message = "Timeout must be at least 1 minute")
        @Max(value = 120, message = "Timeout must not exceed 120 minutes")
        int timeoutMinutes
) {}

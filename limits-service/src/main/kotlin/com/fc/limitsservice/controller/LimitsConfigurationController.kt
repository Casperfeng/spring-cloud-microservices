package com.fc.limitsservice.controller

import com.fc.limitsservice.config.Configuration
import com.fc.limitsservice.domain.LimitConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LimitsConfigurationController(val configuration: Configuration) {

    @GetMapping("/limits")
    fun retrieveLimitsFromConfiguration(): LimitConfiguration{
        return LimitConfiguration(configuration.maximum, configuration.minimum)
    }
}
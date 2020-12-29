package com.fc.limitsservice.controller

import com.fc.limitsservice.domain.LimitConfiguration
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ConfigController {

    @GetMapping("/limits")
    fun retrieveLimitsFromConfiguration(): LimitConfiguration{
        return LimitConfiguration(1000, 1)
    }
}
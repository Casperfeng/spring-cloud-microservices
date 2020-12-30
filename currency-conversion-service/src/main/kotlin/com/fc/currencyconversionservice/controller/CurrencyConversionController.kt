package com.fc.currencyconversionservice.controller

import com.fc.currencyconversionservice.domain.CurrencyConversionBean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    fun convertCurrency(@PathVariable from: String, @PathVariable to: String, @PathVariable quantity: BigDecimal): CurrencyConversionBean {
        return CurrencyConversionBean(1L, from, to, quantity, BigDecimal.valueOf(75), quantity * BigDecimal.valueOf(75), 8100)
    }

}
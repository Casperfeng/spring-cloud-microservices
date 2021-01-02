package com.fc.currencyconversionservice.proxy

import com.fc.currencyconversionservice.domain.CurrencyConversionBean
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name="currency-conversion-service", url="localhost:8000")
interface CurrencyExchangeServiceProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable from: String, @PathVariable to: String): CurrencyConversionBean
}
package com.fc.currencyconversionservice.proxy

import com.fc.currencyconversionservice.domain.CurrencyConversionBean
import org.springframework.cloud.netflix.ribbon.RibbonClient
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
interface CurrencyExchangeServiceProxy {
    @GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable from: String, @PathVariable to: String): CurrencyConversionBean
}
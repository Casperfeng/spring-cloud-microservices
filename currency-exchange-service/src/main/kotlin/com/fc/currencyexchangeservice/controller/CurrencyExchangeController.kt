package com.fc.currencyexchangeservice.controller

import com.fc.currencyexchangeservice.domain.ExchangeValue
import com.fc.currencyexchangeservice.repository.ExchangeValueRepository
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
class CurrencyExchangeController(val environment: Environment, val exchangeValues: ExchangeValueRepository) {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    fun retrieveExchangeValue(@PathVariable from:String, @PathVariable to:String): ExchangeValue {
        val exchangeVal = exchangeValues.findByFromAndTo(from, to)
        exchangeVal?.port = Integer.parseInt(environment.getProperty("local.server.port"))
        return exchangeVal
    }

}
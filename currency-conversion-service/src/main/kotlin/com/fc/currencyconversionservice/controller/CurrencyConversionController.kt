package com.fc.currencyconversionservice.controller

import com.fc.currencyconversionservice.domain.CurrencyConversionBean
import com.fc.currencyconversionservice.proxy.CurrencyExchangeServiceProxy
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import java.math.BigDecimal

@RestController
class CurrencyConversionController(var proxy: CurrencyExchangeServiceProxy) {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    fun convertCurrency(@PathVariable from: String, @PathVariable to: String, @PathVariable quantity: BigDecimal): CurrencyConversionBean {
        val uriVariables = HashMap<String, String>()
        uriVariables["from"] = from
        uriVariables["to"] = to
        val responseEntity: ResponseEntity<CurrencyConversionBean> = RestTemplate().getForEntity(
                "http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean::class.java,
                uriVariables)

        val response: CurrencyConversionBean? = responseEntity.body
        if (response != null) {
            return CurrencyConversionBean(response.id, from, to, response.conversionMultiple, quantity, quantity.multiply(response.conversionMultiple), response.port)
        }
        throw Error("Problems fetching data from service")
    }

    //using feign
    @GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
    fun convertCurrencyFeign(@PathVariable from: String?, @PathVariable to: String?,
                             @PathVariable quantity: BigDecimal): CurrencyConversionBean {
        val response = proxy!!.retrieveExchangeValue(from!!, to!!)
        return CurrencyConversionBean(response.id, from, to, response.conversionMultiple, quantity,
                quantity.multiply(response.conversionMultiple), response.port)
    }



}
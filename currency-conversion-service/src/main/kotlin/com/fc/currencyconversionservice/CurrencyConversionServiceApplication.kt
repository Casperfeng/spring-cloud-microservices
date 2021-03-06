package com.fc.currencyconversionservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients("com.fc.currencyconversionservice.proxy")
@EnableDiscoveryClient
class CurrencyConversionServiceApplication

fun main(args: Array<String>) {
    runApplication<CurrencyConversionServiceApplication>(*args)
}

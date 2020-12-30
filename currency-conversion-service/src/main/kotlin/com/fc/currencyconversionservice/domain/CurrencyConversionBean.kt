package com.fc.currencyconversionservice.domain

import java.math.BigDecimal

data class CurrencyConversionBean (
        val id: Long,
        val from: String,
        val to: String,
        val conversionMultiple: BigDecimal,
        val quantity: BigDecimal,
        val totalCalculateAmount: BigDecimal,
        var port: Int = 0
){

}
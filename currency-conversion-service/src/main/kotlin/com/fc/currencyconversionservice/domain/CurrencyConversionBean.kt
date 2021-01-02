package com.fc.currencyconversionservice.domain

import java.math.BigDecimal

data class CurrencyConversionBean (
        val id: Long,
        val from: String,
        val to: String,
        val conversionMultiple: BigDecimal,
        var quantity: BigDecimal = BigDecimal(0),
        var totalCalculateAmount: BigDecimal = BigDecimal(0),
        var port: Int = 0
){

}
package com.fc.currencyexchangeservice.domain

import java.math.BigDecimal

data class ExchangeValue(
        val id: Long = -1,
        val from: String = "",
        val to: String = "",
        val conversionMultiple: BigDecimal = BigDecimal.valueOf(-1)) {}
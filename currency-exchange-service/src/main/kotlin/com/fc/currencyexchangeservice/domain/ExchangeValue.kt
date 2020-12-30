package com.fc.currencyexchangeservice.domain

import java.math.BigDecimal

data class ExchangeValue(
        var id: Long = -1,
        var from: String = "",
        var to: String = "",
        var conversionMultiple: BigDecimal = BigDecimal.valueOf(-1),
        var port: Int = 8000) {}
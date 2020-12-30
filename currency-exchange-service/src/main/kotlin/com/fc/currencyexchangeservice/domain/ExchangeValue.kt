package com.fc.currencyexchangeservice.domain

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ExchangeValue(
        @Id
        var id: Long = -1,
        var from: String = "",
        var to: String = "",
        var conversionMultiple: BigDecimal = BigDecimal.valueOf(-1),
        var port: Int = 8000) {}
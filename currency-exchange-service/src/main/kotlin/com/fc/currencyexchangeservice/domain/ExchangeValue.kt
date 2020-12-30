package com.fc.currencyexchangeservice.domain

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class ExchangeValue(
        @Id
        var id: Long = -1,
        @Column(name="currency_from")
        var from: String = "",
        @Column(name="currency_to")
        var to: String = "",
        var conversionMultiple: BigDecimal = BigDecimal.valueOf(-1),
        var port: Int = 8000) {}
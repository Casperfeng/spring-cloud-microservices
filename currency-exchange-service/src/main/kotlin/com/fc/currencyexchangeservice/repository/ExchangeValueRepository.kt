package com.fc.currencyexchangeservice.repository

import com.fc.currencyexchangeservice.domain.ExchangeValue
import org.springframework.data.jpa.repository.JpaRepository

interface ExchangeValueRepository: JpaRepository<ExchangeValue, Long> {
    fun findByFromAndTo(from: String, to: String): ExchangeValue
}
package com.novatech.currencyconverter.main

import com.novatech.currencyconverter.data.models.CurrencyResponse
import com.novatech.currencyconverter.util.Resource

interface MainRepository {
    suspend fun getRates(base: String): Resource<CurrencyResponse>
}
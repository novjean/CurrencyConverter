package com.novatech.currencyconverter.data

import com.novatech.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi{

    @GET("/latest")
    suspend fun getRates(
//        @Query("apiKey") apiKey: String,
        @Query("base") base: String,
    ) : Response<CurrencyResponse>
}
package com.novatech.currencyconverter.main

import com.novatech.currencyconverter.data.CurrencyApi
import com.novatech.currencyconverter.data.models.CurrencyResponse
import com.novatech.currencyconverter.util.Resource
import javax.inject.Inject

class DefaultMainRepository @Inject constructor(
    private val api:CurrencyApi
) : MainRepository {
    override suspend fun getRates(base: String): Resource<CurrencyResponse> {
        return try{
            val response = api.getRates("<enter-access-key>", base)
            val result = response.body()
            if(response.isSuccessful && result!=null){
                Resource.Success(result)
            } else {
                Resource.Error(response.message())
            }

        } catch(e:Exception){
            Resource.Error(e.message ?: "An error occurred")
        }
    }

}
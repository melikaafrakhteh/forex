package com.melika.remote.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

class ApiServiceFactory {

    fun makeRetrofitService(isDebug: Boolean): ApiService {
        val okHttp = makeOkHttp(makeLoggingInterceptor(isDebug = isDebug))
        return makeRetrofitService(okHttp)
    }

    private fun makeRetrofitService(okHttpClient: OkHttpClient): ApiService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://weatherstack.com/")
            .client(okHttpClient)
            .build()

        return retrofit.create(ApiService::class.java)
    }

    private fun makeOkHttp(loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    private fun makeLoggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (isDebug) {
            HttpLoggingInterceptor.Level.BODY
        } else {
            HttpLoggingInterceptor.Level.NONE
        }
        return logging
    }
}
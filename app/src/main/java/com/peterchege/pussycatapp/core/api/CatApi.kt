package com.peterchege.pussycatapp.core.api

import com.peterchege.pussycatapp.core.api.responses.RandomImageResponse
import retrofit2.http.GET

interface CatApi {
    @GET("images/search")
    suspend fun getRandomImage():RandomImageResponse
}
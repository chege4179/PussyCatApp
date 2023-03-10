/*
 * Copyright 2023 Pussy Cat App By Peter Chege
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.peterchege.pussycatapp.data

import android.util.Log
import com.peterchege.pussycatapp.core.api.CatApi
import com.peterchege.pussycatapp.core.api.responses.cat_breeds_response.CatBreedsResponse
import com.peterchege.pussycatapp.core.api.responses.cats_by_breeds_response.CatsByBreedResponse
import com.peterchege.pussycatapp.core.api.responses.random_cat_response.RandomImageResponse
import com.peterchege.pussycatapp.domain.repository.ImageRepository
import retrofit2.HttpException
import java.io.IOException

class ImageRepositoryImpl(
    private val api: CatApi,
) : ImageRepository {


    override suspend fun getRandomImage(): RandomImageResponse {
        return api.getRandomImage()

    }

    override suspend fun getCatBreeds(): CatBreedsResponse {
        return api.getCatBreeds()
    }

    override suspend fun getCatsByBreed(limit: Int, breedId: String): CatsByBreedResponse {
        return api.getCatsByBreed(limit = limit,breedId = breedId)
    }


}
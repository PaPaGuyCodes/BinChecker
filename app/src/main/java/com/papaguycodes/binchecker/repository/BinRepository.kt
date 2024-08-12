//💡In the Beginning, PaPaGuy wrote beautiful Codes < /> 💜❤️ //
package com.papaguycodes.binchecker.repository

import com.papaguycodes.binchecker.models.BinData
import com.papaguycodes.binchecker.models.BinEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface BinApiService {
    @GET("{bin}")
    suspend fun getBinDetails(@Path("bin") bin: String): BinData
}

class BinRepository(private val binDao: BinDao) {

    private val api = Retrofit.Builder()
        .baseUrl("https://lookup.binlist.net/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(BinApiService::class.java)

    suspend fun getBinInfo(bin: String): BinData {
        return api.getBinDetails(bin)
    }

    suspend fun insertBinData(binEntity: BinEntity) {
        withContext(Dispatchers.IO) {
            binDao.insert(binEntity)
        }
    }

    suspend fun getAllBinHistory(): List<BinEntity> {
        return withContext(Dispatchers.IO) {
            binDao.getAllBins()
        }
    }
}

package com.papaguycodes.binchecker.repository

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.papaguycodes.binchecker.models.BinEntity

@Dao
interface BinDao {
    @Insert
    suspend fun insert(binEntity: BinEntity)

    @Query("SELECT * FROM bin_table")
    suspend fun getAllBins(): List<BinEntity>
}

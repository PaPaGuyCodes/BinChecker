package com.papaguycodes.binchecker.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bin_table")
data class BinEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val bin: String,
    val bankName: String,
    val cardType: String,
    val country: String
)

package com.papaguycodes.binchecker.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bin_table")
data class BinEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val bin: String,
    val bank: String?,
    val country: String?,
    val type: String?,
    val brand: String?
)

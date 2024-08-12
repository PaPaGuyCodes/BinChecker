package com.papaguycodes.binchecker.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.papaguycodes.binchecker.models.BinEntity

@Database(entities = [BinEntity::class], version = 1)
abstract class BinDatabase : RoomDatabase() {
    abstract fun binDao(): BinDao

    companion object {
        @Volatile
        private var instance: BinDatabase? = null

        fun getDatabase(context: Context): BinDatabase {
            return instance ?: synchronized(this) {
                val newInstance = Room.databaseBuilder(
                    context.applicationContext,
                    BinDatabase::class.java,
                    "bin_database"
                ).build()
                instance = newInstance
                newInstance
            }
        }
    }
}

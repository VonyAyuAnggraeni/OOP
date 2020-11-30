package com.satria.apk_kelompok

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Mahasiswa::class, Dosen::class), version = 1)
abstract class MahasiswaRoomDatabase : RoomDatabase() {
    abstract fun mahasiswaDao(): MahasiswaDao
    abstract fun dosenDao(): DosenDao

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        MahasiswaRoomDatabase::class.java, "APPDB"
    ).build()
}

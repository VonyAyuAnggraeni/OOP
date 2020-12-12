package com.satria.apk_kelompok.Database

import androidx.room.*
import com.satria.apk_kelompok.Database.hp

@Dao
interface hpDao {
    @Insert
    suspend fun addHp(hp: hp)

    @Update
    suspend fun updateHp(hp: hp)

    @Delete
    suspend fun deleteHp(hp: hp)

    @Query("SELECT * FROM hp")
    suspend fun getAllhp(): List<hp>
}
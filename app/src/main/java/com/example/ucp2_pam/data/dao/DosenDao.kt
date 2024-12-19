package com.example.ucp2_pam.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DosenDao {
    @Query("SELECT * FROM dosen ORDER BY nama ASC")
    fun getAllDosen(): Flow<List<Dosen>>

    @Insert
    suspend fun  insertDosen(
        dosen: Dosen
    )
}
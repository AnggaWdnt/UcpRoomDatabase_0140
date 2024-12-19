package com.example.ucp2_pam.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.ucp2_pam.data.entity.Matakuliah
import kotlinx.coroutines.flow.Flow

@Dao
interface MatakuliahDao {
    // memasukan data dengan mengambil tabel matakuliah
    // fungsi get all data
    @Query("select * from matakuliah ORDER BY kode ASC")
    fun getAllMatakuliah() : Flow<List<Matakuliah>>

    // getMatakuliah
    @Query("select * from matakuliah WHERE kode =:kode")
    fun getMatakuliah(kode: String) : Flow<Matakuliah>

    // deleteMatakuliah
    @Delete
    suspend fun deleteMatakuliah(matakuliah: Matakuliah)
    // updateMatakuliah

    @Update
    suspend fun updateMatakuliah(matakuliah: Matakuliah)

    @Insert
    suspend fun insertMatakuliah (
        matakuliah: Matakuliah
    )
}
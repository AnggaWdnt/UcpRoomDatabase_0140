package com.example.ucp2_pam.data.repository

import com.example.ucp2_pam.data.entity.Dosen
import kotlinx.coroutines.flow.Flow

interface RepositoryDosen {

    // suspend digunakan untuk operasi yang berat seperti Create, Delete, Insert
    suspend fun insertDosen(dosen: Dosen)
    fun getAllDosen(): Flow<List<Dosen>> //getAllDosen
}
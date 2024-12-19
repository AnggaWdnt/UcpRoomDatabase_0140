package com.example.ucp2_pam.data.repository

import com.example.ucp2_pam.data.dao.DosenDao
import com.example.ucp2_pam.data.entity.Dosen
import kotlinx.coroutines.flow.Flow

class LocalRepositoryDosen (
    private val DosenDao: DosenDao): RepositoryDosen{
        override suspend fun insertDosen(dosen: Dosen) {
            DosenDao.insertDosen(dosen)
        }

        override fun getAllDosen(): Flow<List<Dosen>> {
            return DosenDao.getAllDosen()
        }
    }
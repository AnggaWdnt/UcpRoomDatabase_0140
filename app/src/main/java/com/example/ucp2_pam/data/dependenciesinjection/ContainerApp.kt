package com.example.ucp2_pam.data.dependenciesinjection

import android.content.Context
import com.example.ucp2_pam.data.database.KrsDatabase
import com.example.ucp2_pam.data.repository.LocalRepositoryDosen
import com.example.ucp2_pam.data.repository.RepositoryDosen

interface InterfaceContainerApp {
    val repositoryDosen: RepositoryDosen
    val repositoryMatakuliah: RepositoryMatakuliah
}

class ContainerApp (private val context: Context): InterfaceContainerApp{
    override val repositoryDosen: RepositoryDosen by lazy {
        LocalRepositoryDosen(KrsDatabase.getDatabase(context).dosendao())
    }

    override val repositoryMatakuliah: RepositoryMatakuliah by lazy {
        LocalRepositoryMatakuliah(KrsDatabase.getDatabase((context).MatakuliahDao()))
    }
}
package com.example.ucp2_pam.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ucp2_pam.data.dao.DosenDao
import com.example.ucp2_pam.data.dao.MatakuliahDao
import com.example.ucp2_pam.data.entity.Dosen
import com.example.ucp2_pam.data.entity.Matakuliah

@Database(entities = [Dosen::class, Matakuliah::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase(){
    abstract fun  matakuliahdao(): MatakuliahDao
    abstract fun  dosendao(): DosenDao

    companion object{
        @Volatile
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java, // Class database
                    "KrsDatabase" // Nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}
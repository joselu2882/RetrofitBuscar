package com.dam.retrofitbuscador

import androidx.room3.Delete
import androidx.room3.Insert
import androidx.room3.Query
import androidx.room3.OnConflictStrategy

interface AutoresDAO {
    @Query("SELECT * FROM autores")
    fun selectAll(): List<Autores>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAutor(autores: Autores)

    @Delete
    fun deleteAutor(autores: Autores)
}
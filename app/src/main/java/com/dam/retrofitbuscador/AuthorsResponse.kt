package com.dam.retrofitbuscador

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

// Clase contenedor de la respuesta
data class AuthorsResponse(
    var numFound: Int,
    @SerializedName("docs") var autores: List<Autores>
)
// Clase modelo para cada Autor
@androidx.room3.Entity
data class Autores(
    @PrimaryKey var key: String,
    var birth_date: String?,
    var name: String
)
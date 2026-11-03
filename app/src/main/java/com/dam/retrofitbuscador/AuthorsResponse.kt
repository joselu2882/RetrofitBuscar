package com.dam.retrofitbuscador

import com.google.gson.annotations.SerializedName

// Clase contenedor de la respuesta
data class AuthorsResponse(
    var numFound: Int,
    @SerializedName("docs") var autores: List<Autores>
)
// Clase modelo para cada Autor
data class Autores(
    var key: String,
    var birth_date: String?,
    var name: String
)
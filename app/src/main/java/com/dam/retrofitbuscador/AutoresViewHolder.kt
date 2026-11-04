package com.dam.retrofitbuscador

import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.Toolbar


import androidx.recyclerview.widget.RecyclerView

class AutoresViewHolder (view: View): RecyclerView.ViewHolder(view) {
    var nombre: TextView
    var toolbarfavorito: Toolbar
    init{
        nombre=view.findViewById(R.id.tvAutor)
        toolbarfavorito=view.findViewById(R.id.toolbarFavorito)
        toolbarfavorito.inflateMenu(R.menu.menu)
    }
}
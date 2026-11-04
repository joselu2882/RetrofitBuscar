package com.dam.retrofitbuscador

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdaptadorAutores : RecyclerView.Adapter<AutoresViewHolder>() {

    private lateinit var listener: AdaptadorAutoresCallBack
    private var aut: List<Autores> = mutableListOf()


    interface AdaptadorAutoresCallBack {
        fun onSaveAutor(autor: Autores)
    }

    fun setAdaptadorAutoresCallback(listener: AdaptadorAutoresCallBack) {
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            AutoresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AutoresViewHolder(
            layoutInflater.inflate(
                R.layout.fila_autores,
                parent, false
            )
        )
    }

    override fun getItemCount(): Int = aut.size
    override fun onBindViewHolder(holder: AutoresViewHolder, position: Int) {
        val item = aut[position]
        holder.nombre.text = item.name
        holder.toolbarfavorito.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.acttion_favoritos -> {
                    listener.onSaveAutor(item)
                    true
                }

                else -> {
                    true
                }
            }
        }

    }


    fun changelist(autores: List<Autores>) {
        aut = autores
    }
}
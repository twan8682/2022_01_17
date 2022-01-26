package com.example.project_2022_01_17

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2022_01_17.databinding.ItemMainBinding

class Adapter(private val datas_1 : MutableList<String>) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun getItemCount(): Int {
        return datas_1.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val bind = (holder as ViewHolder).binding
        bind.itemData.text = datas_1[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    = ViewHolder(ItemMainBinding.inflate(LayoutInflater.from(parent.context),parent,false),datas_1)
}
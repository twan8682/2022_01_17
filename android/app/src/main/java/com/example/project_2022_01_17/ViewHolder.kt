package com.example.project_2022_01_17

import android.util.Log
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.project_2022_01_17.databinding.ItemMainBinding
import kotlin.concurrent.thread


class ViewHolder (val binding : ItemMainBinding, var datas_2:MutableList<String>): RecyclerView.ViewHolder(binding.root) {


    init{
        binding.itemRoot.setOnClickListener{
            Log.d("test","$adapterPosition")
        }
    }

}
package com.example.project_2022_01_17

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.project_2022_01_17.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding:ActivityMainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var num = 0
        var datas = mutableListOf<String>()

        for(i in 1..20)
        {
            datas.add("Item $i")
        }

        val s = StringRequest(
            Request.Method.GET,"https://jsonplaceholder.typicode.com/users",
            {
                Log.d("test","${it}")
            },
            {
                Log.d("test_error","error")
            })
        val queue = Volley.newRequestQueue(this)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = Adapter(this,datas)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))


        binding.add.setOnClickListener(){
            //num++
            //datas.add("new item $num")
            //(binding.recyclerView.adapter as Adapter).notifyDataSetChanged()

            queue.add(s)

        }
    }
}
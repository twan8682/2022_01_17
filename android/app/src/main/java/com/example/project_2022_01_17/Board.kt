package com.example.project_2022_01_17

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project_2022_01_17.databinding.BoardBinding

class Board : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding_board = BoardBinding.inflate(layoutInflater)
        setContentView(binding_board.root)

        var intent = intent
        var data = intent.getStringExtra("num")

        binding_board.num.text = "text"+"  " + data
    }

}
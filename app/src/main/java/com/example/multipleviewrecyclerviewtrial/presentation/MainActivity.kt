package com.example.multipleviewrecyclerviewtrial.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multipleviewrecyclerviewtrial.R
import com.example.multipleviewrecyclerviewtrial.data.DataEntities
import com.example.multipleviewrecyclerviewtrial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

  private fun initView(){
      binding.recyclerView.layoutManager = LinearLayoutManager(this)
      binding.recyclerView.adapter= RecyclerViewAdapter(getlist())

    }

    private fun getlist (): ArrayList<DataEntities>{
        return arrayListOf(
        DataEntities(viewType = 1, "This is male user"),
        DataEntities(viewType = 2, "This is Female user"),
        DataEntities(viewType = 1, "This is male user"),
        DataEntities(viewType = 2, "This is Female user"),
        DataEntities(viewType = 1, "This is male user"),
        DataEntities(viewType = 2, "This is Female user"),
        DataEntities(viewType = 1, "This is male user")
        )



    }
}
package com.has.copa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.RecyclerView
import com.has.copa.adapter.ItemAdapter
import com.has.copa.data.Datasource

class tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Initialize data.
        val myDataset = Datasource().loadEscalacao()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
// Use this setting to improve performance if you know that changes
// in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
    }

}
package com.example.bugdroidprojectlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    var listitems = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var girilen=findViewById<EditText>(R.id.textgir)
        var buton=findViewById<Button>(R.id.kaydetbuttonu)
        val listView=findViewById<ListView>(R.id.listView)


        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listitems)

        listView.adapter= adapter

        buton.setOnClickListener{
            listitems.add(girilen.text.toString())
            adapter.notifyDataSetChanged()
            girilen.setText("")
        }

    }
}
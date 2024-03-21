package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listview)
        //val names = arrayOf("Swift", "Python", "JavaScript", "C#", "java", "Kotlin")

        val list = ArrayList<Model>()
        list.add(Model("Dom", "Student", R.drawable.ic_launcher_foreground))
        list.add(Model("Bob", "Human", R.drawable.ic_launcher_foreground))
        list.add(Model("John", "Hobo", R.drawable.ic_launcher_foreground))

        listView.adapter = myCustomAdapter(this, R.layout.custom_item_layout, list)

//        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1,
//            names)
//        listView.adapter = arrayAdapter

        listView.setOnItemClickListener {
            adapterView, view, i, l ->
            Toast.makeText(this, "item selected is " + list[i].name, Toast.LENGTH_LONG).show()
//            print("item selected is ${list[i]} ${l} ${adapterView}, ${view}")
        }
    }
}

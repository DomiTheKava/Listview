package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

public class myCustomAdapter (
    var ctx: Context,
    var ourResourse: Int,
    var items: ArrayList<Model>
): ArrayAdapter<Model>(ctx, ourResourse, items) {

    override fun getView (position: Int, convertView: View?, parent: ViewGroup): View {
        var layoutInflater = LayoutInflater.from(ctx)
        var view = layoutInflater.inflate(ourResourse, null)

        val name = view.findViewById<TextView>(R.id.name)
        val extra = view.findViewById<TextView>(R.id.extra)
        val image = view.findViewById<ImageView>(R.id.imageView)

        name.text = items[position].name
        extra.text = items[position].extraText
        image.setImageDrawable(ctx.resources.getDrawable(items[position].image))

        return view
    }

}
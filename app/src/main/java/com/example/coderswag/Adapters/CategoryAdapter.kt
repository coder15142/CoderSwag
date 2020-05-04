package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(context : Context, categories : List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories     
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       val categoryview : View

        categoryview = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
        val categoryImage : ImageView = categoryview.findViewById(R.id.categoryImage)
        val categoryName : TextView = categoryview.findViewById(R.id.categoryName)

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryImage.setImageResource(resourceId)

        categoryName.text = category.title
        return categoryview
    }

    override fun getItem(position: Int): Any {
      return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
       return categories.count()
    }
}
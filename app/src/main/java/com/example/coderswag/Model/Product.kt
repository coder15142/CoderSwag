package com.example.coderswag.Model

class Product(val title: String, val price: String, val image: String){
    override fun toString(): String {
        return title
    }
}
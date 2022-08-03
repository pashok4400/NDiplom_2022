package ru.netology.myapplication.dto

data class Recipe(
    val recipeId: Long,
    val author: String,
    val title: String,
    val category: String,
    var likedByMe: Boolean = false
){
    companion object{
        lateinit var content: ArrayList<Step>
    }
}
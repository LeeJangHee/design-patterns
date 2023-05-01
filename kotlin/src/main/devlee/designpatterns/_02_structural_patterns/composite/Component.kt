package main.devlee.designpatterns._02_structural_patterns.composite

interface Component {
    fun getWeight(): Int
    fun getItemCount(): Int
    fun getItemName(): String
}
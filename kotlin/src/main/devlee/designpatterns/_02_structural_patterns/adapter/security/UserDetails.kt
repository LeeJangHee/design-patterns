package main.devlee.designpatterns._02_structural_patterns.adapter.security

interface UserDetails {
    fun getUsername(): String
    fun getPassword(): String
}
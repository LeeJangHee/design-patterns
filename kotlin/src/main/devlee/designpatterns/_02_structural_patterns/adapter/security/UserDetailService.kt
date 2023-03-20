package main.devlee.designpatterns._02_structural_patterns.adapter.security

interface UserDetailService {
    fun loadUser(username: String): UserDetails
}
package main.devlee.designpatterns._02_structural_patterns.adapter

import main.devlee.designpatterns._02_structural_patterns.adapter.security.UserDetails

class AccountUserDetails(
    private val account: Account
) : UserDetails {
    override fun getUsername(): String {
        return this.account.name
    }

    override fun getPassword(): String {
        return this.account.password
    }
}
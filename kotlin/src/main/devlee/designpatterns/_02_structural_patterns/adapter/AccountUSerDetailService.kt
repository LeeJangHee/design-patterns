package main.devlee.designpatterns._02_structural_patterns.adapter

import main.devlee.designpatterns._02_structural_patterns.adapter.security.UserDetailService
import main.devlee.designpatterns._02_structural_patterns.adapter.security.UserDetails

class AccountUSerDetailService(
    private val accountService: AccountService
) : UserDetailService {

    override fun loadUser(username: String): UserDetails {
        val account = accountService.findAccountByUsername(username)
        return AccountUserDetails(account)
    }
}
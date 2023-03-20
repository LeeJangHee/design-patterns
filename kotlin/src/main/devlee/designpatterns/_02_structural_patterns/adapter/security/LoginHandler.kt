package main.devlee.designpatterns._02_structural_patterns.adapter.security


class LoginHandler(private var userDetailsService: UserDetailService) {

    fun login(username: String, password: String): String {
        val userDetails = userDetailsService.loadUser(username)
        return if (userDetails.getPassword() == password) {
            userDetails.getUsername()
        } else {
            throw IllegalArgumentException()
        }
    }
}
import main.devlee.designpatterns._02_structural_patterns.adapter.AccountService
import main.devlee.designpatterns._02_structural_patterns.adapter.AccountUSerDetailService
import main.devlee.designpatterns._02_structural_patterns.adapter.security.LoginHandler

private fun main() {
    val accountService = AccountService()
    val userDetailService = AccountUSerDetailService(accountService)
    val loginHandler = LoginHandler(userDetailService)
    val login = loginHandler.login("이장희", "이장희")
    println(login)
}
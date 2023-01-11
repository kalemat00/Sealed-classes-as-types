fun main(){
    var outLookUser: User = Email("DFCDER345FDF", "kalemat", "verySafePassword1234")
    println(accountDetails(outLookUser))
    var facebookUser: User = Facebook("GHFR32DDF34", "giorgio", "strongpassword")
    println(accountDetails(facebookUser))
    var googleUser: User = Google("GEDSDC543DF", "pincopallino", "newPassword666")
    println(accountDetails(googleUser))
}

fun accountDetails(user: User): String{
    return when(user){
            is Email -> "User $user"
            is Facebook -> "User $user"
            is Google -> "User $user"
    }
}

sealed class User

data class Email(val id: String, var username: String, var email: String): User()

data class Facebook(val id: String, var username: String, var email: String): User()

data class Google(val id: String, var username: String, var email: String): User()
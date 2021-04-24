package UTS.R18090091.RvnFbrnsyh.activity.login

import UTS.R18090091.RvnFbrnsyh.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}
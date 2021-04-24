package UTS.R18090091.RvnFbrnsyh.activity.login.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import UTS.R18090091.RvnFbrnsyh.model.User

@Generated("com.robohorse.robopojogenerator")
data class ResultLogin(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("user")
	val user: User? = null,

	@field:SerializedName("status")
	val status: Int? = null
)
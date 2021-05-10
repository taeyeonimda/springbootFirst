package kr.or.connect.roleapp.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/userReg")
	public String UserReg() {
		return "user/userReg";
	}
}

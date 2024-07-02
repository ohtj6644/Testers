package com.example.testers.Controller.View;


import com.example.testers.BASE.SysUser;
import com.example.testers.Service.UserService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sys001")
public class Sys_001_View {
    @Resource
    private UserService userService;

    @GetMapping("/sys001")
    public String view001 (Model model){
        return "sys/sys001";
    }

    //-----------------------유저 로그인 ---------------------------------//
    @PostMapping("/sys001")
    public String login(Model model, HttpSession session, @RequestParam("username") String username, @RequestParam("password") String password) {
        if (userService.authenticateUser(username, password)) {
            session.setAttribute("loggedIn", true);

            SysUser user = this.userService.findUser(username);
            session.setAttribute("user", user);

            return "redirect:/";
        } else {
            model.addAttribute("error", true);
            return "login";
        }
    }
}

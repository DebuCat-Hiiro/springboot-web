package com.lxf.springbootweb.controller;

import com.lxf.springbootweb.pojo.User;
import com.lxf.springbootweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author Hanamaru
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/login")
    public String login(
            @RequestParam int userId,
            @RequestParam String userPwd,
            Model model, HttpSession session) {

        User user = userService.queryUserbyId(userId);
        //真实的业务
        if (user != null) {
            if (user.getUserId() == userId && user.getUserPwd().equals(userPwd)) {
                session.setAttribute("loginUser", user.getUserName());
                return "redirect:/main.html";
            } else {
                //反馈给用户错误消息
                model.addAttribute("msg", "用户名或密码错误，请重新输入！");
                return "index";
            }
        } else {
            //反馈给用户错误消息
            model.addAttribute("msg", "用户不存在！");
            return "index";
        }
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/index.html";
    }
}

package system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import system.model.User;
import system.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @GetMapping("/list")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @ResponseBody
    @GetMapping("/validate")
    public ModelAndView validateUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userFromServer", new User());
        modelAndView.setViewName("users_check_page");
        return modelAndView;
    }

    @ResponseBody
    @PostMapping("/check")
    public String checkUser(@ModelAttribute("userFromServer") User user) {
        return getUsers().contains(user) ? "valid" : "invalid";
    }
}

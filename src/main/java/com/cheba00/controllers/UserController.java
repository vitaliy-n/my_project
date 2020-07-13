package com.cheba00.controllers;

import com.cheba00.models.User;
import com.cheba00.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", userService.userList());
        model.addAttribute("user", new User());


        return "users";
    }

    @GetMapping("/users/add")
    public String addUser(@ModelAttribute("user") User user) {
        if (user.getId() == 0) {
            this.userService.save(user);

        } else {
            this.userService.update(user);
        }
        return "redirect:/users";
    }

    @GetMapping("/remove/{id}")
    public String removeUser(@PathVariable("id") Integer id) {
        this.userService.delete(id);
        return "redirect:/users";

    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("user", this.userService.findById(id));
        model.addAttribute("users", this.userService.userList());
        return "users";
    }

    @GetMapping("userdata/{id}")
    public String userData(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("user", this.userService.findById(id));
        return "userdata";
    }
}

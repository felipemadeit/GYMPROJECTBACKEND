package com.gymsoftware.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping(value="user/new")
    public String new(@Valid @ModelAttribute("formData") UserFormData formData,
    BindingResult binding,
    Model model) {
        if (binding.hasErrors()) {
            return "users/new";
        }
     }
}

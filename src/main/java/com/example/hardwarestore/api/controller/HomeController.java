package com.example.hardwarestore.api.controller;

import com.example.hardwarestore.model.Hardware;
import com.example.hardwarestore.model.User;
import com.example.hardwarestore.persist.db.postgres.HardwareRepository;
import com.example.hardwarestore.persist.db.postgres.UserRepository;
import com.example.hardwarestore.persist.db.postgres.entity.HardwareEntity;
import com.example.hardwarestore.persist.db.postgres.entity.UserEntity;
import lombok.RequiredArgsConstructor;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HardwareRepository hardwareRepository;
    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;

    @GetMapping("/home")
    public String index(Model model) {
        model.addAttribute("message", "Открыта главная страница магазина");
        model.addAttribute("hardwares", hardwareRepository.findAll());
        return "home";
    }

    @GetMapping("/hardware/new")
    public String newHardwareForm(Model model) {
        model.addAttribute("hardware", new Hardware());
        return "hardwareForm";
    }

    @PostMapping("/hardware/new")
    public String addHardware(@Valid @ModelAttribute Hardware hardware, BindingResult result) {
        if (result.hasErrors()) {
            return "hardwareForm";
        }

        hardwareRepository.save(new HardwareEntity(
                null,
                hardware.getName(),
                hardware.getType(),
                hardware.getPrice(),
                hardware.getDescription()
        ));
        // сохраните объект hardware, например, в базе данных

        return "redirect:/home";
    }

    @GetMapping("/register")
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @PostMapping("/register")
    public String addUser(@Valid @ModelAttribute User user, BindingResult result) {
        if (result.hasErrors()) {
            return "userForm";
        }

        userRepository.save(new UserEntity(
                null,
                user.getUsername(),
                user.getPassword(),
                "rol"
        ));

        return "redirect:/home";
    }


    @GetMapping("/login")
    public String login() {
        return "login";
    }
}

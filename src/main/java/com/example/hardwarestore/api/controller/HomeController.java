package com.example.hardwarestore.api.controller;

import com.example.hardwarestore.model.Hardware;
import com.example.hardwarestore.persist.db.postgres.HardwareRepository;
import com.example.hardwarestore.persist.db.postgres.entity.HardwareEntity;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final HardwareRepository hardwareRepository;

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
                hardware.getName(),
                hardware.getType()
        ));
        // сохраните объект hardware, например, в базе данных

        return "redirect:/home";
    }
}

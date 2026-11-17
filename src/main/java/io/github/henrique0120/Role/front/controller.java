package io.github.henrique0120.Role.front;

import io.github.henrique0120.Role.service.establishmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Controller
@AllArgsConstructor
public class controller {

    private final establishmentService service;

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("message", "Bem-vindo ao Thymeleaf!");
        model.addAttribute("sla", service.findById(UUID.fromString("dbf1ae17-3ead-4324-a723-30daad6c6ca3")));
        return "home";

    }

}

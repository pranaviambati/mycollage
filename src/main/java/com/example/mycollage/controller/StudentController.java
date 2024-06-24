package com.example.mycollage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mycollage.repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/")
    public String index(Model model, @RequestParam(value = "search", required = false) String search) {
        if (search != null) {
            model.addAttribute("students", studentRepository.findByNameContainingIgnoreCase(search));
        } else {
            model.addAttribute("students", studentRepository.findAll());
        }
        return "index";
    }
}

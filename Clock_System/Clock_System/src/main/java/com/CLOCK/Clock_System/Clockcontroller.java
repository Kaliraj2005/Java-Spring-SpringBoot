package com.CLOCK.Clock_System;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ClockController {
    @GetMapping("/")
    public String clockPage() {
        return "clock";
    }
}

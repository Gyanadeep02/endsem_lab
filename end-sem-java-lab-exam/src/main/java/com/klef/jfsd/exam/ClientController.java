package com.klef.jfsd.exam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {
    @RequestMapping("/welcome")
    public String displayGreeting() {
        return "greeting";
    }

    @RequestMapping("/test")
    public String renderTest() {
        return "test";
    }

    @RequestMapping("/showInfo")
    public String displayInfo(@RequestParam("id") int id, @RequestParam("name") String name, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);
        return "info";
    }

    @RequestMapping("/calculateSum/{num1}/{num2}")
    public String calculateSum(@PathVariable int num1, @PathVariable int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        return "result";
    }

    @RequestMapping("/employeeForm")
    public String employeeForm() {
        return "employeeForm";
    }

    @RequestMapping("/addNumbers")
    public String addNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 + num2);
        return "addResult";
    }

    @RequestMapping("/combine")
    public String combineStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("combined", str1 + " " + str2);
        return "combinedResult";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("sum", num1 + num2);
        model.addAttribute("product", num1 * num2);
        return "calculationResult";
    }
}

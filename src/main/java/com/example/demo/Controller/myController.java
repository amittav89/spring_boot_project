package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class myController
{

    @GetMapping("/shavua")
    @ResponseBody
    public String shavua()
    {

        return "Shavua Tov♥";
    }
}

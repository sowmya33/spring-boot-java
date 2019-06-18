package com.hellokoding.springboot.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping({"/", "/caseChange"})
    public String caseChange(Model model, @RequestParam(value="data") String data) {
    	String result ="";
    	String pattern = "^[a-zA-Z]*$";
    	if(!data.matches(pattern) || null == data || data.isEmpty()) {
    		  model.addAttribute("error", "InvalidData");
		} else {
			for (int i = 0; i < data.length(); i++) {
				if (Character.isUpperCase(data.charAt(i))) {
					result += Character.toLowerCase(data.charAt(i));
				} else {
					result += Character.toUpperCase(data.charAt(i));
				}
			}
			// return result;
			model.addAttribute("data", data);
			model.addAttribute("result", result);
		}
       return "hello";
    }
}

package com.juandiii.prueba;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(path = "/index", method = RequestMethod.GET)
    public ModelAndView home() {
        Map<String, String> model = new HashMap<>();
        model.put("hola", "klk");
        ModelAndView modelAndView = new ModelAndView("index", model);
//        modelAndView.addObject("strings", Arrays.asList("sdasdas"));
        return modelAndView;
    }
}

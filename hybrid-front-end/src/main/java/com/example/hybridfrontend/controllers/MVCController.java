/*
 * Federal University of Rio Grande do Norte
 * Department of Informatics and Applied Mathematics
 * Collaborative & Automated Software Engineering (CASE) Research Group
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 *
 *
 * eligere
 * com.example.eligere.controller
 * WelcomeController
 * 19/12/2019
 */
package com.example.hybridfrontend.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Example os spring mvc with thymeleaf controller
 *
 * @author Jadson Santos - jadsonjs@gmail.com
 * @version 1.0
 * @since 19/12/2019 08:50
 */
@Controller
public class MVCController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;


    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("message", message);
        return "welcome"; //view welcome.html
    }

    @GetMapping("/mouths")
    public String getMouths(Model model) {
        MonthForm form = new MonthForm();
        form.setMonths(Arrays.asList("January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December") );
        model.addAttribute("form", form);
        return "welcome"; //view welcome.html
    }

    @PostMapping(value="/submitMouths")
    public String submitMouths(@ModelAttribute MonthForm form, Model model){
        System.out.println(form);
        for ( String mouth: form.getMonths()){
            System.out.println(mouth);
        }
        return "welcome"; //view welcome.html
    }

}


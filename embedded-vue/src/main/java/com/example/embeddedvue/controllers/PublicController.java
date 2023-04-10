/*
 *
 * embedded-vue
 * PublicController
 * @since 10/04/2023
 */
package com.example.embeddedvue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jadson Santos - jadsonjs@gmail.com
 */
@Controller
public class PublicController {

    @RequestMapping({"/public"})
    public String loadPublicUI() {
        return "public/index";
    }

    @RequestMapping({"/login"})
    public String login() {
        return "forward:/login/index.html";
    }
}

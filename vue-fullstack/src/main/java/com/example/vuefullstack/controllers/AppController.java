/*
 * Universidade Federal do Rio Grande do Norte
 * Instituto Metrópole Digital
 * Diretoria de Tecnologia da Informação
 *
 * vue-fullstack
 * AppController
 * @since 29/04/2022
 */
package com.example.vuefullstack.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jadson Santos - jadson.santos@ufrn.br
 */
@Controller
public class AppController {

    /**
     * Public page default to system.
     * This page does not use VUE.js.
     * @return
     */
    @RequestMapping({"/public"})
    public String loadPublicUI() {
        return "forward:/public/index.html";
    }

}

/*
 * embedded-vue
 * ErrorHandlerController
 * @since 10/04/2023
 */
package com.example.embeddedvue.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Jadson Santos - jadsonjs@gmail.com
 */
@Controller
public class ErrorHandlerController implements ErrorController {

    /**
     * Redirect to index.html vue SPA page when do not found the page
     * @param req
     * @return
     */
    @GetMapping("/error")
    public String errorHandler(HttpServletRequest req) {
        int statusCode = (int) req.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        String originalUri = (String) req.getAttribute(RequestDispatcher.ERROR_REQUEST_URI);
        if (statusCode == HttpStatus.NOT_FOUND.value() && ! originalUri.contains("/public/")) {
            return "forward:/index.html";
        }
        return "public/404";
    }
}

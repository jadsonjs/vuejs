/*
 *
 * MIT License
 *
 * Copyright (c) 2018 Jadson Santos
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * MyConfiguration.java
 * 21 de set de 2018
 */
package br.com.jadson.vue.vuebackend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * MyConfiguration.java
 *
 * <p></p>
 *
 * @author Jadson Santos - jadson@info.ufrn.br
 * @version
 * @since
 *  
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 *
 */
@Configuration
public class MyConfiguration {

	/**
	 * Enabling CORS for the whole application 
	 * @return
	 */
	@Bean
    public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {      
        	
			@Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        	
        	
        	//  Apply this CORS configuration to a specific path pattern
        	//
        	//  public void addCorsMappings(CorsRegistry registry) {
        	//   registry.addMapping("/api/**")
        	//  	.allowedOrigins("http://domain2.com")
        	//  	.allowedMethods("PUT", "DELETE")
        	//      .allowedHeaders("header1", "header2", "header3")
        	//      .exposedHeaders("header1", "header2")
        	//   	.allowCredentials(false).maxAge(3600);
        	//  }
        	
        	
        };
    }
	
	

	
}

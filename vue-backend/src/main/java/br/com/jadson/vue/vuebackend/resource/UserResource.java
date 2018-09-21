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
 * UserResource.java
 * 21 de set de 2018
 */
package br.com.jadson.vue.vuebackend.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jadson.vue.vuebackend.model.User;
import br.com.jadson.vue.vuebackend.repository.UserRespository;

/**
 * UserResource.java
 *
 * <p>REST Controller backend for vue front-end</p>
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
@RestController
public class UserResource {
	
	@Autowired
	UserRespository userRepository;
	
	/**
	 * return one user
	 * @param id
	 * @return
	 */
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable(value="id") Long id) {
		return userRepository.findById(id).orElse( new User());
	}
	
	/**
	 * Return all users
	 * @return
	 */
	@GetMapping("/users")
	public List<User> list() {
		return userRepository.findAll();
	}
	
	/**
	 * Create a new user
	 * 
	 * @RequestBody = convert the body of the post to user object
	 * @Valid = valid information annotated with @NotEmpty
	 * 
	 * @param user
	 * @return
	 */
	@PostMapping(path="/user", consumes = MediaType.APPLICATION_JSON_VALUE)
	public User create(@RequestBody @Valid User user) {
		return userRepository.save(user);
	}

}

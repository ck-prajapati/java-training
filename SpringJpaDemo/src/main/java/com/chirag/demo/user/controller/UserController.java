package com.chirag.demo.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chirag.demo.user.dao.UserDao;
import com.chirag.demo.user.repository.User;
import com.chirag.demo.user.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	public UserService userService;

	@Autowired
	public UserDao u;

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public void saveUser() {
		User user = new User();
		user.setUserName("Vishal");
		user.setRollNo(5);

		this.userService.save(user);
	}

	@RequestMapping(value = "/GetByUserName", method = RequestMethod.GET)
	public User getByName() {
		return this.userService.getByName("Chirag");
	}

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public User updateUser() {
		User user = this.userService.getByName("Chirag");

		user.setUserName("Mehul");

		return this.userService.save(user);
	}

	@RequestMapping(value = "/updateById", method = RequestMethod.GET)
	public User updateUser(@RequestParam(name = "uid") int uid, @RequestParam(name = "uname") String uname,
			@RequestParam(name = "rno") int rno) {

		return this.userService.updateUserById(uid, uname, rno);
	}

	@RequestMapping(value = "/getByUserId/{uid}", method = RequestMethod.GET)
	public User getbyUserId(@PathVariable(name = "uid") int uid) {
		System.out.println(uid);
		return this.userService.getByUserId(uid);
	}

	@RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
	public List<User> getAllUser() {
		return this.userService.getAllUser();
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public void deleteUser() {
		this.userService.deleteUser(4);
	}

	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public UserDao Demo() {
		return this.u;
	}
}

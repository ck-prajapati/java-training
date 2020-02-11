package com.chirag.demo.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chirag.demo.user.repository.User;
import com.chirag.demo.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository userRepository;

	public User save(User user) {
		return this.userRepository.save(user);
	}

	public User getByName(String user) {
		return this.userRepository.findByUserName(user);
	}

	public List<User> getAllUser() {
		return this.userRepository.findAll();
	}

	public void deleteUser(Integer uid) {
		this.userRepository.deleteById(uid);
	}

	public User getByUserId(Integer uid) {
		return this.userRepository.findByUid(uid);
	}

	public User updateUserById(int uid, String uname, int rno) {
		User user = this.userRepository.findByUid(uid);
		user.setUserName(uname);
		user.setRollNo(rno);
		return this.userRepository.save(user);
	}

}

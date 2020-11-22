package com.vijayforvictory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@GetMapping(value="/users")
	public List<User> getUsers() {
		List<User> lstUsers = new ArrayList<User>();

		User u1 = new User();
		u1.setId(1);
		u1.setName("Vijay");
		u1.setAge(10);
		u1.setCity("London");

		User u2 = new User();
		u2.setId(2);
		u2.setName("Tom");
		u2.setAge(20);
		u2.setCity("Cardiff");

		lstUsers.add(u1);
		lstUsers.add(u2);

		return lstUsers;
	}
}

package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/load")
	public String loadData() {
		userRepository.deleteAll();
		userRepository.save(new User("1", "Alice", "alice@gmail.com"));
		userRepository.save(new User("2", "Bob", "bob@gmail.com"));
		userRepository.save(new User("3", "Sani", "sani@gmail.com"));
		return "Data loaded successfully!";
	}

	@GetMapping("/users")
	public List<User> listUsers() {
		return userRepository.findAll();
	}
}



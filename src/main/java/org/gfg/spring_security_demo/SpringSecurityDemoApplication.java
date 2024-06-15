package org.gfg.spring_security_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityDemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MyUser myUser1 = MyUser.builder().
				username("user").
				password("$2a$10$yVFGUYUcfkAuSjV.w1otS.ePSTl592VXw/RScGPgQ9vyYxTEeXxiO").
				authorities("DEVELOPER").
				accountNonExpired(true).
				accountNonLocked(true).
				credentialsNonExpired(true).
				enabled(true).
				build();

		MyUser myUser2 = MyUser.builder().
				username("admin").
				password("$2a$10$wgAG71zOIhFVhraodFCaT.kQz8ZJNenUEKEXfhS25ysegdSlAjdTO").
				authorities("ADMIN").
				accountNonExpired(true).
				accountNonLocked(true).
				credentialsNonExpired(true).
				enabled(true).
				build();
		userRepository.save(myUser2);
		userRepository.save(myUser1);

	}
}

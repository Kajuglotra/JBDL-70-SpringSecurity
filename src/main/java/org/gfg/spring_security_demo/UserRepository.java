package org.gfg.spring_security_demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<MyUser, Integer> {

    MyUser findByUsername(String username);
}

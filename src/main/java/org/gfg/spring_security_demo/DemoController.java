package org.gfg.spring_security_demo;

import com.sun.jdi.event.StepEvent;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/developer")
    public String developer(){
        return "developer";
    }
    @GetMapping("/tester")
    public String tester(){
        return "tester";

    }@GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/developer/{name}")
    public String developerWithName(@PathVariable("name") String name){
        MyUser user = (MyUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return user.getUsername();
    }


    @PostMapping("/security/postRequest")
    public String postMethodDemo(){
        return "post method demo";
    }

}

package com.spring.springsecurity.DB;

import com.spring.springsecurity.Model.Authorities;
import com.spring.springsecurity.Model.Role;
import com.spring.springsecurity.Model.User;
import com.spring.springsecurity.Repository.AuthoritiesRepository;
import com.spring.springsecurity.Repository.RoleRepository;
import com.spring.springsecurity.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class DBInit implements CommandLineRunner {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private AuthoritiesRepository authoritiesRepository;


    public DBInit(UserRepository userRepository ,AuthoritiesRepository authoritiesRepository, RoleRepository roleRepository){
      this.userRepository=userRepository;
      this.authoritiesRepository=authoritiesRepository;
      this.roleRepository=roleRepository;


    }
    @Override
    public void run(String... args) throws Exception {
        User user=new User("ahmed","ahmed123","20","alex",1);
        user.setRoles( this.roleRepository.findAll());
        user.setAuthorities( this.authoritiesRepository.findAll());
        userRepository.save(user);
    }
}

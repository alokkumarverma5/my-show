package com.example.my_show.service;

import com.example.my_show.dto.Registerdto;
import com.example.my_show.entity.Register;
import com.example.my_show.entity.Roles;
import com.example.my_show.repo.Registerrepo;
import com.example.my_show.repo.Rolesrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class Mainservice {

    @Autowired
    private Rolesrepo rolesrepo;
    @Autowired
    private Registerrepo registerrepo;


    // this si register service
    public String registers(Registerdto registerdto){
        Register register = new Register();
        register.setName(registerdto.getName());
        register.setNumber(registerdto.getNumber());
        register.setEmail(registerdto.getEmail());
        register.setPassword(registerdto.getPassword());
        Set<Roles> roles1 = new HashSet<>();
        Roles roles = rolesrepo.findByRolename("user");
        if(roles == null){
            roles = new Roles();
            roles.setRolename("user");
            rolesrepo.save(roles);
        }
        roles1.add(roles);
        register.setRoles(roles1);
        registerrepo.save(register);
        return "register save";
    }


    // this si login service
    public String logins(Registerdto registerdto){

        return "user not found";
    }

}

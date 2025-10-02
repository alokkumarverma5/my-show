package com.example.my_show.repo;

import com.example.my_show.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rolesrepo extends JpaRepository<Roles,Long> {
    Roles findByRolename(String user);
}

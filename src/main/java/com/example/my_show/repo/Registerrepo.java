package com.example.my_show.repo;

import com.example.my_show.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Registerrepo extends JpaRepository<Register ,Long> {
    Register findByNumber(Long number);
}

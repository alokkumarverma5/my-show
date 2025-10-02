package com.example.my_show.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Registerdto {
    private String name;
    private Long number;
    private String email;
    private String password;
}

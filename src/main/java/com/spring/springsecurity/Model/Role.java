package com.spring.springsecurity.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Data
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "role_name")
    private String roleName;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;




    public Role() {
    }
}

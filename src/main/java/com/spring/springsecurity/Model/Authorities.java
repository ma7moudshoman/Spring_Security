package com.spring.springsecurity.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Data
@Entity
@Table(name = "authorities")
public class Authorities {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private  long id;
@Column(name = "authorities_name")
    private String authoritiesName;
    @ManyToMany(mappedBy = "authorities")

    private List<User> users;





    public Authorities() {
    }
}

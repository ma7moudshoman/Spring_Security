package com.spring.springsecurity.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
@Entity
@Data
@Table(name = "user")
public class User    {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
@Column(name = "user_name")
    private  String userName;

    @Column(name = "Password")
    private  String Password;

    @Column(name = "age")
    private  String age;

    @Column(name = "address")
    private String address;

    @Column(name = " active")
    private int active;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns  ={@JoinColumn(name = "role_id")}
    )
    private List<Role> roles;
    @ManyToMany(fetch = FetchType.LAZY )
    @JoinTable(
            name = "user_authorities",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns  ={@JoinColumn(name = "authorities_id")}
    )
    private List<Authorities> authorities ;

    public User(String userName, String password, String age, String address, int active) {
        this.userName = userName;
        this.Password = password;
        this.age = age;
        this.address = address;
        this.active = active;
    }
    public User(){

    }
}

package com.spring.springsecurity.Repository;

import com.spring.springsecurity.Model.Authorities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities,Long> {
}
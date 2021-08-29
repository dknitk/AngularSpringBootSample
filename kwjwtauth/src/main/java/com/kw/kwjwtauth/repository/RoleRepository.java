package com.kw.kwjwtauth.repository;

import com.kw.kwjwtauth.entity.Role;
import com.kw.kwjwtauth.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

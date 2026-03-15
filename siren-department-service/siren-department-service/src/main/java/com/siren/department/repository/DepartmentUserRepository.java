package com.siren.department.repository;

import com.siren.department.entity.DepartmentUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentUserRepository extends JpaRepository<DepartmentUser, Long> {

    Optional<DepartmentUser> findByUsername(String username);

}
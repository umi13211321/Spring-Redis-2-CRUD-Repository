package com.umesh.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.umesh.demo.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

    List<User> findByFirstName(String firstName);

    List<User> findByMiddleNameContains(String firstName);

    List<User> findByRole_RoleName(String roleName);
}
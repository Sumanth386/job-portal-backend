package com.sumanth.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumanth.jobportal.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
package com.Aman.Oauth2Security.repository;

import com.Aman.Oauth2Security.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Long> {
    Users findByUserName(String userName);
}

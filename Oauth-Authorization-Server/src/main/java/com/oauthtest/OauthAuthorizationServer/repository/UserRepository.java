package com.oauthtest.OauthAuthorizationServer.repository;

import com.oauthtest.OauthAuthorizationServer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}

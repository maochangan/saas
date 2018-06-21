package com.sxhy.saas.repo.user;

import com.sxhy.saas.entity.simpleuser.SimpleUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleUserResJpa extends JpaRepository<SimpleUser,Integer>{

}

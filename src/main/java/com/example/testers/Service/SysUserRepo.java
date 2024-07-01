package com.example.testers.Service;

import com.example.testers.BASE.SysUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface SysUserRepo extends MongoRepository<String, SysUser> {

    Optional<SysUser> findByUserId(String userId);

    SysUser findByuserId(String Userid);
}

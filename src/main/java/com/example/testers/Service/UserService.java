package com.example.testers.Service;

import com.example.testers.BASE.SysUser;
import jakarta.annotation.Resource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public  class UserService   {

    @Resource
    private SysUserRepo sysUserRepo;

    @Resource
    private PasswordEncoder passwordEncoder;

    public boolean authenticateUser(String username, String password) {
        Optional<SysUser> UserOptional = this.sysUserRepo.findByUserId(username);
        if (UserOptional.isPresent()) {
            SysUser User = UserOptional.get();
            return passwordEncoder.matches(password, User.getPw());
        }
        return false;
    }

    public SysUser findUser(String username){
        return this.sysUserRepo.findByuserId(username);
    }
}

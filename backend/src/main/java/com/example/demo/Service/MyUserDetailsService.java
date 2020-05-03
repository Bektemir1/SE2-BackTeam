package com.example.demo.Service;

import com.example.demo.Models.Users;
import com.example.demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    // Change user password
    public String changePassword(MyUserDetails myUserDetails, String newPassword, String newPassword1, String oldPassword) {
        if (oldPassword.equals(myUserDetails.getPassword())) {
            if (oldPassword.equals(newPassword)) {
                return "New password cannot be the same as the old";
            } else if (!newPassword.equals(newPassword1)) {
                return "Passwords mismatches";
            } else if (newPassword.length() < 8) {
                return "New password too short";
            } else if (!newPassword.matches(".*")) {
                return "New password must contain at least 1 number";
            } else {
                Users users = userRepository.findById(myUserDetails.getId()).get();
                users.setPassword(newPassword);
                userRepository.save(users);
                return "Password has been successfully changed";
            }
        } else {
            return "Password is wrong";
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> user = userRepository.findByUsername(username);

        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + username));

        return user.map(MyUserDetails::new).get();
    }
}

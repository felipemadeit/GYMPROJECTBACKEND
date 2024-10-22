package com.gymsoftware.service;

import com.gymsoftware.repository.UserRepository;
import org.apache.catalina.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UsuarioServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }


    // Metodo para guardar nuevos usuarios
    public void saveUser (@NotNull User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = (User) userRepository.findByName(name);
        if(user == null) {
            System.out.println("User or password incorrect");
            throw new UsernameNotFoundException("User or password incorrect");
        }

        User user1 = new User(user.getName(), user.getPassword());
        return user1;

    }
}

package com.brilhador.project.configuration.security;


import java.util.Date;

import com.brilhador.project.models.base.User;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import static java.lang.String.format;

@Component
public class JwtTokenUtil {

    private final String jwtSecret = "brilhador";
    private final String jwtIssuer = "com.brilhador.project";


    public String generateToken(User user) {
        return Jwts.builder()
                .setSubject(format("%s", user.toString()))
                .setIssuer(jwtIssuer)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600)) // 1 hour
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public String generateRefreshToken(User user) {
        return Jwts.builder()
                .setSubject(format("%s", user.toString()))
                .setIssuer(jwtIssuer)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 24 * 365)) // 1 year
                .signWith(SignatureAlgorithm.HS512, jwtSecret)
                .compact();
    }

    public User parseToken(String token) {
        return new User();
    }

    public boolean validateToken(String token) {
        return true;
    }

    public String getEmail(String token) {
        return "";
    }
}

package com.wss.blog.service;

import com.wss.blog.domain.Authority;
import com.wss.blog.repository.AuthorityRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * AuthorityService 实现
 * @author xiaobiaodi
 * @create 2018-06-08 12:38
 **/
@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepositiory authorityRepositiory;

    @Override
    public Optional<Authority> getAuthorityById(Long id) {
        return authorityRepositiory.findById(id);
    }
}

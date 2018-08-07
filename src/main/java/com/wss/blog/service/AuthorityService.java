package com.wss.blog.service;

import com.wss.blog.domain.Authority;

import java.util.Optional;

/**
 * @author xiaobiaodi
 * @create 2018-06-08 12:36
 **/
public interface AuthorityService {

    /**
     * 根据id查询Authority
     * @param id
     * @return
     */
    Optional<Authority> getAuthorityById(Long id);
}

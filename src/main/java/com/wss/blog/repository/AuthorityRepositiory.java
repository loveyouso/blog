package com.wss.blog.repository;

import com.wss.blog.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Authority  仓库
 * @author xiaobiaodi
 * @create 2018-06-08 12:12
 **/
public interface AuthorityRepositiory extends JpaRepository<Authority,Long>{
}

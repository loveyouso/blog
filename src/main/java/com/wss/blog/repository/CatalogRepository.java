package com.wss.blog.repository;

import com.wss.blog.domain.Catalog;
import com.wss.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xiaobiaodi
 * @create 2018-06-10 21:18
 **/
public interface CatalogRepository extends JpaRepository<Catalog,Long>{

    /**
     * 根据用户查询
     * @param user
     * @return
     */
    List<Catalog> findByUser(User user);

    /**
     * 根据用户、分类名称查询
     * @param user
     * @param name
     * @return
     */
    List<Catalog> findByUserAndName(User user,String name);
}

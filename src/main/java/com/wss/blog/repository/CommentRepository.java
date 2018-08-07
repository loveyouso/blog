package com.wss.blog.repository;

import com.wss.blog.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaobiaodi
 * @create 2018-06-10 17:26
 **/
public interface CommentRepository extends JpaRepository<Comment,Long> {

}

package com.wss.blog.repository;

import com.wss.blog.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaobiaodi
 * @create 2018-06-10 19:29
 **/
public interface VoteRepository extends JpaRepository<Vote,Long> {

}

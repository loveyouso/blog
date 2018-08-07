package com.wss.blog.service;

import com.wss.blog.domain.Vote;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author xiaobiaodi
 * @create 2018-06-10 19:29
 **/
public interface VoteService {
    /**
     * 根据id获取 Vote
     * @param id
     * @return
     */
    Optional<Vote> getVoteById(Long id);
    /**
     * 删除Vote
     * @param id
     * @return
     */
    void removeVote(Long id);
}

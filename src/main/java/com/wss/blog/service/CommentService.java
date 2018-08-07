package com.wss.blog.service;

import com.wss.blog.domain.Comment;

import java.util.Optional;

/**
 * @author xiaobiaodi
 * @create 2018-06-10 17:28
 **/
public interface CommentService {
    /**
     * 根据id获取 Comment
     * @param id
     * @return
     */
    Optional<Comment> getCommentById(Long id);
    /**
     * 删除评论
     * @param id
     * @return
     */
    void removeComment(Long id);
}

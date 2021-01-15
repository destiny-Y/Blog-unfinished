package service;

import domain.Comment;

/**
 * Comment服务接口
 */
public interface CommentService {

    /**
     * 根据ID获取Comment
     */
    Comment getCommentById(Long id);

    /**
     * 删除评论
     */
    void removeComment(Long id);
}
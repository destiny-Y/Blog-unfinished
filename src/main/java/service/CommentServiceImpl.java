package service;

import domain.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CommentRepository;


/**
 * Comment服务接口实现
 */
@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment getCommentById(Long id) {
        return (Comment) commentRepository.getOne(id);//return commentRepository.getOne(id);
    }

    @Override
    public void removeComment(Long id) {
        commentRepository.deleteById(id);
    }
}
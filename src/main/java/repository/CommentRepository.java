package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;

/**
 * Comment仓库
 */
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
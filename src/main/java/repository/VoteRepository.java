package repository;

import domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 点赞仓库接口
 */
public interface VoteRepository extends JpaRepository<Vote,Long> {
}
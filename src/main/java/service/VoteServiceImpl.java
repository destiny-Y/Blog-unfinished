package service;

import domain.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.VoteRepository;

/**
 * Vote服务接口实现类
 */
@Service
public class VoteServiceImpl implements VoteService{
    @Autowired
    private VoteRepository voteRepository;

    /**
     * 根据id获取Vote
     */
    @Override
    public Vote getVoteById(Long id) {
        return voteRepository.getOne(id);
    }

    /**
     * 删除Vote
     */
    @Override
    public void removeVote(Long id) {
        voteRepository.deleteById(id);
    }
}
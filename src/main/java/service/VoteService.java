package service;

import domain.Vote;

/**
 * Vote服务接口
 */
public interface VoteService {

    /**
     * 根据id获取Vote
     */
    Vote getVoteById(Long id);

    /**
     * 删除Vote
     */
    void removeVote(Long id);
}
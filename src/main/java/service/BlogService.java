package service;

import domain.Blog;
import domain.Catalog;
import domain.User;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

/**
 * Blog服务接口
 */
public interface BlogService {
    /**
     * 保存Blog
     */
    Blog saveBlog(Blog blog);

    /**
     * 删除Blog
     */
    void removeBlog(Long id);

    /**
     * 更新Blog
     */
    Blog updateBlog(Blog blog);

    /**
     * 根据id获取Blog
     */
    Blog getBlogById(Long id);

    /**
     * 根据用户名进行分页模糊查询（最新）
     */
    Page<Blog> listBlogsByTitleLike(User user, String title, Pageable pageable);

    /**
     * 根据用户名进行分页模糊查询（最热）
     */
    Page<Blog> listBlogsByTitleLikeAndSort(User user, String title, Pageable pageable);

    /**
     * 阅读量递增
     */
    void readingIncrease(Long id);

    /**
     * 发表评论
     */
    Blog createComment(Long blogId, String commentContent);

    /**
     * 删除评论
     */
    void removeComment(Long blogId, Long commentId);

    /**
     * 点赞
     */
    Blog createVote(Long blogId);

    /**
     * 取消点赞
     */
    void removeVote(Long blogId,Long voteId);

    /**
     * 根据分类进行查询
     */
    Page<Blog> listBlogsByCatalog(Catalog catalog, Pageable pageable);
}
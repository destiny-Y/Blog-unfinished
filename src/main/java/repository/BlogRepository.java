package repository;

import domain.Blog;
import domain.Catalog;
import domain.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Blog 仓库.
 */
public interface BlogRepository extends JpaRepository<Blog, Long> {
    /**
     * 根据用户名分页查询用户列表（最新）
     * 由 findByUserAndTitleLikeOrTagsLikeOrderByCreateTimeDesc 代替，可以根据标签进行查询
     */
    @Deprecated
    Page<Blog> findByUserAndTitleLikeOrderByCreateTimeDesc(User user, String title, Pageable pageable);

    /**
     * 根据用户名分页查询用户列表
     */
    Page<Blog> findByUserAndTitleLike(User user, String title, Pageable pageable);

    /**
     * 根据用户名分页查询用户列表
     */
    //Page<Blog> findByTitleLikeAndUserOrTagsLikeAndUserOrderByCreateTimeDesc(String title,User user,String tags,User user2,Pageable pageable);
    /**
     * 根据用户名分页查询用户列表
     */
    Page<Blog> findByCatalog(Catalog catalog, Pageable pageable);
}
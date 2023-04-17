package edu.uet.social.repository;

import edu.uet.social.entity.Comment;
import edu.uet.social.entity.Post;
import edu.uet.social.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    void deleteByEmail(String email);

    List<User> findUsersByFollowerUsers(User user, Pageable pageable);

    List<User> findUsersByFollowingUsers(User user, Pageable pageable);

    List<User> findUsersByLikedPosts(Post post, Pageable pageable);

    List<User> findUsersByLikedComments(Comment comment, Pageable pageable);

    void getAllUsers();


}

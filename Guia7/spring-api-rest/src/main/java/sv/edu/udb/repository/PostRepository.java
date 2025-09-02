package sv.edu.udb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.domain.Post;

@Repository
public interface PostRepository extends JpaRepository <Post, Long> {
}
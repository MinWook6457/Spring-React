package hello.hellospring.user.domain.repository;

import java.util.Optional;
import hello.hellospring.user.domain.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user,Long> {
    Optional<user> findByEmail(String email);
    boolean existsByEmail(String email);
}

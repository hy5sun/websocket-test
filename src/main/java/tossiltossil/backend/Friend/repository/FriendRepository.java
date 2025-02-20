package tossiltossil.backend.Friend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tossiltossil.backend.Friend.domain.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Long> {
}

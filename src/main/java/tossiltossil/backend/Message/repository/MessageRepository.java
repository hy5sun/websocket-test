package tossiltossil.backend.Message.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tossiltossil.backend.Message.domain.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}

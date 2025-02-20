package tossiltossil.backend.Message.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tossiltossil.backend.common.domain.BaseTimeEntity;

import java.util.UUID;

@Table(name="message")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Message extends BaseTimeEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private UUID memberId;

    @Builder
    public Message(UUID memberId, String content) {
        this.content = content;
        this.memberId = memberId;
    }
}

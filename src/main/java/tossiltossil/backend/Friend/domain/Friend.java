package tossiltossil.backend.Friend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tossiltossil.backend.common.domain.BaseTimeEntity;

import java.util.UUID;

@Table(name="friends")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Friend extends BaseTimeEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private UUID memberId;

    @Column(nullable = false)
    private UUID friendId;

    @Builder
    public Friend(UUID memberId, UUID friendId) {
        this.memberId = memberId;
        this.friendId = friendId;
    }
}

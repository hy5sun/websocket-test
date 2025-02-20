package tossiltossil.backend.Friend.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tossiltossil.backend.common.domain.BaseTimeEntity;

import java.util.UUID;

@Table(name="friend_request")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FriendRequest extends BaseTimeEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private UUID to;

    @Column(nullable = false)
    private UUID from;

    @Builder
    public FriendRequest(UUID to, UUID from) {
        this.to = to;
        this.from = from;
    }
}

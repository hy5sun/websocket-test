package tossiltossil.backend.Member.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import tossiltossil.backend.common.domain.BaseTimeEntity;

import java.util.UUID;

@Table(name="member")
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseTimeEntity {
    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nickname;

    @Builder
    public Member(String nickname) {
        this.nickname = nickname;
    }
}

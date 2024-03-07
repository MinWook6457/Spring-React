package hello.hellospring.user;

import hello.hellospring.user.entity.authority;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@Table(name="User")
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="email" , nullable=false)
    private String email;

    @Column(name="password" , nullable=false)
    private String password;

    @Enumerated(EnumType.STRING)
    private authority authority;
    public void setPassword(String password) { this.password = password; }
    @Builder
    public Member(Long id, String email, String password,
                authority authority) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.authority = authority;
    }

}

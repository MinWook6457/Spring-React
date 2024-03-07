package hello.hellospring.user.domain;

import hello.hellospring.user.domain.entity.authority;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

@Entity
@Getter
@Builder
@Table(name="User")
@NoArgsConstructor
public class User {
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
    public User(Long id, String email, String password,
                authority authority) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.authority = authority;
    }

    public User(String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
}

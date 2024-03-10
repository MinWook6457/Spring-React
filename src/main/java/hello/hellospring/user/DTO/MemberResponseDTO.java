package hello.hellospring.user.DTO;

import hello.hellospring.user.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberResponseDTO {
    private String email;
    public static MemberResponseDTO of(Member member) {
        return MemberResponseDTO.builder()
                .email(member.getEmail())
                .build();
    }
}

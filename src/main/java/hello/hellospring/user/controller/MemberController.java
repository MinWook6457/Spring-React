package hello.hellospring.user.controller;

import hello.hellospring.user.DTO.ChangePasswordRequestDTO;
import hello.hellospring.user.DTO.MemberResponseDTO;
import hello.hellospring.user.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member")
    public ResponseEntity<MemberResponseDTO> getMyMemberInfo() {
        MemberResponseDTO myInfoBySecurity = memberService.getMyInfoBySecurity();
        System.out.println(myInfoBySecurity.getEmail());
        return ResponseEntity.ok((myInfoBySecurity));
        // return ResponseEntity.ok(memberService.getMyInfoBySecurity());
    }

    @PostMapping("/password")
    public ResponseEntity<MemberResponseDTO> setMemberPassword(@RequestBody ChangePasswordRequestDTO request) {
        return ResponseEntity.ok(memberService.changeMemberPassword(request.getEmail(),request.getExPassword(), request.getNewPassword()));
    }

}
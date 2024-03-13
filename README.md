### Spring Security 구현

### API 명세서
| Method |   기능   |   REST API   |       설명        |                                                      Request                                                       |                                       Response                                        |
|:------:|:------:|:------------:|:---------------:|:------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------:|
|POST| 회원가입 | /auth/signup | Spring Security | MemberRequestDTO : <br> { "email" : "token-test3@naver.com", <br> "password" : "test33", <br>"nickname" : "닉네임3" } | MemberResponseDTO : <br> { "email": "token-test3@naver.com",<br> "nickname": "닉네임3" } |

![image](https://github.com/MinWook6457/Spring-Security/assets/103114126/c33894ec-0d4b-42c4-9794-bbe263816a90)

### 
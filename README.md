### Spring Security 구현 + JWT

#### 회원가입
| Method |   기능   |   REST API   |                                                      Request                                                       |                                       Response                                        |
|:------:|:------:|:------------:|:------------------------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------:|
|POST| 회원가입 | /auth/signup | MemberRequestDTO : <br> { "email" : "token-test3@naver.com", <br> "password" : "test33", <br>"nickname" : "닉네임3" } | MemberResponseDTO : <br> { "email": "token-test3@naver.com",<br> "nickname": "닉네임3" } |

![image](https://github.com/MinWook6457/Spring-Security/assets/103114126/c33894ec-0d4b-42c4-9794-bbe263816a90)

#### 로그인
| Method | 기능  | REST API | Request |                                                                                                                                  Response                                                                                                                                  |
|:------:|:---:|:--------:|:-------:|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|  POST  |로그인|/auth/login/|  MemberRequestDTO : <br> { "email" : "token-test3@naver.com", <br>"password" : "test33", <br>"nickname" : "닉네임3" } | TokenDTO : { "grantType": "bearer", <br>"accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIzIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTcxMDI5Nzg5NH0.1CKQXy2aJnaxdjQgWKCkkpLwajE9XNODyu_LS-qLW1blSrWGKOzNPpDxZkUAdA3ZC7OjLWR7BdH9odVmTXs-QQ", <br>"tokenExpiresIn": 1710297894971} |
![image](https://github.com/MinWook6457/Spring-Security/assets/103114126/3fa70371-ff96-4943-86e8-09b08be6a74d)

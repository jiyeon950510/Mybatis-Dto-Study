package shop.mtcoding.mybatis_dto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString // 테스트 해보려고 붙임! dto 에는 막 붙여도 됨
public class BoardJoinUserDtoV1Flattern { // db 에서 조회할 데이터들
    private Integer id;
    private String title;
    private String content;
    private Timestamp createdAt;

    private Integer userId;
    private String userUsername;
    private String userPassword;
    private String userEmail;
    private Timestamp userCreatedAt;
}

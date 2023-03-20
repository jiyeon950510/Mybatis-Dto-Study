package shop.mtcoding.mybatis_dto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;
}

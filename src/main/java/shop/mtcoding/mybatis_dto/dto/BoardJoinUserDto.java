package shop.mtcoding.mybatis_dto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardJoinUserDto {
    private BoardDto board;
    private UserDto user;
}

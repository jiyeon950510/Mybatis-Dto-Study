package shop.mtcoding.mybatis_dto.model.board;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.mybatis_dto.model.user.User;

@Getter
@Setter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private int userId;
    private Timestamp createdAt;
}

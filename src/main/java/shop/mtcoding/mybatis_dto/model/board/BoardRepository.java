package shop.mtcoding.mybatis_dto.model.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV1Flattern;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV3;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public BoardJoinUserDtoV1Flattern findByIdJoinUserV1(int id);

    public BoardJoinUserDtoV2 findByIdJoinUserV2(int id);

    public BoardJoinUserDtoV3 findByIdJoinUserV3(int id);
}
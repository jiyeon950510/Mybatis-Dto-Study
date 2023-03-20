package shop.mtcoding.mybatis_dto.model.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.mtcoding.mybatis_dto.dto.BoardDetailOutDto;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDto;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDto2;

@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public BoardDetailOutDto findByIdJoinUser(int id);

    public BoardJoinUserDto findByIdJoinUser2(int id);

    public BoardJoinUserDto2 findByIdJoinUser3(int id);
}
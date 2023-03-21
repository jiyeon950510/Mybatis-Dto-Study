package shop.mtcoding.mybatis_dto.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV1;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV1Flattern;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV3;
import shop.mtcoding.mybatis_dto.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardJoinUserDtoV1 게시글상세보기V1(Integer id) {
        BoardJoinUserDtoV1Flattern flatDto = boardRepository.findByIdJoinUserV1(id);
        System.out.println("디버그 : " + flatDto);
        BoardJoinUserDtoV1 ormDto = new BoardJoinUserDtoV1(flatDto);
        System.out.println("디버그 : " + ormDto);
        return ormDto;
    }

    public BoardJoinUserDtoV2 게시글상세보기V2(Integer id) {
        BoardJoinUserDtoV2 ormDto = boardRepository.findByIdJoinUserV2(id);
        System.out.println("디버그 : " + ormDto);
        return ormDto;
    }

    public BoardJoinUserDtoV3 게시글상세보기V3(Integer id) {
        BoardJoinUserDtoV3 ormDto = boardRepository.findByIdJoinUserV3(id);
        System.out.println("디버그 : " + ormDto);
        return ormDto;
    }

}

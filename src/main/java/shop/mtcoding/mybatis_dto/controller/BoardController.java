package shop.mtcoding.mybatis_dto.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV1;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatis_dto.dto.BoardJoinUserDtoV3;
import shop.mtcoding.mybatis_dto.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board/v1/{id}")
    public ResponseEntity<?> detailV1(@PathVariable Integer id) {
        BoardJoinUserDtoV1 ormDto = boardService.게시글상세보기V1(id);
        return ResponseEntity.ok().body(ormDto);
    }

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id) {
        BoardJoinUserDtoV2 ormDto = boardService.게시글상세보기V2(id);
        return ResponseEntity.ok().body(ormDto);
    }

    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detailV3(@PathVariable Integer id) {
        BoardJoinUserDtoV3 ormDto = boardService.게시글상세보기V3(id);
        return ResponseEntity.ok().body(ormDto);
    }
}

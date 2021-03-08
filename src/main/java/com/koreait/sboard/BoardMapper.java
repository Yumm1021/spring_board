package com.koreait.sboard;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.koreait.sboard.model.BoardEntity;

@Mapper
public interface BoardMapper { //public abstract가 무조건 들어가있음 >> 생략해도 됨 // interface는 추상메서드를 가지고 있음 구현부가 없어야 함 !! 인터페이스는 객체화 안돼 
	List<BoardEntity> selBoardList();
	int insBoard(BoardEntity p);
	BoardEntity selBoard(BoardEntity p); 
	int updBoard(BoardEntity p);
	int delBoard(BoardEntity p);
}

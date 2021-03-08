package com.koreait.sboard;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.koreait.sboard.model.BoardEntity;

@Service //bean 등록
public class BoardService { // Service 실제로 수행되는 로직 담당
	
	@Autowired //String이 bean 등록한 거 중에 BoardMapper 타입이 가리킬 수 있는 게 있으면 mapper에 주소값을 저장할 수 있는 객체가 있다면 주소값을 자동으로 넣어라
	private BoardMapper mapper;
	
	public List<BoardEntity> selBoardList() {
		return mapper.selBoardList();
	}
	
	public int insBoard(BoardEntity p) {
		return mapper.insBoard(p);
	}
	
	public BoardEntity selBoard(BoardEntity p) {
		return mapper.selBoard(p);
	}
	
	public int delBoard(BoardEntity p) {
		return mapper.delBoard(p);
	}
	
	public int updBoard(BoardEntity p) {
		return mapper.updBoard(p);
	}
	
	
}

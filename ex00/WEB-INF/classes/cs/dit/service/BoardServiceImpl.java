package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.BoardVO;
import cs.dit.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService { 
	private final BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		log.info("getList.............");
		return mapper.getList();
	}
	
	
}

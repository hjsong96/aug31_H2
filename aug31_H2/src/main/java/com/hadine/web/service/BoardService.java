package com.hadine.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadine.web.dao.BoardDAO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;

	public List<Map<String, Object>> list() {
		return boardDAO.list();
	}
	
}

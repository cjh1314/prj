package com.board.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.domain.BoardDTO;
import com.board.service.BoardService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"1. Board"}) // 이 부분이 swagger-ui.html 에 나오는 제목겸 순서입니다.
@RestController
@RequestMapping(value = "/api/board")
@Slf4j
public class BoardController {

	@Autowired
	private BoardService boardService;

	@GetMapping(value = "/write.do")
	public String write(Model model) {
		log.debug("/api/board/write init...");

		return "board/write";
	}

	
	@GetMapping("/jsonTest")
	public Object jsonTest() {
		log.debug("/api/board/jsonTest init...");
		BoardDTO board = new BoardDTO();
		board.title = "preword";
		board.content = "hello-bryan";
		return board;
	}
	
	
	@GetMapping("/gsonTest")
	public String gsonTest() {
		
		log.debug("/api/board/gsonTest init...");
		JsonObject jo = new JsonObject();
		
		jo.addProperty("projectName", "preword");
		jo.addProperty("author", "hello-bryan");
		jo.addProperty("createdDate", new Date().toString());
		
		JsonArray ja = new JsonArray();
		for(int i=0; i<5; i++) {
			JsonObject jObj = new JsonObject();
			jObj.addProperty("prop"+i, i);
			ja.add(jObj);
		}
		
		jo.add("follower", ja);
		
		return jo.toString();
	}
	
}
package com.gn.dto;

import lombok.Data;

@Data
public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private int boardWriter;
	
	private String regDate;
	private String modDate;
}

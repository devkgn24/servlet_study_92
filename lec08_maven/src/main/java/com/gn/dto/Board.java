package com.gn.dto;

import com.gn.common.vo.Paging;

import lombok.Data;

@Data
public class Board extends Paging{
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private int boardWriter;
	
	private String regDate;
	private String modDate;
	
	private String memberId;
}

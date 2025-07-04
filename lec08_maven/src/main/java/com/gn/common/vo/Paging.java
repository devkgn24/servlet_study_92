package com.gn.common.vo;

public class Paging {
	// 1. 전체 게시글 개수
	private int totalData;
	
	// 2. 전체 페이지 개수
	private int totalPage;
	
	// 3. 페이징바 구성에 필요한 정보
	// (1) 페이징바 크기
	private int pageBarSize = 5;
	// (2) 현재 페이징바 시작 숫자
	private int pageBarStart;
	// (3) " 마지막 숫자
	private int pageBarEnd;
}

package com.workwith.vo;

public class BoardVO {
	private String boardNum;
    private String boardTitle;
    private String boardContent;
    private String boardDate;
    private String boardVisit;
    
	public BoardVO() {
		super();
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", boardDate=" + boardDate + ", boardVisit=" + boardVisit + "]";
	}
	
	public String getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(String boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}
	public String getBoardVisit() {
		return boardVisit;
	}
	public void setBoardVisit(String boardVisit) {
		this.boardVisit = boardVisit;
	}
    
   
    
    
}

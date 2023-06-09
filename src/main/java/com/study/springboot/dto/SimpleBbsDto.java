package com.study.springboot.dto;

import lombok.Data;

@Data
public class SimpleBbsDto {
    private int id;
    private String writer;
    private String title;
    private String content;
    
    public SimpleBbsDto() {}
	public SimpleBbsDto(int id, String writer, String title, String content) {
		super();
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
    
    
}

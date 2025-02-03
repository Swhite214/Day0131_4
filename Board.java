package com.kh.dto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Board  implements Serializable{

	private String title;
	private String content;
	
	public Board() {
		
	}
	
	public Board(String title, String content) {
		this.title=title;
		this.content=content;
				
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Title: " + title + ", Content: " + content; //이부분 틀렸었음
	}
	public void save(String fileName) {
		Board b = new Board("안녕하세요","반갑습니다.");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(b);
			System.out.println("객체가 파일에 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}

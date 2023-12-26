package com.example.demo.model.vm;

import lombok.Data;

@Data
public class Asset {
	private byte[] content;
	private String contentType;
	
	public Asset(byte[] content, String contentType) {
		super();
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	
	
}

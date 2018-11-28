package com.rodrigo.sipriano.PersonalWebsite.contentService;

public class ContentService {
	
	private final long id;
	private final String content;
	
	public ContentService(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
}

package com.mtxc.universallistview.demo;

/**
 *   ≈‰∆˜ ˝æ›¿‡
 */
public class Data {
	
	private int headImage;
	
	public Data(int headImage, String name, String blog, int praise,
			int browse, int comment) {
		this.headImage = headImage;
		this.name = name;
		this.blog = blog;
		this.praise = praise;
		this.browse = browse;
		this.comment = comment;
	}

	private String name;
	
	private String blog;
	
	private int praise;
	
	private int browse;
	
	private int comment;

	public int getHeadImage() {
		return headImage;
	}

	public void setHeadImage(int headImage) {
		this.headImage = headImage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBlog() {
		return blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public int getPraise() {
		return praise;
	}

	public void setPraise(int praise) {
		this.praise = praise;
	}

	public int getBrowse() {
		return browse;
	}

	public void setBrowse(int browse) {
		this.browse = browse;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}
	
}

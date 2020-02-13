package com.scrum.Library.domain;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

//图书的编目工作
@SuppressWarnings("serial")
public class BookClass implements Serializable{
	private String bkCatalog;//分类号
	private String bkClassName;//分类名
	@NotBlank(message="不能为空")
	public String getBkCatalog() {
		return bkCatalog;
	}
	public void setBkCatalog(String bkCatalog) {
		this.bkCatalog = bkCatalog;
	}
	@NotBlank(message="不能为空")
	public String getBkClassName() {
		return bkClassName;
	}
	public void setBkClassName(String bkClassName) {
		this.bkClassName = bkClassName;
	}
	
	

}

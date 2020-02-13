package com.scrum.Library.mybatis;

import java.util.List;

import com.scrum.Library.domain.Book;
import com.scrum.Library.parameter.Parameter;

//图书接口
public interface BookMapper {
	public int insertBook(Book book);
	public List<Book>selectBook(Parameter parameter);
	public int deleteBookByID(String bkID);
	public int updateBookByID(Book book);
	public int getCounts(Parameter parameter);
}

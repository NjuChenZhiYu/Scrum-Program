package com.scrum.Library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scrum.Library.domain.Book;
import com.scrum.Library.mybatis.BookMapper;
import com.scrum.Library.parameter.Parameter;

//图书管理服务层
@Service
public class BookService {
	@Autowired
	private BookMapper bookMapper;
	@Transactional(propagation=Propagation.REQUIRED)
	public int insertBook(Book book)
	{
		return this.bookMapper.insertBook(book);
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<Book>selectBook(Parameter parameter)
	{
		return this.bookMapper.selectBook(parameter);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public int deleteBookByID(String bkID)
	{
		return this.bookMapper.deleteBookByID(bkID);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateBookByID(Book book)
	{
		return this.bookMapper.updateBookByID(book);
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public int getCounts(Parameter parameter)
	{
		return this.bookMapper.getCounts(parameter);
	}
}

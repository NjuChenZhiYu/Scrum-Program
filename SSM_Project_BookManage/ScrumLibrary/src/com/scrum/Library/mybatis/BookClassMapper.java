package com.scrum.Library.mybatis;

import java.util.List;

import com.scrum.Library.domain.BookClass;
import com.scrum.Library.parameter.Parameter;

//图书编目
public interface BookClassMapper {
	public int insertBookClass(BookClass bookClass);
	public int deleteBookClassByID(BookClass bookClass);
	public int updateBookClass(BookClass bookClass);
	public List<BookClass> selectBookClassByID(Parameter parameter);
	public int getCount(Parameter parameter);
	public BookClass findBookClassByID(Parameter parameter);
	public List<BookClass>selectAllBkCatalog();

}

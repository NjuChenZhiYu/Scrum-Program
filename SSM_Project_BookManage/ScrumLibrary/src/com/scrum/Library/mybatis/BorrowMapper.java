package com.scrum.Library.mybatis;

import java.util.List;

import com.scrum.Library.domain.Borrow;
import com.scrum.Library.domain.ReaderType;
import com.scrum.Library.parameter.Parameter;

//借书接口
public interface BorrowMapper {
	public int insertBorrow(Borrow borrow);
	public int updateBookByID(Parameter parameter);
	public Parameter getReaderInfoByID(Parameter parameter);
	public int updateReaderByID(Parameter parameter);
	public ReaderType findReaderTypeByrdID(String rdID);
	public List<Borrow> selectBorrowInfo(Parameter parameter);
	public int getCounts(Parameter parameter);
	public int deleteBorrowByID(int id);
	public int updateReader(Parameter parameter);
	public Borrow getBorrow(Borrow borrow);
	public int updateReturn(Borrow borrow);
	public int updateTB(Borrow borrow);

}

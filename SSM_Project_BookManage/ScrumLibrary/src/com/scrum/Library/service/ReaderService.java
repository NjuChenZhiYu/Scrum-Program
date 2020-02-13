package com.scrum.Library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.scrum.Library.domain.Reader;
import com.scrum.Library.mybatis.ReaderMapper;
import com.scrum.Library.parameter.Parameter;

//读者信息服务层
@Service
public class ReaderService {
	@Autowired
	private ReaderMapper readerMapper;
	@Transactional(propagation=Propagation.REQUIRED)
	public int insertReader(Reader reader)
	{
		return readerMapper.insertReader(reader);
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public Reader findReaderByrdID(String rdID)
	{
		return readerMapper.findReaderByrdID(rdID);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public int deleteReaderByrdID(String rdID)
	{
		return readerMapper.deleteReaderByrdID(rdID);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateReaderByrdID(Reader reader)
	{
		return readerMapper.updateReaderByrdID(reader);
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public int getCounts(Parameter parameter)
	{
		return this.readerMapper.getCounts(parameter);
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public List<Reader>getReaderInfo(Parameter parameter)
	{
		return this.readerMapper.getReaderInfo(parameter);
	}
	@Transactional(propagation=Propagation.REQUIRED,readOnly=true)
	public String findStatusByrdID(String rdID)
	{
		return this.readerMapper.findStatusByrdID(rdID);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public int updateStatusByrdID(Reader reader)
	{
		return this.readerMapper.updateStatusByrdID(reader);
	}
}

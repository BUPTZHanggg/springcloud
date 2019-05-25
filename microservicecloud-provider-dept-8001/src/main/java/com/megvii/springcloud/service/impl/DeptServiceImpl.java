package com.megvii.springcloud.service.impl;

import java.util.List;

import com.megvii.springcloud.entities.Dept;
import com.megvii.springcloud.dao.DeptDao;
import com.megvii.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{
		Dept byId = dao.findById(id);
		return byId;
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}

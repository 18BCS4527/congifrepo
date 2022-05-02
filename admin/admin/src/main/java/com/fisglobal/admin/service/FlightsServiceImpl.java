package com.fisglobal.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fisglobal.admin.dao.FlightsDao;
import com.fisglobal.admin.feign.UsersProxy;
import com.fisglobal.admin.model.Flights;
import com.fisglobal.admin.model.UsersDto;

@Service
public class FlightsServiceImpl implements FlightsService{

	@Autowired
	FlightsDao dao;
	
	
	@Override
	public List<Flights> allFlights() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Flights> queryFlights(String from, String to) {
		// TODO Auto-generated method stub
		return dao.queryFlights(from, to);
	}



}

package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Area;
import com.example.demo.entities.City;
import com.example.demo.repository.AreaRepository;

@Service
public class AreaService {
	@Autowired
	AreaRepository arepo;
	public  Area add(Area a)
	{
	return arepo.save(a);
	}
	public List<Area> getByAreaId(City c)
	{
		return arepo.getBycity(c);
	}	
	public Area getByid(int areaid)
	{
		return arepo.findById(areaid).get();
	}
}
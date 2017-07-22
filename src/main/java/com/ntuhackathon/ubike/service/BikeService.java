package com.ntuhackathon.ubike.service;

import com.ntuhackathon.ubike.model.BikeEntity;
import com.ntuhackathon.ubike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service("bikeService")
public class BikeService {

	@Autowired
	BikeRepository bikeRepository;

	@Transactional
	public List<BikeEntity> getAllBikes() {
		List<BikeEntity> countries=new ArrayList<BikeEntity>();
		Iterable<BikeEntity> countriesIterable=bikeRepository.findAll();
		Iterator<BikeEntity> countriesIterator=countriesIterable.iterator();
		while(countriesIterator.hasNext())
		{
			countries.add(countriesIterator.next());
		}
		return countries;
	}


	@Transactional
	public BikeEntity getBike(int id) {
		return bikeRepository.findOne(id);
	}

	@Transactional
	public void addBike(BikeEntity bikeEntity) {
		bikeRepository.save(bikeEntity);
	}

	@Transactional
	public void updateBike(BikeEntity bikeEntity) {
		bikeRepository.save(bikeEntity);

	}

	@Transactional
	public void deleteBike(int id) {
		bikeRepository.delete(id);
	}
}

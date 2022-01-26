package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.bean.NattuEgg;
import com.example.demo.dao.MainDAO;

@Service
public class NattuEggServiceImpl implements NattuEggService {

	@Autowired
	MainDAO dao;
	
	@Override
	public ResponseEntity<String> addNattuEggs(NattuEgg nattuEggObj) {
		NattuEgg nattuEggResponse = dao.save(nattuEggObj);
		return new ResponseEntity<String>(nattuEggResponse.toString(), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ArrayList<NattuEgg>> getAllNattuEggCount() {
		System.out.println("INN DAO");
		for (NattuEgg element : dao.findAll()) {
			System.out.println(element);
		}
		return new ResponseEntity(dao.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<NattuEgg> deleteNattuEggs() {
		
		return null;
	}

}

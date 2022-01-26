package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.NattuEgg;
import com.example.demo.service.NattuEggService;

@RestController
public class MainController {
	
	@Autowired 
	NattuEggService service;
	
	@PostMapping("/addNattuEgg")
	public ResponseEntity<String> addNattuEggs(@RequestBody NattuEgg nattuEggObj) {		
		return service.addNattuEggs(nattuEggObj);
	}
	
	@GetMapping("/getAllNattuEggs")
	public ResponseEntity<ArrayList<NattuEgg>> getAllNattuEggs() {
		System.out.println("IN");
		return service.getAllNattuEggCount();
	}
	
	@DeleteMapping("/deleteEgg/{}")
	public ResponseEntity<NattuEgg> deleteNattuEggs(int count) {
		return service.deleteNattuEggs();
	}

}

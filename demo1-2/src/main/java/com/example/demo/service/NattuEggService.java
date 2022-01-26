package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;

import com.example.demo.bean.NattuEgg;

public interface NattuEggService {

	ResponseEntity<String> addNattuEggs(NattuEgg nattuEggObj);

	ResponseEntity<ArrayList<NattuEgg>> getAllNattuEggCount();

	ResponseEntity<NattuEgg> deleteNattuEggs();

}
package com.vendingmachine.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vendingmachine.model.Item;



@Repository
public interface VendingMachineRepository extends JpaRepository<Item, Integer>  {

	
	
}

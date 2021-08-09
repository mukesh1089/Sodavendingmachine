package com.vendingmachine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vendingmachine.model.Item;
import com.vendingmachine.service.ItemService;



@Controller
@RequestMapping(path = AdminController.RESOURCE_PATH)
public class AdminController {

	
	
	public final static String RESOURCE_PATH = "/soda-item";
	
	public final static String GET_ALL_ITEM_VALUES = "/get-all-item";
	public final static String CREATE_ITEM = "/create-item";
	public final static String Update_ITEM = "/edit-template";
	public final static String GET_ITEM_BY_ID = "itemid/{id}";
	public final static String DELETE_ITEM = "/delete-item/{id}";

	@Autowired
	ItemService itemService;
	
	

	

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String displayHomePage() {
		return "home";
	}
	
	
//	// to get all the Values of Item
	@GetMapping(path = GET_ALL_ITEM_VALUES, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Item>> getAllItem(){
		
		List<Item> allItems=itemService.getAllItems();
		 return ((BodyBuilder) ResponseEntity.status(HttpStatus.OK).build())
					.body(allItems);
	}

	// For save Item
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, path = CREATE_ITEM)
	public ResponseEntity<Item> create_item(@RequestBody Item itemBody){
		Item ItemAdded=itemService.addItem(itemBody);
	
		 return ((BodyBuilder) ResponseEntity.status(HttpStatus.OK).build())
			.body(ItemAdded);
	}
	


	// For Edit Item
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, path = Update_ITEM)
	public ResponseEntity<Item> updateItem(	@RequestBody Item itemBody){
		Item ItemAdded=itemService.updateItem(itemBody);
		
		 return ((BodyBuilder) ResponseEntity.status(HttpStatus.OK).build())
					.body(ItemAdded);
		
	}

	// get Item by id
	@GetMapping(path = GET_ITEM_BY_ID)
	ResponseEntity<Optional<Item>> getByItemId(@PathVariable int id){
	
		Optional<Item> itemBodyById=itemService.getByItemId(id);
		
		 return ((BodyBuilder) ResponseEntity.status(HttpStatus.OK).build())
					.body(itemBodyById);
	}
	
	

	
	// For Delete Template
	@DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, path = DELETE_ITEM)
	public void deleteItem(@PathVariable int id){
		
		itemService.removeItem(id);
		
	}
}



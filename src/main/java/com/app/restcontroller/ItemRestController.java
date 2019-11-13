package com.app.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Item;
import com.app.service.IItemService;

@RestController
public class ItemRestController {
	@Autowired
	private IItemService service;
	
	@PostMapping("/save")
	public String saveItems(@RequestBody Item i) {
		service.saveItem(i);
		return i.getName()+"record was saved sucessfully";
	}

	@GetMapping("/one")
	public Item getById(@RequestParam Integer id) {
		Item i=service.getById(id);
		return i;
	}
	
	@GetMapping("/all")
	public List<Item> getAll(){
		List<Item> list=service.getAll();
		return list;
	}
	@DeleteMapping("/delete")
	public String deleteById(@RequestParam Integer id) {
		service.deleteById(id);
		return id+"record deleted sucessfully";
	}
	@PutMapping("/update")
	public String update(@RequestBody Item i) {
		boolean exist=service.isExist(i.getId());
		if(exist) {
			service.saveItem(i);
			return "record updated sucessfully";
		}
		return "no record found";
	}
	
	
}

package com.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Item;
import com.app.repo.ItemRepository;
import com.app.service.IItemService;
@Service
public class ItemServiceImpl implements IItemService {
	@Autowired
	private ItemRepository  repo;

	@Transactional
	public void saveItem(Item i) {
		repo.save(i);
		
	}

	@Transactional(readOnly = true)
	public Item getById(Integer id) {
		Optional<Item> obj = repo.findById(id);
		if(obj.isPresent()) {
			return obj.get();
		}
		return null;
	}

	@Transactional(readOnly = true)
	public List<Item> getAll() {
		List<Item> list=repo.findAll();
		
		return list;
	}

	@Transactional
	public void deleteById(Integer id) {
		repo.deleteById(id);
		
	}
	
	@Transactional
	public boolean isExist(Integer id) {
		
		return repo.existsById(id);
	}
	

}

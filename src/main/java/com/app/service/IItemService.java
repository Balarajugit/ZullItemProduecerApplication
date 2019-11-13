package com.app.service;

import java.util.List;


import com.app.model.Item;

public interface IItemService {
	
	public void saveItem(Item i);
	public Item getById(Integer id);
	public List<Item> getAll();
	public void deleteById(Integer id);
	public boolean isExist(Integer id);

}

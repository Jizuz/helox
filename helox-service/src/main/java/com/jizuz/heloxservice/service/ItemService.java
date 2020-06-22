package com.jizuz.heloxservice.service;

import com.jizuz.heloxapi.model.Item;
import com.jizuz.heloxservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service("itemService")
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Long saveItem(Item item) {
        if (Objects.isNull(item)) return null;

        Item result = itemRepository.save(item);
        return result.getId();
    }

    public Item getItemById(Long id) {
        Optional<Item> iItem = itemRepository.findById(id);
        return iItem.get();
    }

    public int saveItems(List<Item> items) {
        Iterable<Item> resp = itemRepository.saveAll(items);
        return 0;
    }
}

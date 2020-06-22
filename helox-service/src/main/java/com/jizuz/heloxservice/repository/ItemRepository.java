package com.jizuz.heloxservice.repository;

import com.jizuz.heloxapi.model.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ItemRepository extends ElasticsearchRepository<Item, Long> {
}

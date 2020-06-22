package com.jizuz.heloxservice.es;

import com.jizuz.heloxapi.model.Item;
import com.jizuz.heloxservice.service.ItemService;
import com.jizuz.heloxservice.HeloxServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HeloxServiceApplication.class)
public class ItemTest {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private ItemService itemService;

    @Test
    public void create() {
        elasticsearchTemplate.createIndex(Item.class);
        elasticsearchTemplate.putMapping(Item.class);
    }

    @Test
    public void saveItem() {
        Item item = new Item(4L, "华为meta20Pro", "mobile", "Huawei", 4500.00, "/image/img4.jpg");
        Long resp = itemService.saveItem(item);
        System.out.println(resp);
    }

    @Test
    public void saveAll() {
        List<Item> itemList = new ArrayList<>();
        Item item1 = new Item();
        item1.setId(6L);
        item1.setCategory("mobile");
        item1.setBrand("小米");
        item1.setPrice(2000.00);
        item1.setTitle("小米8");
        item1.setImages("/image/img6.jpg");

        Item item2 = new Item();
        item2.setId(7L);
        item2.setCategory("mobile");
        item2.setBrand("红米");
        item2.setPrice(1000.00);
        item2.setTitle("红米6A");
        item2.setImages("/image/img7.jpg");
        itemList.add(item1);
        itemList.add(item2);

        int resp = itemService.saveItems(itemList);
        System.out.println(resp);
    }

    @Test
    public void getItemById() {
        Item item = itemService.getItemById(1L);
        System.out.println(item);
    }
}

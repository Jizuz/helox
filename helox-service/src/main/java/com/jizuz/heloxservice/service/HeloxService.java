package com.jizuz.heloxservice.service;

import com.jizuz.heloxapi.HeloxApi;
import com.jizuz.heloxapi.model.Item;
import com.jizuz.heloxapi.model.ResultVO;
import com.jizuz.heloxservice.repository.ItemRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@Api(value = "helox-api", tags = {"helox服务"})
public class HeloxService implements HeloxApi {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public String getResult() {
        return "你好，Jizuz";
    }

    @Override
    public ResultVO<Integer> saveAllItems(List<Item> itemList) {
        Iterable<Item> resp = itemRepository.saveAll(itemList);

        ResultVO<Integer> resultVO = new ResultVO<>();
        return resultVO;
    }

    @Override
    public ResultVO<List<Item>> getAllItems() {
        ResultVO<List<Item>> resultVO = new ResultVO<>();
        Iterable<Item> items = itemRepository.findAll();
        if (Objects.isNull(items)) {
            return resultVO;
        }

        List<Item> itemList = new ArrayList<>();
        items.forEach(item -> itemList.add(item));
        resultVO.setT(itemList);

        return resultVO;
    }

}

package com.jizuz.heloxapi;

import com.jizuz.heloxapi.model.Item;
import com.jizuz.heloxapi.model.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/helox")
@Api(value = "helox")
public interface HeloxApi {

    @ApiOperation("获取返回结果")
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    String getResult();

    @ApiOperation("保存所有的Items")
    @RequestMapping(value = "/saveAllItems", method = RequestMethod.POST)
    ResultVO<Integer> saveAllItems(List<Item> itemList);

    @ApiOperation("获取所有的Item值")
    @RequestMapping(value = "/getAllItems", method = RequestMethod.GET)
    ResultVO<List<Item>> getAllItems();

}

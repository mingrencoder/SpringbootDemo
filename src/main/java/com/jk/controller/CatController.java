package com.jk.controller;

import com.jk.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by jikai on 2017/11/5.
 */
@RestController
public class CatController {

    private final static Logger logger = LoggerFactory.getLogger(CatController.class);


    /**
     * 查找所有Cat
     * @return
     */
//    @GetMapping(value = "/catList")
//    public List<Cat> catList() {
//
//        logger.info("query cat list");
//        return null;
//    }

    /**
     * 添加Cat
     * @return
     */
//    @PostMapping(value = "/catAdd")
//    public Result<Cat> catAdd(@Valid Cat cat, BindingResult bindingResult) {
//        Result result = new Result();
//        if(bindingResult.hasErrors()) {
//            return null;
//        }
//        cat.setName(cat.getName());
//        cat.setWeight(cat.getWeight());
//
//        return null;
//    }

    /**
     * 通过ID查询
     * @param id
     * @return
     */
//    @GetMapping(value = "/query/{id}")
//    public Cat catFindOne(@PathVariable("id") Integer id) {
//        return null;
//    }

    /**
     * 通过name查询
     * @param name
     * @return
     */
//    @GetMapping(value = "/queryByName/{name}")
//    public List<Cat> catFindByName(@PathVariable("name") String name) {
//        return null;
//    }

    /**
     * 更新Cat
     * @param id
     * @param name
     * @param weight
     * @return
     */
//    @PutMapping(value = "/update/{id}")
//    public Cat catUpdate(@PathVariable("id") Integer id,
//                         @RequestParam("name") String name,
//                         @RequestParam("weight") Integer weight) {
//        Cat cat = new Cat();
//        cat.setId(id);
//        cat.setName(name);
//        cat.setWeight(weight);
//
//        return null;
//    }

    /**
     * 删除Cat
     * @param id
     */
    @DeleteMapping(value = "/delete/{id}")
    public void catDeleteOne(@PathVariable("id") Integer id) {
    }


    /**
     * 同时插入两个
     */
    @PostMapping(value = "/catAdd/both")
    public void catBoth() {
    }


    @GetMapping(value = "/getWeight/{id}")
    public String getWeight(@PathVariable Integer id) throws Exception {
        return null;
    }
}

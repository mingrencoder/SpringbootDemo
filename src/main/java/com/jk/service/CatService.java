package com.jk.service;

import com.jk.consts.ResultEnum;
import com.jk.domain.Cat;
import com.jk.exception.CatException;
import com.jk.inter.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jikai on 2017/11/5.
 */
@Service
public class CatService {

    @Autowired
    private CatRepository catRepository;

    @Transactional
    public void insertBoth() {
        Cat cat1 = new Cat();
        cat1.setName("hehe");
        cat1.setWeight(30);
        catRepository.save(cat1);

        Cat cat2 = new Cat();
        cat2.setName("meme");
        cat2.setWeight(25);
        catRepository.save(cat2);
    }

    public String getWeight(Integer id) throws Exception {
        Integer weight = catRepository.findOne(id).getWeight();
        if(weight < 10) {
            throw new CatException(ResultEnum.THIN);
        } else if(weight > 20) {
            throw new CatException(ResultEnum.FAT);
        } else {
            return "健康猫";
        }
    }
}

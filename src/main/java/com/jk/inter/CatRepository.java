package com.jk.inter;

import com.jk.domain.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by jikai on 2017/11/5.
 */
public interface CatRepository extends JpaRepository<Cat, Integer> {

    // 通过名字查询
    public List<Cat> findByName(String name);
}

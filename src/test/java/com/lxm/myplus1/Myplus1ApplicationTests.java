package com.lxm.myplus1;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lxm.myplus1.entity.StudentScore;
import com.lxm.myplus1.mapper.StudentScoreMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Myplus1ApplicationTests {

    @Autowired
    private StudentScoreMapper studentScoreMapper;

    @Test
    void contextLoads() {

        studentScoreMapper.selectList(null);

    }

    @Test
    public void test() {
        IPage<StudentScore> page = new Page<>(1, 5);
        IPage<StudentScore> pageInfo = studentScoreMapper.selectPage(page, null);
        System.out.println(pageInfo.getRecords());
        System.out.println(pageInfo.getTotal());

    }

    @Test
    public void test02() {
        IPage<StudentScore> page = new Page<>(1, 5);
        IPage<StudentScore> pageInfo = studentScoreMapper.findByNameLike(page, "李");
        System.out.println(pageInfo.getRecords());
        System.out.println(pageInfo.getTotal());
    }

}

package com.lxm.myplus1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lxm.myplus1.entity.StudentScore;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentScoreMapper extends BaseMapper<StudentScore> {
    IPage<StudentScore> findByNameLike(IPage<StudentScore> page, @Param("name") String name);
}

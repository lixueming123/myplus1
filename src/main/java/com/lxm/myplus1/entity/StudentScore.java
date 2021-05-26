package com.lxm.myplus1.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
@TableName("t_student_score")
public class StudentScore {

    @TableId(type = IdType.AUTO)
    private Integer scoreId;

    private String code;

    private String name;

    private Float onlineScore;

    private Float classScore;

}

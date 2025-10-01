package com.shuyx.shuyxmedia.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_tag")
public class TagEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "tag_id",type = IdType.AUTO)
    private Integer tagId;                 //标签id
    @TableField("tag_name")
    private String tagName;                //标签名称
    @TableField("tag_type")
    private String tagType;                //标签类型
}

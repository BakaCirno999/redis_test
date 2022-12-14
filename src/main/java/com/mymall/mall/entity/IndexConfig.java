package com.mymall.mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author ganqian
 * @since 2022-02-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="IndexConfig对象", description="")
public class IndexConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "首页配置项主键id")
    @TableId(value = "config_id", type = IdType.AUTO)
    private Long configId;

    @ApiModelProperty(value = "显示字符(配置搜索时不可为空，其他可为空)")
    private String configName;

    @ApiModelProperty(value = "1-搜索框热搜 2-搜索下拉框热搜 3-(首页)热销商品 4-(首页)新品上线 5-(首页)为你推荐")
    private Integer configType;

    @ApiModelProperty(value = "商品id 默认为0")
    private Long goodsId;

    @ApiModelProperty(value = "点击后的跳转地址(默认不跳转)")
    private String redirectUrl;

    @ApiModelProperty(value = "排序值(字段越大越靠前)")
    private Integer configRank;

    @ApiModelProperty(value = "删除标识字段(0-未删除 1-已删除)")
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建者id")
    private Integer createUser;

    @ApiModelProperty(value = "最新修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "修改者id")
    private Integer updateUser;


}

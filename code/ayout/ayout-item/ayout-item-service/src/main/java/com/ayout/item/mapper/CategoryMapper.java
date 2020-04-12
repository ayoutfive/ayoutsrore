package com.ayout.item.mapper;

import com.ayout.item.pojo.Category;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther: Noviciate
 * @Date: 2020/4/12/012 16:58
 * @Description: ayout
 * @Version: 0.0.1
 */
public interface CategoryMapper extends Mapper<Category>, SelectByIdListMapper<Category, Long> {




    /**
     * 根据品牌id查询商品分类
     * @param bid
     * @return
     */
    @Select("SELECT * FROM tb_category WHERE id IN (SELECT category_id FROM tb_category_brand WHERE brand_id = #{bid})")
    List<Category> queryByBrandId(Long bid);
}

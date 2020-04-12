package com.ayout.item.bo;

import com.ayout.item.pojo.Sku;
import com.ayout.item.pojo.Spu;
import com.ayout.item.pojo.SpuDetail;

import java.util.List;

public class SpuBo extends Spu {

    String cname;// 商品分类名称
    
    String bname;// 品牌名称
    
    // 略 。。
    SpuDetail spuDetail;// 商品详情
    List<Sku> skus;// sku列表

    public SpuDetail getSpuDetail() {
        return spuDetail;
    }

    public void setSpuDetail(SpuDetail spuDetail) {
        this.spuDetail = spuDetail;
    }

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
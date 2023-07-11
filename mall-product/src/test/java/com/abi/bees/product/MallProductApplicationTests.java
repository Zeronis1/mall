package com.abi.bees.product;

import com.abi.bees.product.entity.BrandEntity;
import com.abi.bees.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    public void test01() {
        BrandEntity entity = new BrandEntity();
        entity.setName("小熊");
        entity.setDescript("电器");
        brandService.save(entity);
        System.out.println("保存成功");
    }

    @Test
    public void test02() {
        BrandEntity entity = new BrandEntity();
        entity.setBrandId(1L);
        entity.setDescript("家用电器");
        brandService.updateById(entity);
        System.out.println("修改成功");
    }

    @Test
    public void test03() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach(System.out::println);
    }

}

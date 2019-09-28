package com.shop.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shop.pojo.TbBrand;
import com.shop.sellergoods.service.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;

    @GetMapping("/findAll")
    public List<TbBrand> findAll() {
        return brandService.queryAll();
    }
}

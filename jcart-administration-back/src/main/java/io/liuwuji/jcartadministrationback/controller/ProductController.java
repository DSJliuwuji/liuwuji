package io.liuwuji.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import io.liuwuji.jcartadministrationback.dto.in.ProductCreateInDTO;
import io.liuwuji.jcartadministrationback.dto.in.ProductSearchInDTO;
import io.liuwuji.jcartadministrationback.dto.in.ProductUpdateInDTO;
import io.liuwuji.jcartadministrationback.dto.out.PageOutDTO;
import io.liuwuji.jcartadministrationback.dto.out.ProductListOutDTO;
import io.liuwuji.jcartadministrationback.dto.out.ProductShowOutDTO;
import io.liuwuji.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {


    @Autowired
    private ProductService productService;

@Value("www.img.baseurl")
    private  String imgeBaseurl;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<ProductListOutDTO> page = productService.search(pageNum);
        for (ProductListOutDTO outDTO : page) {
            outDTO.setMainPicUrl(imgeBaseurl+"/"+outDTO.getMainPicUrl());
        }
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }

    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productService.batchDelete(productIds);
    }

}

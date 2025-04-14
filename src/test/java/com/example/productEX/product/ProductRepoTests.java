package com.example.productEX.product;

import com.example.productEX.product.entities.ProductEntity;
import com.example.productEX.product.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class ProductRepoTests {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testInsertProducts() {

        for (int i = 1; i <= 15; i++) {

            ProductEntity product = ProductEntity.builder()
                    .pname("상품 " + i)
                    .price(5000 + i * 100)  // 가격 5100, 5200, ...
                    .pdesc("설명입니다: " + i + "번 상품은 특별한 커피입니다.")
                    .seller("seller_" + ((i % 5) + 1))  // seller_1 ~ seller_5 반복
                    .build();

            // 대표 이미지 포함 3장 등록
            product.addImage("sample" + i + "_1.jpg");
            product.addImage("sample" + i + "_2.jpg");
            product.addImage("sample" + i + "_3.jpg");

            productRepository.save(product);

        }

    }
}

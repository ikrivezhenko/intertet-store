//package com.exemple.spring.test;
//
//import com.example.springapp.entities.Product;
//import com.example.springapp.services.ProductService;
//import com.exemple.spring.services.CartService;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.Optional;
//
//@SpringBootTest
//public class CartTest {
//    @Autowired
//    private CartService cartService;
//
//    @MockBean
//    private ProductService productService;
//
//    @BeforeEach
//    public void initCart() {
//        cartService.clearCart("test_cart");
//    }
//
//    @Test
//    public void addToCartTest() {
//        Product product = new Product();
//        product.setId(5L);
//        product.setName("X");
//        product.setPrice(100);
//
//        Mockito.doReturn(Optional.of(product)).when(productService).findById(5L);
//        cartService.addToCart("test_cart", 5L);
//        cartService.addToCart("test_cart", 5L);
//        cartService.addToCart("test_cart", 5L);
//
//        Mockito.verify(productService, Mockito.times(3)).findById(ArgumentMatchers.eq(5L));
//        Assertions.assertEquals(1, cartService.getCurrentCart("test_cart").getItems().size());
//    }
//}
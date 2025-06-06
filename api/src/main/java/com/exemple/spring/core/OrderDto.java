package com.exemple.spring.core;

import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.List;

@Schema(description = "Модель заказа")
public class OrderDto {

    @Schema(description = "ID заказа", required = true, example = "1")
    private Long id;

    @Schema(description = "Ник пользователя", required = true, example = "user")
    private String username;

    @Schema(description = "Фамилия Имя Отчество", required = true, example = "Шаповалов Иван Сергеевич")
    private String fio;

    @Schema(description = "Список позиций в заказе", required = true)
    private List<OrderItemDto> items;

    @Schema(description = "Итоговая цена заказа", required = true, example = "122.21")
    private BigDecimal totalPrice;

    @Schema(description = "Почтовый индекс", required = true, example = "г. Москва")
    private String postalCode;

    @Schema(description = "Город", required = true, example = "г. Москва")
    private String adminAreaTwoTown;

    @Schema(description = "Улица", required = true, example = "Ул. Покровка")
    private String addressLineOneStreet;

    @Schema(description = "Номер апартаментов", required = true, example = "35/17")
    private String addressLineTwoApartmentNumber;

    @Schema(description = "Телефон", required = true, example = "8(903)495-12-23")
    private String phone;

    @Schema(description = "E-mail", required = true, example = "vasya-99@mail.ru")
    private String email;

    @Schema(description = "Статус заказа", required = true, example = "PAID")
    private String status;


    public OrderDto() {
    }

    public Long getId() {
        return id;
    }

    public OrderDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public OrderDto setUsername(String username) {
        this.username = username;
        return this;
    }

    public List<OrderItemDto> getItems() {
        return items;
    }

    public OrderDto setItems(List<OrderItemDto> items) {
        this.items = items;
        return this;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public OrderDto setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    public String getAdminAreaTwoTown() {
        return adminAreaTwoTown;
    }

    public OrderDto setAdminAreaTwoTown(String adminAreaTwoTown) {
        this.adminAreaTwoTown = adminAreaTwoTown;
        return this;
    }

    public String getAddressLineOneStreet() {
        return addressLineOneStreet;
    }

    public OrderDto setAddressLineOneStreet(String addressLineOneStreet) {
        this.addressLineOneStreet = addressLineOneStreet;
        return this;
    }

    public String getAddressLineTwoApartmentNumber() {
        return addressLineTwoApartmentNumber;
    }

    public OrderDto setAddressLineTwoApartmentNumber(String addressLineTwoApartmentNumber) {
        this.addressLineTwoApartmentNumber = addressLineTwoApartmentNumber;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public OrderDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public OrderDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getFio() {
        return fio;
    }

    public OrderDto setFio(String fio) {
        this.fio = fio;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public OrderDto setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public OrderDto setStatus(String status) {
        this.status = status;
        return this;
    }
}

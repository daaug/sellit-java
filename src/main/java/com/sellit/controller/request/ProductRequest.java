package com.sellit.controller.request;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String name;
    private Float price;
}

package com.example.restaurant.wishlist.entity;

import com.example.restaurant.db.MemoryDbEntity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter@Setter
public class WishListEntity extends MemoryDbEntity {

    private String title;   //음식명
    private String category; //카테고리
    private String address;  //주소
    private String readAddress; //주소
    private String homaPageLink;
    private String imageLink;
    private boolean isVisit;
    private int visitCount;
    private LocalDateTime lastVisitDate;

}

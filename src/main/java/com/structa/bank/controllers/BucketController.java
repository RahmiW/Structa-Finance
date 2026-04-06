package com.structa.bank.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BucketController {
    private final BucketService bucketService;
    public BucketController(BucketService bucketService){
        this.bucketService = bucketService;
    }
    // Read
    @GetMapping("/")
}

package com.sp.mask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @GetMapping(value="/")
    public String home() {
        return "index";
    }
	
    
    /*
     * GET ,  param = address
     * https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/storesByAddr/json
     * ex) https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/storesByAddr/json?address=경기도 고양시 일산서구
     * 
     * 
     */
}

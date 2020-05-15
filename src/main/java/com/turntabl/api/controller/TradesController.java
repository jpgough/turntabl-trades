package com.turntabl.api.controller;

import com.turntabl.api.domain.Account;
import com.turntabl.api.domain.ProductDetail;
import com.turntabl.api.domain.Side;
import com.turntabl.api.domain.Trade;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TradesController {

    @GetMapping("/trades")
    @ApiOperation(
            value = "Returns all trades ",
            notes = "Multiple trades object values, separated by comma"
            /*extensions = {
                    @Extension(name = "links", properties = {
                            @ExtensionProperty(name = "tradeId", value = "localhost:8081/trades/{tradeId}"),
                            @ExtensionProperty(name = "productId", value = "localhost:8083/products/{productId}"),
                            @ExtensionProperty(name = "accountId", value = "localhost:8082/account/{accountId}")
                    })
            }*/
    )
    public List<Trade> getTrades() {
        List<Trade> trades = new ArrayList<>();

        //Dummy data
        Trade t1 = new Trade();
        t1.setPrice(new BigDecimal("676.20"));
        t1.setQuantity(100);
        t1.setSide(Side.BUY);
        t1.setTradeId("T12345");
        Account a1 = new Account();
        a1.setAccountId("ACC1");
        a1.setAccountType("Client");
        a1.setBookName("Euro Trades");
        t1.setAccount(a1);
        ProductDetail p1 = new ProductDetail();
        p1.setExchange("LSE");
        p1.setProductId("P987");
        p1.setTicker("SGE");
        t1.setProductDetail(p1);
        trades.add(t1);

        Trade t2 = new Trade();
        t2.setAccount(a1);
        t2.setProductDetail(p1);
        t2.setTradeId("T12346");
        t2.setSide(Side.SELL);
        t2.setQuantity(5);
        t2.setPrice(new BigDecimal("676.50"));
        trades.add(t2);

        return trades;
    }
}

package com.turntabl.api.controller;

import com.turntabl.api.domain.Account;
import com.turntabl.api.domain.ProductDetail;
import com.turntabl.api.domain.Side;
import com.turntabl.api.domain.Trade;
import com.turntabl.api.service.TradesDemoData;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("*")
public class TradesController {
    @Autowired
    TradesDemoData tradesDemoData;

    @GetMapping("/trades")
    @ApiOperation(
            value = "Returns all trades ",
            notes = "Multiple trades object values, separated by comma",
            extensions = {
                    @Extension( name = "connectable", properties = { 
                        @ExtensionProperty(name = "connectable1", value = "productId")
                     })
            }
    )
    public List<Trade> getTrades() {
     return tradesDemoData.getTrades();
    }
}

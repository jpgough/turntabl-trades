package com.turntabl.api.controller;

import com.turntabl.api.domain.Trade;
import com.turntabl.api.service.TradesDemoData;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class TradesController {
    @Autowired
    TradesDemoData tradesDemoData;

    @GetMapping("/trades")
    @ApiOperation(
            value = "View Trades",
            notes = "Bought and sold financial assets."
    )
    public List<Trade> getTrades() {
     return tradesDemoData.getTrades();
    }

    //Definitely not restful, but mostly about demoing a new concept

    @GetMapping("/trades/rt")
    @ApiOperation(
            value = "View Trades in real time",
            notes = "Bought and sold financial assets."
    )
    public List<Trade> getTradesRealTime() {
        return tradesDemoData.getRealTimeTrades();
    }

    @PostMapping("/trades/rt/reset")
    @ApiOperation(
            value = "Reset Trades"
    )
    public void resetTrades() {
        tradesDemoData.reset();
    }
}

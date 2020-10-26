package com.turntabl.api.service;

import com.turntabl.api.domain.Account;
import com.turntabl.api.domain.ProductDetail;
import com.turntabl.api.domain.Side;
import com.turntabl.api.domain.Trade;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class TradesDemoData {
    private final List<Trade> trades = new ArrayList<>();
    private final List<Account> accounts = new ArrayList<>();
    private final List<ProductDetail> products = new ArrayList<>();
    private final Random random = new Random();
    private AtomicInteger currentId = new AtomicInteger(0);


    public TradesDemoData() {
        //Dummy data
        // Products Details
        ProductDetail p1 = new ProductDetail();
        p1.setExchange("LSE");
        p1.setProductId("P987");
        p1.setTicker("SGE");
        products.add(p1);

        ProductDetail p2 = new ProductDetail();
        p2.setExchange("LSE");
        p2.setProductId("P556");
        p2.setTicker("0AI4");
        products.add(p2);

        ProductDetail p3 = new ProductDetail();
        p3.setExchange("EPA");
        p3.setProductId("P999");
        p3.setTicker("ORA");
        products.add(p3);

        ProductDetail p4 = new ProductDetail();
        p4.setExchange("NASDAQ");
        p4.setProductId("P387");
        p4.setTicker("GOOGL");
        products.add(p4);

        ProductDetail p5 = new ProductDetail();
        p5.setExchange("NYSE");
        p5.setProductId("P225");
        p5.setTicker("CRM");
        products.add(p5);

        ProductDetail p6 = new ProductDetail();
        p6.setExchange("NASDAQ");
        p6.setProductId("P821");
        p6.setTicker("ZM");
        products.add(p6);

        ProductDetail p7 = new ProductDetail();
        p7.setExchange("ASX");
        p7.setProductId("P764");
        p7.setTicker("XRO");
        products.add(p7);


        // Account
        Account a1 = new Account();
        a1.setAccountId("ACC1");
        a1.setAccountType("Client");
        a1.setBookName("Euro Trades");
        accounts.add(a1);

        Account a2 = new Account();
        a2.setAccountId("ACC2");
        a2.setAccountType("Offshore");
        a2.setBookName("Dollar Trades");
        accounts.add(a2);

        Account a3 = new Account();
        a3.setAccountId("ACC3");
        a3.setAccountType("Special");
        a3.setBookName("Tech Trades");
        accounts.add(a3);

        Account a4 = new Account();
        a4.setAccountId("ACC4");
        a4.setAccountType("Ordinary");
        a4.setBookName("Foreign Trades");
        accounts.add(a4);


        // Trades
        Trade t1 = new Trade();
        t1.setPrice(new BigDecimal("10.20"));
        t1.setQuantity(100);
        t1.setSide(Side.BUY);
        t1.setTradeId("T12345");
        t1.setAccount(a1);
        t1.setProductDetail(p3);
        trades.add(t1);

        Trade t2 = new Trade();
        t2.setAccount(a1);
        t2.setProductDetail(p2);
        t2.setTradeId("T12346");
        t2.setSide(Side.SELL);
        t2.setQuantity(5);
        t2.setPrice(new BigDecimal("676.50"));
        trades.add(t2);


        Trade t3 = new Trade();
        t3.setPrice(new BigDecimal("179.89"));
        t3.setQuantity(53);
        t3.setSide(Side.BUY);
        t3.setTradeId("T12347");
        t3.setAccount(a3);
        t3.setProductDetail(p6);
        trades.add(t3);

        Trade t4 = new Trade();
        t4.setAccount(a3);
        t4.setProductDetail(p4);
        t4.setTradeId("T12348");
        t4.setSide(Side.BUY);
        t4.setQuantity(25);
        t4.setPrice(new BigDecimal("1431.50"));
        trades.add(t4);

        Trade t5 = new Trade();
        t5.setPrice(new BigDecimal("171.72"));
        t5.setQuantity(532);
        t5.setSide(Side.SELL);
        t5.setTradeId("T12349");
        t5.setAccount(a4);
        t5.setProductDetail(p5);
        trades.add(t5);

        Trade t6 = new Trade();
        t6.setAccount(a4);
        t6.setProductDetail(p6);
        t6.setTradeId("T12350");
        t6.setSide(Side.SELL);
        t6.setQuantity(105);
        t6.setPrice(new BigDecimal("178.50"));
        trades.add(t6);

        Trade t7 = new Trade();
        t7.setPrice(new BigDecimal("89.20"));
        t7.setQuantity(100);
        t7.setSide(Side.BUY);
        t7.setTradeId("T12351");
        t7.setAccount(a3);
        t7.setProductDetail(p7);
        trades.add(t7);

        Trade t8 = new Trade();
        t8.setAccount(a1);
        t8.setProductDetail(p2);
        t8.setTradeId("T12352");
        t8.setSide(Side.SELL);
        t8.setQuantity(23);
        t8.setPrice(new BigDecimal("676.50"));
        trades.add(t8);

        Trade t9 = new Trade();
        t9.setPrice(new BigDecimal("168.98"));
        t9.setQuantity(150);
        t9.setSide(Side.BUY);
        t9.setTradeId("T12353");
        t9.setAccount(a4);
        t9.setProductDetail(p5);
        trades.add(t9);

        Trade t10 = new Trade();
        t10.setAccount(a3);
        t10.setProductDetail(p7);
        t10.setTradeId("T12354");
        t10.setSide(Side.BUY);
        t10.setQuantity(47);
        t10.setPrice(new BigDecimal("85.41"));
        trades.add(t10);

        Trade t11 = new Trade();
        t11.setPrice(new BigDecimal("1428.87"));
        t11.setQuantity(10);
        t11.setSide(Side.BUY);
        t11.setTradeId("T12355");
        t11.setAccount(a2);
        t11.setProductDetail(p4);
        trades.add(t11);

        Trade t12 = new Trade();
        t12.setAccount(a3);
        t12.setProductDetail(p5);
        t12.setTradeId("T12356");
        t12.setSide(Side.SELL);
        t12.setQuantity(236);
        t12.setPrice(new BigDecimal("172.52"));
        trades.add(t12);

    }

    public List<Trade> getTrades() {
        return trades;
    }

    private List<Trade> rtTrades = new ArrayList<>();

    public List<Trade> getRealTimeTrades() {
        Trade randomTrade = new Trade();
        randomTrade.setAccount(accounts.get(random.nextInt(accounts.size())));
        randomTrade.setProductDetail(products.get(random.nextInt(products.size())));

        if(random.nextInt(10) % 2 == 0) {
            randomTrade.setSide(Side.BUY);
        } else {
            randomTrade.setSide(Side.SELL);
        }

        randomTrade.setQuantity(random.nextInt(250));
        randomTrade.setTradeId("Trade " + currentId.incrementAndGet());
        randomTrade.setPrice(new BigDecimal("" + random.nextDouble()*50));

        rtTrades.add(randomTrade);

        return rtTrades;
    }

    public void reset() {
        rtTrades.clear();
        currentId.set(0);
    }
}

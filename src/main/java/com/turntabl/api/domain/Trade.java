package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel(description = "Trade data Model")
public class Trade {
    @ApiModelProperty(value = "unique identifier for the trade")
    private String tradeId;
    @ApiModelProperty(notes = "account trade was executed on")
    private Account account;
    @ApiModelProperty(value = "trade bought or sold SELL or BUY")
    private Side side;
    @ApiModelProperty(value = "number of products bought or sold")
    private Integer quantity;
    @ApiModelProperty(value = "the price the trade was executed at")
    private BigDecimal price;
    @ApiModelProperty(value = "details of the traded product")
    private ProductDetail productDetail;

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }
}

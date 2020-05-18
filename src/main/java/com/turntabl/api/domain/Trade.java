package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

@ApiModel(description = "Trade data Model")
public class Trade {
    @ApiModelProperty(value = "tradeId description",readOnly = true)
    private String tradeId;
    @ApiModelProperty(notes = "account description")
    private Account account;
    @ApiModelProperty(value = "side description")
    private Side side;
    @ApiModelProperty(value = "quantity description")
    private Integer quantity;
    @ApiModelProperty(value = "price description")
    private BigDecimal price;
    @ApiModelProperty(value = "productDetail description")
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

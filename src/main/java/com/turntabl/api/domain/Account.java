package com.turntabl.api.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel( description = "Account data Model description")
public class Account {
    @ApiModelProperty(value = "unique identifier for the account the trade was executed on")
    private String accountId;
    @ApiModelProperty(value = "book name of the account the trade was executed on")
    private String bookName;
    @ApiModelProperty(value = "book type of the account the trade was executed on")
    private String accountType;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}

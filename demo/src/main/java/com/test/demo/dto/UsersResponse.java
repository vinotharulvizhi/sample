package com.test.demo.dto;

import java.util.List;

public class UsersResponse {

    private Meta meta;
    private List<User> data;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}

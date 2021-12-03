package com.test.demo.dto;

import java.util.List;

public class CommentsResponse {

    private Meta meta;
    private List<Comment> data;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<Comment> getData() {
        return data;
    }

    public void setData(List<Comment> data) {
        this.data = data;
    }
}

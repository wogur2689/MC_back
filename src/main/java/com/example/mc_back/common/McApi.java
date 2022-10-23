package com.example.mc_back.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NonNull;

public class McApi {
    @NonNull
    @JsonProperty(value = "head")
    private CommonResult head;

    @JsonProperty(value = "body")
    private Object body;

    public McApi(@NonNull CommonResult head) {this.head = head;}

    public McApi(@NonNull CommonResult head, Object body) {
        this.head = head;
        this.body = body;
    }
}

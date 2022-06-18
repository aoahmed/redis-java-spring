package com.redisgcp.redisdemo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Plant implements Serializable {
    private String id;
    private String apiCode;
}

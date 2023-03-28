package com.zkl.center.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -290807110260600686L;
    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}

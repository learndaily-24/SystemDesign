package com.systemdesign.Splitwise.model;

public class User {

    private String id;
    private String name;
    private String email;
    private String password;
    private List<Group> groups;
    private Map<String, BigDecimal> balances;
}

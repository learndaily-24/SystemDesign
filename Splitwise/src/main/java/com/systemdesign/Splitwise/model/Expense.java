package com.systemdesign.Splitwise.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

public class Expense {

    private String id;
    private String description;
    private BigDecimal amount;
    private User paidBy;
    private Date date;
    private ExpenseCategory category;
    private Map<User, BigDecimal> splits;
    private Group group;

}

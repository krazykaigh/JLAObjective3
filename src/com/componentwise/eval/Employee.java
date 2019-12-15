package com.componentwise.eval;

import java.util.Date;

public class Employee {

    /**
     * Instance variables
     * boolean variable partTimeFlag
     * added to support new requirements
     */

    private boolean managerFlag;
    private boolean partTimeFlag;
    private String name;
    private Date dateHired;
    private int id;

    // Accessor Methods

    public String getName() {
        return name;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public int getId() {
        return id;
    }

    public boolean isManagerFlag() {
        return managerFlag;
    }

    public boolean isPartTimeFlag() {
        return partTimeFlag;
    }

}

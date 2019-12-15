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
    /**
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return Date dateHire
     */
    public Date getDateHired() {
        return dateHired;
    }

    /**
     *
     * @return int id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return boolean managerFlag
     */
    public boolean isManagerFlag() {
        return managerFlag;
    }

    /**
     *
     * @return boolean partTimeFlag
     */
    public boolean isPartTimeFlag() {
        return partTimeFlag;
    }

}

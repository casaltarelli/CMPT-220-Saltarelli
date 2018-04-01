package com.company;

import java.util.Date;

public class GeometricObject {
    // ----- Question 11.1 -----
    // ----- Global Methods
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    // ----- Methods
    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    // -- Get & Set Methods
    // - Color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // - Filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // - DateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // -- ToString Method
    public String toString() {
        return "Created on " + dateCreated + "\nColor: " + color + " and filled " + filled;
    }


}

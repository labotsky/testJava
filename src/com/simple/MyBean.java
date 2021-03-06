package com.simple;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Labotski_SV on 6/23/2015.
 */
public class MyBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean myBoolean;
    private String myString;
    private List<String> myList;

    public MyBean() {
    }
    public boolean isMyBoolean() {
        return myBoolean;
    }
    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }
    public String getMyString() {
        return myString;
    }
    public void setMyString(String myString) {
        this.myString = myString;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }
}
package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private boolean success;

    public Value() {
    }
    
    public boolean getSucc() {
        return this.success;
    }

    public void setSucc(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Value{" + "succ=" + this.success + '}';
    }
}

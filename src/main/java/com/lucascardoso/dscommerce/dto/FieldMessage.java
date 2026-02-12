package com.lucascardoso.dscommerce.dto;

public class FieldMessage {

    private String fildName;
    private String message;

    public FieldMessage() {
    }

    public FieldMessage(String fildName, String message) {
        this.fildName = fildName;
        this.message = message;
    }

    public String getFildName() {
        return fildName;
    }

    public String getMessage() {
        return message;
    }
}

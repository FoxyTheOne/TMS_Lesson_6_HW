package com.tms.exception;

public class BeginsWith555Exception extends RuntimeException {
    String invoiceNumber;

    public BeginsWith555Exception (String invoiceNumber, String message) {
        super(message);
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "BeginsWith555Exception {"
                + " Invoice number: " + invoiceNumber
                + ", message: " + getMessage()
                + " } ";
    }
}

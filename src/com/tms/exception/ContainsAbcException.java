package com.tms.exception;

public class ContainsAbcException extends RuntimeException {
    String invoiceNumber;

    public ContainsAbcException (String invoiceNumber, String message) {
        super(message);
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "ContainsAbcException {"
                + " Invoice number: " + invoiceNumber
                + ", message: " + getMessage()
                + " } ";
    }
}

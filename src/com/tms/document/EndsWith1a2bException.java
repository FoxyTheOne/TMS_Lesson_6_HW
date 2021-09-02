package com.tms.document;

public class EndsWith1a2bException extends RuntimeException {
    String invoiceNumber;

    public EndsWith1a2bException (String invoiceNumber, String message) {
        super(message);
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "EndsWith1a2bException {"
                + " Invoice number: " + invoiceNumber
                + ", message: " + getMessage()
                + " } ";
    }
}

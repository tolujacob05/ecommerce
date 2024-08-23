package com.tolujacob.ecommerce.email;

import lombok.Getter;
import lombok.Setter;

public enum EmailTemplate {

    PAYMENT_CONFIRMATION("payment-confirmation.html", "Payment successfully processed"),
    ORDER_CONFIRMATION("order-confirmation.html", "Order confirmation")
    ;


    @Getter
    private final String template;
    @Getter
    private final String Subject;

    EmailTemplate(String template, String subject) {
        this.template = template;
        this.Subject = subject;
    }
}

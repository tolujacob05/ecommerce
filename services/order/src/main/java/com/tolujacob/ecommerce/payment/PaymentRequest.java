package com.tolujacob.ecommerce.payment;

import com.tolujacob.ecommerce.customer.CustomerResponse;
import com.tolujacob.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(

        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}

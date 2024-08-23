package com.tolujacob.ecommerce.kafka;

import com.tolujacob.ecommerce.customer.CustomerResponse;
import com.tolujacob.ecommerce.order.PaymentMethod;
import com.tolujacob.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}

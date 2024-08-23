package com.tolujacob.ecommerce.product;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

public record PurchaseRequest(
        @NotEmpty(message = "Product is mandatory")
        Integer productId,
        @Positive(message = "Quantity is mandatory")
        double quantity
) {
}

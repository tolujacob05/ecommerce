package com.tolujacob.ecommerce.notification;

import com.tolujacob.ecommerce.kafka.payment.PaymentConfirmation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepositiory extends MongoRepository<Notification, String> {
}

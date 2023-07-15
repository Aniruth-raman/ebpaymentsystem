package com.group2.capstone.EBPaymentSystem.notification.models;

import com.group2.capstone.EBPaymentSystem.billing.models.UserProfile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NotificationMessage {
    private UserProfile userProfile;
    private String subject;
    private String message;

}
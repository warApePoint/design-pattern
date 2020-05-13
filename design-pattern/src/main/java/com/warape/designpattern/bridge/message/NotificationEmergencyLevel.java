package com.warape.designpattern.bridge.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NotificationEmergencyLevel {
    SEVERE, URGENCY, NORMAL, TRIVIAL
}

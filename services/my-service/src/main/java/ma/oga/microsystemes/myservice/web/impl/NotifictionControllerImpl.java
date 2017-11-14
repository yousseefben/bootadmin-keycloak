package ma.oga.microsystemes.myservice.web.impl;

import ma.oga.microsystemes.myservice.domaine.Notification;
import ma.oga.microsystemes.myservice.service.NotificationService;
import ma.oga.microsystemes.myservice.web.NotificationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;

@RestController
public class NotifictionControllerImpl implements NotificationController {

    @Autowired
    private NotificationService notificationService;

    @Override
    public Callable<List<Notification>> loadNotifications() {
        return () -> notificationService.loadAllNotifications();
    }
}
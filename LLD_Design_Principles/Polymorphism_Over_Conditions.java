public class Polymorphism_Over_Conditions {

    // Without Polymorphism: Using conditional logic if-else or switch case
    public class NotificationService1 {
        public void sendNotification(String type) {
            if (type.equals("Email")) {
                sendEmail();
            } else if (type.equals("SMS")) {
                sendSMS();
            } else if (type.equals("Push")) {
                sendPushNotification();
            }
        }

        private void sendEmail() {
            // send email logic
        }

        private void sendSMS() {
            // send SMS logic
        }

        private void sendPushNotification() {
            // send push notification logic
        }
    }

    // ******************************************************************************************
    // With Polymorphism: Using polymorphic method calls
    public interface Notification {
        void send();
    }

    public class EmailNotification implements Notification {
        public void send() {
            // send email logic
        }
    }

    public class SMSNotification implements Notification {
        public void send() {
            // send SMS logic
        }
    }

    public class PushNotification implements Notification {
        public void send() {
            // send push notification logic
        }
    }

    // Which class's send() is called, will depend upon the type of object passed into NotificationService2.sendNotification() method.
    public class NotificationService2 {
        public void sendNotification(Notification notification) {
            notification.send();
        }
    }
}

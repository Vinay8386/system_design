package SOLID_Principal_using_Notification;

public class NotificationService {
    void sendNotification(String type, String message){
        if(type.equals("EMAIL")){
            //email logic
            System.out.println("Email Notification Sent");
        }
        if(type.equals("SMS")){
            //SMS logic
            System.out.println("SMS Notification Sent");
        }
        if(type.equals("PUSH")){
            //PUSH logic
            System.out.println("PUSH Notification");
        }
    }
}

package DesignPattern.Creational_Design_Pattern.Builder_Design_Pattern;

public class Notification {

    //required field
    private final String to;
    private final String message;

    //optional field
    private final String subject;
    private final String cc;
    private final String bcc;
    private final int priority;

    //private constructor
    private Notification(Builder builder) {
        this.to = builder.to;
        this.message = builder.message;
        this.subject = builder.subject;
        this.cc = builder.cc;
        this.bcc = builder.bcc;
        this.priority = builder.priority;
    }


    //static nested Builder class
    public static class Builder {
        private final String to;
        private final String message;

        // optional (default values)
        private String subject="";
        private String cc="";
        private String bcc="";
        private int priority=0;

        // Step 1️⃣ mandatory data
        public Builder(String to, String message) {
            this.to = to;
            this.message = message;
        }

        // Step 2️⃣ optional setters
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder cc(String cc) {
            this.cc = cc;
            return this;
        }

        public Builder bcc(String bcc) {
            this.bcc = bcc;
            return this;
        }

        public Builder priority(int priority) {
            this.priority = priority;
            return this;
        }

        // Step 3️⃣ final object creation
        public Notification build() {
            return new Notification(this);
        }

    }
    @Override
    public String toString() {
        return "Notification [to=" + to + ", message=" + message +
                ", subject=" + subject + ", cc=" + cc +
                ", bcc=" + bcc + ", priority=" + priority + "]";
    }
}
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier basic = new EmailNotifier();
        Notifier sms = new SMSNotifierDecorator(basic);
        Notifier slackAndSms = new SlackNotifierDecorator(sms);

        System.out.println("Simple Email only:");
        basic.send("Hello");

        System.out.println("\nEmail + SMS:");
        sms.send("Hello");
        
        System.out.println("\nEmail + SMS + Slack:");
        slackAndSms.send("Hello");
    }
}
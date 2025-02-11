/*
оздать интерфейс MailDeliveryService с одним методом void sendMail().
Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
Создайте класс Email, который должен реализовать интерфейс MailDeliveryService.
 Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде:
 «Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
Создайте класс Sender. Реализуйте в нем метод send(), который в качестве аргумента принимает
MailDeliveryService и отправляет почту с помощью данной службы.
Реализуйте диалог с пользователем (использовать Scanner), как отправлять почту
 и отправлять ее с помощью Sender.

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        System.out.println(" Выберите способ отправки почты: ");
        System.out.println("1. DHL");
        System.out.println("2. Email");
        System.out.println("3. Голубь");
        int select = scanner.nextInt();

        MailDeliveryService mailDeliveryService;
        switch (select) {
            case 1:
            mailDeliveryService = new DHL();
            break;
            case 2:
            mailDeliveryService = new Email();
            break;
            case 3:
                mailDeliveryService = new Pigeon();
                break;
            default:
                System.out.println("Error");
                scanner.close();
                return;



        }
        sender.send(mailDeliveryService);
        scanner.close();
    }
}
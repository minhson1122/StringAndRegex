package phone;

import java.util.Scanner;

public class PhoneTest {
    private static Phone phone;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phone1 = new Phone();
        System.out.println("mời nhập sdt :");
        String a = scanner.nextLine();
        boolean check = phone1.validate(a);
        System.out.println(check);
        }
    }


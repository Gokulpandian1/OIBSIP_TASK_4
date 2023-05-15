//package onlineExamSystem;

import java.util.*;

public class onlineExamSystem {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> info = new HashMap<String, Integer>();

    public void login() {
        info.put("gokul1", 111111);
        info.put("gokul2", 222222);
        info.put("gokul3", 333333);
        info.put("gokul4", 444444);
        info.put("gokul5", 555555);
        String id;
        int pwd;
        System.out.println("LOGIN");
        System.out.println("Enter Username:");
        id = sc.next();
        System.out.println("Enter Passoword:");
        pwd = sc.nextInt();
        if (info.containsKey(id) && info.get(id) == pwd) {
            System.out.println("\nLogin successful!");
            menu();
        } else {
            System.out.println("\nInvalid Username or Password.\nTry again!!!\n");
            login();
        }
    }

    public void menu() {
        int ch;
        System.out.println("\nEnter your Choice:");
        System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
        ch = sc.nextInt();
        switch (ch) {
            case 1:
                info = update();
                menu();
                break;
            case 2:
                startExam();
                menu();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong choice!!! Choose correct choice");
        }
    }

    public HashMap<String, Integer> update() {
        String update_id;
        int update_pwd;
        System.out.println("Enter Username:");
        update_id = sc.next();
        System.out.println("Enter Old Password:");
        update_pwd = sc.nextInt();
        if (info.containsKey(update_id) && info.get(update_id) == update_pwd) {
            System.out.println("Enter New Password:");
            update_pwd = sc.nextInt();
            info.replace(update_id, update_pwd);
            System.out.println("Password Changed Successfully!!!");
        } else {
            System.out.println("User not found.\n");
        }
        return info;
    }

    public void startExam() {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + 30;
        int score = 0, ans;

        while (System.currentTimeMillis() < endTime) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("Q1.What does cpu stand for?");
            System.out.println(
                    "1.Central Processing Unit \t2.control Processing Unit \t3.Computer Processing Unit \t4.Computer Programming Unit");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if (ans == 1)
                score += 5;
            else
                score--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q2.What does ALU stand for?");
            System.out.println(
                    "1.Array Logic Unit\t2.Arithemetic Logic Unit\t3.Application Logic Unit\t4.Automatic Logic Unit");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if (ans == 2)
                score += 5;
            else
                score--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q3.Which of the following is the smallest unit of memory?");
            System.out.println("1.Byte\t2.Bit\t3.Nibble\t4.Kb");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if (ans == 2)
                score += 5;
            else
                score--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q4.A megabyte, also known as a MB,contains ");
            System.out.println(
                    "1.512 bytes\t2.1024 bytes\t3.1000 kilobytes\t4.1024 kilobytes");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if (ans == 4)
                score += 5;
            else
                score--;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Q5.Which of the following options represents a non-volatile memory?");
            System.out.println("1.DRAM\t2.SROM\t3.ROM\t4.None of the above");
            System.out.print("Enter Option: ");
            ans = sc.nextInt();
            if (ans == 3)
                score += 5;
            else
                score--;
            System.out.println("-------------------------------------------------------------");
            break;
        }
        System.out.println("Exam Finished!!!");
        System.out.println();
        System.out.println("Your Score is " + score);
        if (score > 10)
            System.out.println("Congratulations you passed!!!");
        else
            System.out.println("Better Luck Next Time!!!");
    }

    public static void main(String args[]) {
        onlineExamSystem obj = new onlineExamSystem();
        obj.login();
    }
}

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static int opt;
    static ArrayList<addemployee> list=new ArrayList<addemployee>();
    static  int empcode,salary,phone;
    static String empname,designation,email,address,companyname;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        while(true)
        {
            System.out.println("1 : Add Employee");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("enter the empcode");
                    empcode = sc.nextInt();
                    System.out.println("enter the empname");
                    empname = sc.next();
                    System.out.println("enter the designation");
                    designation = sc.next();
                    System.out.println("enter the company name");
                    companyname = sc.next();
                    System.out.println("enter the salary");
                    salary = sc.nextInt();
                    System.out.println("Enter the Phone number");
                    phone = sc.nextInt();
                    System.out.println("enter the email");
                    email = sc.next();
                    System.out.println("enter the address");
                    address = sc.next();
                    list.add(new addemployee(empcode,salary,phone,empname,designation,companyname,email,address));
                    for (addemployee e : list) {

                        System.out.println(e.empname);
                    }

            }
        }
    }
}
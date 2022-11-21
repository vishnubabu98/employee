import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static int opt;
    static ArrayList<AddEmployee> list=new ArrayList<AddEmployee>();
    static  int empcode,salary,phone;
    static String empname,designation,email,address,companyname;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


        while(true) {
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
                    list.add(new AddEmployee(empcode,salary,phone,empname,designation,companyname,email,address));
                    for (AddEmployee e : list) {

                        System.out.println(e.empname);
                    }
                case 2:

                    System.out.println("View Employee List");
                    for(AddEmployee e : list)
                    {
                        System.out.println("Employee Id :"+e.empcode);
                        System.out.println("Employee Name :"+e.empname);
                        System.out.println("Designataion :"+e.designation);
                        System.out.println("Compnay Name :"+e.companyname);
                        System.out.println("Salary :"+e.salary);
                        System.out.println("Phone Nmber :"+e.phone);
                        System.out.println("Email :"+e.email);
                        System.out.println("Address :"+e.address);
                    }
                    break;


            }
        }
    }
}
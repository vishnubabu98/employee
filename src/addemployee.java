public class addemployee {
    int empcode,salary,phone;
    String empname,designation,companyname,email,address;

    public int getEmpcode() {
        return empcode;
    }

    public int getSalary() {
        return salary;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmpname() {
        return empname;
    }

    public String getDesignation() {
        return designation;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    addemployee(int empcode, int salary, int phone, String empname, String designation, String companyname, String email, String address)
    {
        this.empcode=empcode;
        this.salary=salary;
        this.phone=phone;
        this.empname=empname;
        this.designation=designation;
        this.companyname=companyname;
        this.email=email;
        this.address=address;
    }
}

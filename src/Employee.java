import java.util.*;
public class Employee
{
	int emp_no,basic,hra,it,salary;
public String emp_name,join_date,design_code,dept,designation;
Employee(int emp_no,int basic,int hra,int da,int it,String emp_name,String join_date,String design_code,String dept,String designation)
{
	this.emp_no=emp_no;
	this.basic=basic;
	this.hra=hra;
	this.it=it;
	this.emp_name=emp_name;
	this.join_date=join_date;
	this.design_code=design_code;
	this.dept=dept;
	this.designation=designation;

}
public void display()
{
	int da=0;
	switch(design_code)
	{
	case "e":
				da=20000;
				break;
	case "c":
				da=32000;
				break;
	case "k":
				da=12000;
				break;
	case "r":
				da=15000;
				break;
	}
	salary=basic+hra+da-it;
	System.out.println("Emp No. Emp Name Department Designation salary");
	System.out.println(""+emp_no+"    "+emp_name+"   "+dept+"         "+designation+"   "+salary);
}
public static void main(String args[])
{
	Employee[] e=new Employee[4];
	e[0]=new Employee(1001,20000,8000,20000,3000,"Ashish","01/04/2019","e","R&D","Engineer");
	e[1]=new Employee(1002,40000,9000,30000,4000,"Ramesh","03/04/2019","c","PM","Concultant");
	e[2]=new Employee(1003,60000,1000,40000,5000,"Mahesh","05/04/2019","k","ACCT","clerk");
	e[3]=new Employee(1004,80000,6000,50000,6000,"Rajnesh","08/04/2019","r","DESK","receptionist");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the id to be searched");
	int a=s.nextInt();

	for(int m=0;m<4;m++)
	{
		if(e[m].emp_no==a)
		{
			e[m].display();
		}
	}
}
}

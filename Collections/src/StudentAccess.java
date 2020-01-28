import java.util.*;
class Student{
      String regno;
      String name;
      Student(String regno,String name)
      {
    	  this.name=name;
    	  this.regno=regno;
      }
      void display()
      {
    	  System.out.println("Student Name : "+name);
    	  System.out.println("Student registration number : "+regno);
      }
}
public class StudentAccess
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String regno,name;
        Student stu[]=new Student[2]; 
        for(int i=0;i<stu.length;i++)
        {
        	regno=sc.nextLine();
        	name=sc.nextLine();
        	stu[i]=new Student(regno,name);
        	stu[i].display();
        }
		
	}
}

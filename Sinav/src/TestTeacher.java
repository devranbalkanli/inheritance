import java.util.Scanner;


public class TestTeacher {
	public static void main(String []args) {
		
		System.out.println("Nesne sayisi:" + Teacher.getCount());
		
		Teacher t1=new Teacher();
		t1.print();
		
		System.out.println("Nesne sayisi:" + Teacher.getCount());
		
		Teacher t2=new Teacher(1242,"Devran",21);
		t2.print();
		
		System.out.println("Nesne sayisi:" + Teacher.getCount());
		
		Teacher t3=new Teacher(1049,"Can");
		t3.print();
		t3.setAge(25);
		t3.print();
		
		System.out.println("Nesne sayisi:" + Teacher.getCount());
		
		Teacher t4=createObject();
		t4.print();
		}
	
		
public static Teacher createObject() {
	int id,age;
	String name;
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("id icin bir tam sayý giriniz");
	id=input.nextInt();
	
	System.out.println("name icin bir isim giriniz");
	name=input.next();
	
	System.out.println("age icin bir tamsayý giriniz");
	age=input.nextInt();
	
	return new Teacher(id,name,age);
	
      }
	
}

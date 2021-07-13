
public class Teacher {
	private int id;
	private String name;
	private int age;
	private static int count=0;
	
	Teacher(){   //fabrika ayarlarý
		this.id=1;
		this.name="xxxxx";
		this.age=0;
		count++;
	}

	Teacher(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
		count++;
		
	}
	
	Teacher(int id,String name){
		this.id=id;
		this.name=name;
		count++;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void print() {
		System.out.println("id:"+this.id + "\t Name:" + this.name + "\t age:"+this.age);
	}
	public static int getCount() {
		return count;
		
	}
}

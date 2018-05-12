package com.kevin.zmq.test;
class liyan{
	 private int age;
	 private String name;
	 private String sex;
	 private String hoby;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHoby() {
		return hoby;
	}
	public void setHoby(String hoby) {
		this.hoby = hoby;
	}
	public liyan(int age, String name, String sex, String hoby) {
		super();
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.hoby = hoby;
	}
	public liyan(int age, String sex, String hoby) {
		super();
		this.age = age;

		this.sex = sex;
		this.hoby = hoby;
	}
	public liyan(String sex, String hoby) {
		super();
		this.sex = sex;
		this.hoby = hoby;
	}

	public liyan() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "liyan [age=" + age + ", name=" + name + ", sex=" + sex + ", hoby=" + hoby + "]";
	}
	
}

class liyangds{
	 private int age;
	 private String name;
	 private String sex;
	 private String hoby;
	 public void say(){
		 System.out.println("我是大大");
	 }
}
class liyangddd extends liyangds{
	 private int age;
	 private String name;
	 private String sex;
	 private String hoby;
	 
	 public void say(){
		 System.out.println("我是子类方法");
	 }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getHoby() {
		return hoby;
	}
	public void setHoby(String hoby) {
		this.hoby = hoby;
	}
	@Override
	public String toString() {
		return "liyangddd [age=" + age + ", name=" + name + ", sex=" + sex + ", hoby=" + hoby + "]";
	}
	 
	
	
}

class liyangdddd{
	 private int age;
	 private String name;
	 private String sex;
	 private String hoby;
	 public void say(){
		 System.out.println("我是大大");
	 }
}
/**
 * 构造方法
 * @author 公共
 *
 */
public class GzMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		liyan aa=new liyan();
		System.out.println(aa);
		liyan aa1=new liyan(20,"李阳","男");
		System.out.println(aa1);
		
		liyangddd aaaa=new liyangddd();
		aaaa.setAge(11);
		aaaa.setName("lyya");
		System.out.println(aaaa.toString());
		aaaa.say();
	}

}


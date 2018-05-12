package com.kevin.zmq.test;

class A{
	public void say(){
		System.out.println("A");
	}
	public void say(String aa){
		System.out.println("say AA");
	}
}
class B extends A{
	
}
class C extends B{
	
}
class D extends C{
	public void say(){
		System.out.println("D");
	}
	public void say(String aa){
		System.out.println("say DD");
	}
}


public class testJC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      D dd=new  D();
      dd.say();
      String bb="ddddd";
      dd.say(bb);
      
	}

}

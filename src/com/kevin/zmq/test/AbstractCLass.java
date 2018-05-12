package com.kevin.zmq.test;
/**
 *抽象类，抽象类没有方法体
 *子类必须继承父类的方法
 *目的是为了不想方法名被改了，但是内容在继承的过程中来重写
 * @author 公共
 *
 */
abstract class  AA{
	public abstract  void say();
		
	public void method() {
		System.out.println("method");
	}
	
}
 class  BB extends AA{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hhh");
	}

	
	
}
abstract class CC extends BB{
	
}
abstract class  DD extends CC{
	public   void  say(){
		System.out.println("D");
	}
	public  void say(String aa){
		System.out.println("say DD");
	}
}
public class AbstractCLass {
  public static void main(String[] args) {
	  BB bb =new BB();
	  bb.say();
   }
}

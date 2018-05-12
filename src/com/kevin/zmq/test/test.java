package com.kevin.zmq.test;

import org.junit.Test;

public class test {

	public static void main(String[] args) {
		System.out.println("你好编程世界，你是否还记得最初的自己");
        
	}
	/**
	 * 求5！
	 */
	@Test
    public void test(){
    	int i=0;
    	int f=1;
    	for(i=1;i<=8;i++){
    		f=f*i;
    		System.out.println(f);
    	}
    	
    	System.out.println(f);
    	System.out.println("这个是方法");
	 }
    @Test
    public void test1(){
    	int f=1;
    	int i=1;
    	while(i<5){
    		f=f*i;
    		i=i+1;
    		System.out.println(f);
    		
    	}
    }
    @Test
    public void test3(){
    	
    	int i=1;
    	int f=1;
    	do{	 		
    		f=f*i;
    		i=i+1;
    		System.out.println("i="+i);
    		System.out.println("f="+f);
    	}while(i<5);
    		System.out.println("退出循环体");
    	
    		int sum = 0;
    		int x = 1;
    		do{
    			sum+=x;
    			x++;
    		}while (x<=100);
    		System.out.println(sum);
    }
    /**
     * 嵌套循环
     */
    @Test
    public void test4(){
    	//同样的事情做了很多次ddd
    			for(int y=0; y<4; y++) {
    				for(int x=0; x<5; x++) {
    					System.out.print("*");
    				}
    				System.out.println();
    			}
    			
    			for(int x=0;x<5;x++){
    				for(int y=0;y<x;y++){
    					System.out.print("#");
    				}
    				System.out.println();
    			}
    			
    			for(int x=0;x<5;x++){
    				for(int y=0;y<=x;y++){
    					System.out.print("#");
    				}
    				System.out.println();
    			}
    			for(int x=5;x>=0;x--){
    				for(int y=0;y<=x;y++){
    					System.out.print("#");
    				}
    				System.out.println();
    			}
    }
    /**
     * 99乘法表
     */
    @Test
    public void test99mult(){
    	
    	for(int x=1;x<=9;x++){
    		for(int y=1;y<=x;y++){
    			System.out.print("|");
    			System.out.print(x*y+"="+x+"*"+y);
    		}
    		System.out.println();
    	}
    }
   
    
}

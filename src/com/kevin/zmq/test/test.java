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
}

package com.kevin.zmq.test;

import org.junit.Test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 /**
     * 99乘法表
     */
    @Test
    public void test99mult(){
    	System.out.println("99乘法表");
    	for(int x=1;x<=9;x++){
    		for(int y=1;y<=x;y++){
    			System.out.print("|");
    			System.out.print(x*y+"="+x+"*"+y);
    		}
    		System.out.println();
    	}
    }
}

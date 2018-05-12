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
    /**
     * 方法重载
     */
    @Test
    public void methodreload(){
    	int b=sum(2,3);
    	System.out.println(b);
    	double  c=sum(2.09,3.08);
    	System.out.println(c);
    	double  d=sum(3,9.03);
    	System.out.println(d);
    }
    
    public static int sum(int a,int b){
    	System.out.println("sum1");
    	return a+b;
    }
    public static double sum(double a,double b){
    	System.out.println("sum2");
    	return a+b;
    }
    public static double sum(int a,double b){
    	System.out.println("sum3");
    	return a+b;
    }
    /**
     * 遍历二维数组
     */
    @Test
    public void twoarray(){
    	int[][] arr={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
    	for(int x=0;x<arr.length;x++){
    		for(int y=0;y<arr[x].length;y++){
    			System.out.print(arr[x][y]);
    		}
    		System.out.println();
    	}
    	System.out.println("aaaaa");
    }
    @Test
    public void testarraymethod(){
    	int arr[]={23,12,3,5,14,5,8};
    	change(arr);
        for(int i=0;i<arr.length;i++){
        	System.out.println(arr[i]);
        }
        
        int a=3;
        int b=4;
        change(a,b);
        System.out.println(a+"="+b);
    }
    public void change(int arr[]){
    
    	for(int i=0;i<arr.length;i++){
    		
    		if(arr[i]%2==0){
    			arr[i]=arr[i]*2;
    		}
    	}
    }
    
    public static void change(int a,int b){
    	
    	a=b;
    	b=a+b;
    	
    }
    
}

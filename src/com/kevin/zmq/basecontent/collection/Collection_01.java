package com.kevin.zmq.basecontent.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

import org.junit.Test;

public class Collection_01 {
/**
 * 集合遍历
 * @param args
 */
	public static void main(String[] args) {
		Collection c=new ArrayList();
		Student s1=new Student("ly1",24);
		Student s2=new Student("ly2",25);
		Student s3=new Student("ly3",26);
		c.add(s1);
		c.add(s2);
		c.add(s3);
	  
	}
/**
 * Collection集合遍历：方式1：通过迭代器
 */
	@Test
	public void testcollect11(){
		Collection c=new ArrayList();
		Student s1=new Student("ly1",24);
		Student s2=new Student("ly2",25);
		Student s3=new Student("ly3",26);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			Student s=	(Student) it.next();
			System.out.println(s.getAge());
			System.out.println(s.getName());
			
		}
	}
	/**
	 * Collection集合遍历：方式2：将集合装换成数组，然后在进行遍历
	 * 
	 * 
	 */
	@Test
	public void testcollect22(){
		Collection c=new ArrayList();
		Student s1=new Student("ly1",24);
		Student s2=new Student("ly2",25);
		Student s3=new Student("ly3",26);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		Object[] obj=c.toArray();
		for(int i=0;i<obj.length;i++){
			Student s = (Student) obj[i];
			System.out.println(s.getAge());
			System.out.println(s.getName());
		}
	}
	/**
	 * 遍历list的三种方式：
	 */
	@Test
	public void testList(){
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("zx01");
		arr.add("zx02");
		arr.add("zx03");
		arr.add("zx04");
		//way1:下标的方式
		System.out.println("way1:下标的方式");
		for(int i=0;i<arr.size();i++){
			arr.get(i);
			System.out.println(arr.get(i));
		}
		System.out.println("way2:增强for循环");
		//way2：增强for循环
		for(String aa:arr){
			System.out.print(aa);
			System.out.print("|");
		}
		System.out.println("way3:通过迭代器");
		Iterator it=arr.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	@Test
	public void testSet(){
		HashSet<String> ss =new HashSet<String>();
		ss.add("kk01");
		ss.add("kk02");
		ss.add("kk03");
		ss.add("kk04");
		/**for(int i=0;i<ss.size();i++){
			System.out.println(ss[i]);
		}*/
		//way1:增强for循环
		for(String a  :ss){
			System.out.println(a);
			
		}
		System.out.println();
		//way2:迭代器
		Iterator it=ss.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	
	}
	@Test
	public void testMap(){
		HashMap<String,String> ma=new HashMap<String,String>();
		ma.put("01", "jianjian01");
		ma.put("02", "jianjian02");
		ma.put("03", "jianjian03");
		ma.put("04", "jianjian04");
		ma.put("05", "jianjian05");
		//way
		Entry<String, String> entry = (Entry<String, String>) ma.entrySet();
		
	}

}

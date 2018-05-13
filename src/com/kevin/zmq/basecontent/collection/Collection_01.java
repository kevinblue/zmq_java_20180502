package com.kevin.zmq.basecontent.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class Collection_01 {
/**
 * 结合遍历
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
	 * Collection集合遍历：方式2：通过迭代器
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

}

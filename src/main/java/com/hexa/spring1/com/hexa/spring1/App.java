package com.hexa.spring1.com.hexa.spring1;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 

{

    public static void main( String[] args )

    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Emplouyee s1=(Emplouyee) context.getBean("emp1");
    	Result res=s1.getRes();
    	System.out.println( s1.toString() );
    	System.out.println( res.toString() );
//    	
    	//Book b1= (Book) context.getBean("book1");
    	
    	//System.out.println(b1.toString());
    }

}
package com.hand;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
   public static void main(String[] args) {
      
	   
	   Scanner in = new Scanner(System.in);
	   
	    ApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FilmJDBCTemplate filmJDBCTemplate = 
				(FilmJDBCTemplate)context.getBean("filmJDBCTemplate");
		String title = null;
		String description = null;
		Integer language_id = 0;
		System.out.println("请输入电影名称(title):");
		title = in.nextLine();
		System.out.println("请输入电影描述(description):");
		description = in.nextLine();
		System.out.println("请输入语言ID(language_id):");
		language_id = in.nextInt();
		filmJDBCTemplate.insert(title, description, language_id);
		
//		filmJDBCTemplate.destroy();
   }
}
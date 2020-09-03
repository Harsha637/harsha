package com.myapp.Bookservice;
import java.util.ArrayList;


import java.util.Date;

import com.myapp.Bookdao.Bookdao;
import com.myapp.model.Book;
import com.myapp.model.Publisher;


import distributor.Distributor;

public class Bookservice {

public static void main(String args[]) 
{


	Bookdao dao=new Bookdao();
	//Book book=dao.getBook(105);
	
	//Book book=new Book(103,"abc", "xyz", new Date());
	//Publisher p=new Publisher();
	//p.setPublisherId("1");
	//p.setPublisherName("test");
	//book.setPublisher(p);
	//System.out.println(dao.saveBook(book));
	Book book=dao.getBook(103);
	System.out.println(book);
	
	
	}


}


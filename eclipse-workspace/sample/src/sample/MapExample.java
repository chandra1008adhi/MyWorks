package sample;

import java.util.*;    
class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
} 
public String info() {
	return (id+" "+name+" "+author+" "+publisher+" "+quantity);
}
}    
public class MapExample {    
public static void main(String[] args) {    
    //Creating map of Books    
    HashMap<Integer,Book> map=new HashMap<Integer,Book>();
    //HashMap map=new HashMap(); 
    //Creating Books    
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
    Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);    
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(3,b3);
    map.put(2,b2);  
      
    //Traversing map 
    TreeMap tm=null;
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
//        int key=entry.getKey();  
//        Book b=entry.getValue();  
//        System.out.println(key+" Details:");  
////        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
//        System.out.println(b.info());
    	tm = new TreeMap();
    	tm.put(entry.getKey(),entry.getValue());
    }    
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
      int key=entry.getKey();  
      Book b=entry.getValue();  
      System.out.println(key+" Details:");  
////      System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
     System.out.println(b.info());
    }
//    int s=map.size();
//    System.out.println(map.entrySet());
//    for(int i=1;i<=s;i++) 
//    {
//    	Book b=map.get(i);
//    	System.out.println(b.info());
//    	
//    }
    	
}    
}    

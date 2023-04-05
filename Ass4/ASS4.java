import java.util.*;
class java5{
public static void main(String [] args){
  Scanner main=new Scanner(System.in);
   System.out.println("1.first");
   
  Book object1=new Book();
 
   System.out.println("Do You Change Anything?(Choose a Option 1 or 2)\n1.Yes \t2.No");
      int a=main.nextInt();
     if(a==1){
 Book object2=new Book();
  
     }
     else if(a==2){
      System.out.println("Thank you");
     }
     else{
      System.out.println("INVALID");
      }
      System.out.println("---------------------------------------------------------------------");
      Date object3=new Date();
      System.out.println("Do You Change Anything?(Choose a Option 1 or 2)\n1.Yes \t2.No");
      int b=main.nextInt();
     if(b==1){
     Date object4=new Date(); 
  
     }
     else if(b==2){
      System.out.println("Thank you");
     }
     else{
      System.out.println("INVALID");
      
     }
      System.out.println("---------------------------------------------------------------------");
      System.out.println("Saving Account");
      
      SavingsAccount customer1=new SavingsAccount(2000,4);
     
       SavingsAccount customer2=new SavingsAccount(3000,4);
         System.out.println("Saver 1 Details:");
      System.out.println(customer1.MonthlyInterest());
      System.out.println("Saver 2 Details:");
       System.out.println(customer2.MonthlyInterest());
        System.out.println("---------------------------------------------------------------------");
        Employee person1=new Employee("Thirumani","Dinesh",10000,10);
        
         System.out.println("Do You Change Anything?(Choose a Option 1 or 2)\n1.Yes \t2.No");
      int C=main.nextInt();
      main.nextLine();
     if(C==1){
     System.out.println("Enter the first name;");
     String fName=main.nextLine();
      System.out.println("Enter the last name;");
     String lName=main.nextLine();
      System.out.println("Enter the month salary;");
     double monsal=main.nextInt();
     
     System.out.println("Enter the hike;");
     double hike=main.nextInt();
      Employee person2=new Employee(fName,lName,monsal,hike);
   
  
     }
     else if(b==2){
      System.out.println("Thank you");
     }
     else{
      System.out.println("INVALID");
      
     }
     ////////////////////////////////////////////////////////////////////////////////////////////////////////
     System.out.println("Matrix");
     Matrix board=new Matrix(4,4);
     
     System.out.println("Do You Change row and coloum?(Choose a Option 1 or 2)\n1.Yes \t2.No");
      int c=main.nextInt();
     if(c==1){
      System.out.println("Enter the row;");
      int row=main.nextInt();
      System.out.println("Enter the coloum;");
      int coloum=main.nextInt();
      Matrix board2=new Matrix(row,coloum);
  
     }
     else if(c==2){
      System.out.println("Thank you");
     }
     else{
      System.out.println("INVALID");
      
     }
     
     }
     }
     
     
     
     class Book{
      String bookName;
      int isbnNum;
      String author;
      String publisher;
      
       Book(){
      Scanner input=new Scanner(System.in);
       System.out.println("Enter the book Name?");
        bookName=input.nextLine();
        System.out.println("Enter the book   ISBN number");  
      isbnNum=input.nextInt();
      input.nextLine();
      System.out.println("Enter the book   author name ");  
      author=input.nextLine();
      System.out.println("Enter the book Publisher ");  
      publisher=input.nextLine();
      getBookData(bookName,isbnNum,author,publisher);
       }
       
       String getBookData(String book,int isbn,String art,String pub)
       {
        System.out.println( "book==>"+book+";"+"\n"+"ISBN number==>"+isbn+";"+"\n"+"author     name==>"+art+";"+"\n"+"publisher name==>"+pub+";");
        return bookName;
      }
      }
       
  class Date{
    int day;
    int month;
    int year;
    
    Date()
    {
    Scanner input2=new Scanner(System.in);
    System.out.println("Enter the day:");
    day=input2.nextInt();
    
    System.out.println("Enter the month:");
    month=input2.nextInt();
    
    System.out.println("Enter the year:");
    year=input2.nextInt();
    
    
    getDate(day,month,year);
    }
    
    void getDate(int userDay,int userMonth,int userYear)
    {
    System.out.println(userDay+"/"+userMonth+"/"+userYear);
    }
    }
    
    class SavingsAccount{
      static double  annualInterestRate;
      private double balance;
      double interest;
      
      
      SavingsAccount(double remain,double inter)
      {
        balance=remain;
        annualInterestRate=inter;
      }
    
    double MonthlyInterest()
    {
       interest=(balance*annualInterestRate)/(12*100.0);
       balance=balance+interest;
       System.out.println(getBalance());
        return Math.round(interest*100.0)/100.0;
       }
       
      String getBalance()
     {
     return ("balance="+balance);
     }
    }
    
    
    
    class Employee
    {
    String firstName;
    String LastName;
    double salary;
    double yearSalary;
   double hike=10;
    
    
    Employee(String fstName,String lstName,double sal,double increm)
     {
      firstName=fstName;
      LastName=lstName;
      salary=sal;
      hike=increm;
      System.out.println(firstName+LastName);
      System.out.println("monthly salary==>"+salary);
     System.out.println("yearly salary==>"+yearlysalary());
      System.out.println("after 10% hike==>"+hikeSalary());
     } 
     
      double yearlysalary()
      {
      return(yearSalary=salary*12);
      }
      
      double hikeSalary()
      {
    hike=(hike/100*yearSalary);
      
     hike+=+yearSalary;
      
      return hike;
      }
      }
      /////////////////////////////////////////////////////////////////////////////
      class Matrix{
       Scanner input1=new Scanner(System.in);
      int row;
      int coloum;
      int count=0;
     
    
      int [][]list;
      Matrix(int x,int y)
      {
      row=x;
      coloum=y;
      matboard();
      print();
      }
      
      void matboard()
      {
      list=new int[row*row][coloum*coloum];
      for(int i=1; i<=row; i++)
      {
        for(int j=1; j<=coloum; j++)
        {
         
           System.out.print("Enter the "+(i)+" row "+(j)+" column:");
           list[i][j]=input1.nextInt();
          }
           }
           
            
           }
           
           void print(){
           for(int i=1; i<=row; i++)
            {
         for(int j=1; j<=coloum; j++)
           {
       
         System.out.print(list[i][j]+"  ");
           count++;
          }
          System.out.println("\n");
           }
           
           }
           }
           
     
      
         
         
      
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
       
              

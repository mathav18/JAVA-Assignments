class java17{
	public static void main(String args[]){
      Bank object1=new BankA();
      System.out.println(object1.getBalance(100));
      Bank object2=new BankB();
      System.out.println( object2.getBalance(150));
      Bank object3=new BankA();
      System.out.println(object3.getBalance(200));
      System.out.println("");
     
      Marks person1=new Student1(98,70,90);
      System.out.println(person1.getPercentage());
      Marks person2=new Student2(67,98,35,80);
      System.out.println(person2.getPercentage());
      System.out.println("");

      
      Animal C=new cat();
      C.Eat();
      System.out.println(C.makeSound());
      Animal D=new dog();
      D.Eat();
      System.out.println(D.makeSound());
      System.out.println("");
    
      Shape area1=new area();
      System.out.println(area1.RectangleArea(4,3));
      System.out.println(area1.SquareArea(4));
      System.out.println(area1.CircleArea(2));
      System.out.println("");
      
       Shape area2=new area();
       Shape area3=new area();
       Shape area4=new area();
       Shape area5=new area();
            Shape []arr={area2,area2,area3,area4};
            int []value={3,4,5,6,7};
            for(int i=0;i<5-1;i++){
            	 System.out.println(arr[i].RectangleArea(value[i],value[i+1]));
                 System.out.println(arr[i].SquareArea(value[i]));
                 System.out.println(arr[i].CircleArea(value[i]));
                 System.out.println("");
            }
        }
    }

    
abstract class Bank{
	abstract int getBalance(int a);
}

class BankA extends Bank{
	int getBalance(int a){
		return a;
	}
}
class BankB extends Bank{
	int getBalance(int b){
		return b;
	}
}
class BankC extends Bank{
	int getBalance(int c){
		return c;
	}
}


abstract class Marks{
	abstract double getPercentage();
}

class Student1 extends Marks{
	int sub1;
	int sub2;
	int sub3;

	Student1(int a,int b,int c){
    sub1=a;
    sub2=b;
    sub3=c;
	}
	double getPercentage(){
		return (((sub1+sub2+sub3)*100)/300);
	}
	
}

class Student2 extends Marks{
	int sub1;
	int sub2;
	int sub3;
	int sub4;

	Student2(int a,int b,int c,int d){
    sub1=a;
    sub2=b;
    sub3=c;
    sub4=d;
	}
	double getPercentage(){
		return (((sub1+sub2+sub3+sub4)*100)/400);
	}
	
}

abstract class Animal{
	void Eat(){
		System.out.println("Animal is Eating");
	}
	abstract String makeSound();
}

class cat extends Animal{
	String makeSound(){
		return "meow meow";
	}
}
class dog extends Animal{
	String makeSound(){
		return "bark bark";
	}
}



abstract class Shape{
	abstract String RectangleArea(int a,int b);
	abstract String SquareArea(int a);
	abstract String CircleArea(int a);
}

class area extends Shape{
	String RectangleArea(int a,int b){
		return"The rectangle area is=>"+(a*b);
	}
	String SquareArea(int a){
		return"The square area is=>"+(a*a);
	}

	String CircleArea(int a){
		return"The circle area is=>"+(3.14*a*a);
	}
}
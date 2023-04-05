import java.util.*;
class thirdAssignment{
  public static void main(String [] args){
      Scanner input=new Scanner(System.in);
      System.out.println("1.Table");
      System.out.println("ENTER THE NUMBER");
      int data1=input.nextInt();
      table.mul(data1);
      //second
       System.out.println("2.factorial");
      System.out.println("ENTER THE NUMBER");
      long data2=input.nextLong();
      fact.rial(data2);
      //three
     System.out.println("3.Reverse");
      System.out.println("ENTER THE NUMBER");
      long data3=input.nextLong();
      reverse.num(data3);
     //four
      System.out.println("4.Pattern");
      System.out.println("ENTER THE NUMBER");
      int data4=input.nextInt();
      print.pattern(data4);
      //five
       System.out.println("5. Don't give me five:");
      System.out.println("ENTER THE Start value");
      int data5=input.nextInt();
      System.out.println("ENTER THE end value");
      int data6=input.nextInt();
      five.give(data5,data6);
      }
      }
      
      
      class table{
      public static int mul(int x){
       for(int i=1; i<17; i++){
         System.out.println(x+"*"+i+"="+(x*i));
        }
        return 0;
      }
      }
      //second
class fact{
    public static long rial(long x){
      long fact=1;
      for(long i=1; i<=x; i++){
         fact*=i;
         }
         System.out.println(fact);
         return 0;
         }
       }
  //three
  class reverse{
     public static long num(long x){
     long ans=0;
     while(x!=0){
     long j= (x%10);
     ans=ans*10+j;
     x/=10;
      }
      System.out.println(ans);
      return ans;
      }
      }
      //four
      //pattern 1
      class print{
      
        public static String pattern(int x){
        String ans="**********";
           for(int i=0; i<x; i++){
           System.out.println(ans);
           }
           //pattern2
           for(int i=0; i<=x; i++){
              for(int k=0; k<i; k++){
              System.out.print("*");
           }
           System.out.print("\n");
           }
           //pattern36
           for(int i=1; i<=x; i++){
              for(int j=1; j<=x-i; j++){
              System.out.print(" ");
              }
              for(int k=1; k<=i; k++){
              System.out.print("*");
              }
              System.out.println();
              }
               //pattern 4      
               int c=1;
	
	for (int i=1;i<=x;i++){
		for(int j=2*(x-i);j>1;j--){
			System.out.print(" ");
		}
		for (int k=1;k<=c;k++){
			System.out.print("* ");
		}
		System.out.println();
		c+=2;
	}
	//pattern 5
	 int d=1;
	 for (int i=1;i<=x;i++){
		for(int j=2*(x-i);j>1;j--){
			System.out.print(" ");
		}
		for (int k=1;k<=d;k++){
			System.out.print(i+" ");
		}
		System.out.println();
		d+=2;
	}
            return ans;
            }
         }
         //five
         class five{
          public static int give(int x,int y){
           for(int i=x; i<=y; i++){
             if(i%5==0&&i%2!=0){
             }
             else{
             System.out.println(i);
             }
             }
             return 0;
       }
 }
             

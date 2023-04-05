 import java.util.*;
 class java12{
public static void main(String[]args)
{

	Duplicate dup=new Duplicate();
dup.removeDup("king virat kholi virat kholi virat");
System.out.println("");

Merge connect=new Merge();
String arr1[]={"red","blue","green","pink","cyan"};
String arr2[]={"beach","cyan","red","mejenda","green","red"};
connect.MergeArray(arr1,arr2);

System.out.println("");
StringBuffer data1=new StringBuffer("zoho");
reverse obj=new reverse();
obj.Buffer(data1);
 StringBuilder data2=new StringBuilder("school");
obj.builder(data2);
obj.str("tenkasi");
System.out.println("");
/////////////////////////////////////////////////////
palindrome obj2=new palindrome();
StringBuffer data4=new StringBuffer("moon");
StringBuilder data5=new StringBuilder("anna");
obj2.buffer(data4);
obj2.builder(data5);
obj2.string("level");
System.out.println("");
///////////////////////////////////////
 String data6 = "abc"; 
  int len = data6.length(); 
 Permutations permute= new Permutations(); 
        permute.getPemutation(data6, 0, len-1); 
        System.out.println("");
      }
}


class Duplicate{
public static	void removeDup(String str){
		String ans="";
		str=str.toUpperCase();
        String []temp=str.split(" ");
        System.out.println("count of word==>"+-temp.length);
        int count=0;

        for(int i=0;i<temp.length;i++){
        	count=1;
          for(int j=i+1;j<temp.length;j++){
          	if(temp[i].equals(temp[j])){
          		count++;
          		temp[j]="0";
          	}
          }
            if(count > 1 && temp[i] != "0") {
            	ans+=temp[i]+",";
            }   
             
        }


     System.out.println("Duplicat word==>"+ans);

	}
}


class Merge{

	void MergeArray(String []arr1,String[]arr2){
		int a=arr1.length;
		int b=arr2.length;
		String answer="";
		String temp="";
		String newArray[]=new String[a+b];
		System.arraycopy(arr1,0,newArray,0,a);
		System.arraycopy(arr2,0,newArray,a,b);

      Arrays.sort(newArray);
      

      for(int i=0;i<newArray.length-1;i++){
      	if(newArray[i]!=newArray[i+1]){
     
         answer+=","+newArray[i]; 
           }
      }
    System.out.println(answer+","+newArray[newArray.length-1]);
   
}

	}




class reverse{
	void Buffer(StringBuffer data1){
		System.out.println(data1.reverse());
	}

	void builder(StringBuilder data2){
		System.out.println(data2.reverse());
	}

	void str(String data3){
		char a[]=data3.toCharArray();
		String output="";
		for(int i=1;i<=a.length;i++){
			output+=a[a.length-i]+"";
		}
		System.out.println(output);
	}
}

class palindrome{
	void buffer(StringBuffer data4){
		String d1=data4.toString();
		String data5=data4.reverse().toString();
		if(d1.equals(data5)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
	}
}


	void builder(StringBuilder data6){
		String dup=data6.toString();
		String org=data6.reverse().toString();
		if(dup.equals(org)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
   }
}

	void string(String data7){
		StringBuilder dup=new StringBuilder(data7);
		String rev=dup.reverse().toString();
		if(rev.equals(data7)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
       }
    }
}


class Permutations{
     void getPemutation(String str, int l, int r) { 
     	// Permutations temp=new Permutations();
        if (l == r) {

         System.out.println(str); 
        }
        else{ 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                getPemutation(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
    } 

   String swap(String a, int i, int j) 
    { 
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
    } 



    
} 











import java.io.*;
class stringreplace 
{
public static void main(String args[])
{
Scanner sc =new Scnner(System.in);
String s1,s2;
System.out.print("enter first string");
s1=sc.nextLine();
s2=s1.replace('a', 'z');
System.out.print(s2);
}
}
D:\>javac stringreplace.java

D:\>java stringreplace
enter first stringamma
zmmz
D:\>


import java.io.*;
import java.util.*;
class stringwordcount
{
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
String s1;
System.out.print("enter first string");
s1=sc.nextLine();
String st[]=s1.split(" ");
int n=st.length;
System.out.print(n);
}
}



D:\>javac stringwordcount.java

D:\>java stringwordcount
enter first stringchai_hi_th_
3
D:\>javac stringwordcount.java

D:\>java stringwordcount
enter first stringji gyt dgts
3
D:\>

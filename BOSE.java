import java.io.*;
class BOSE{
public static void main(String args[])throws Exception{
FileOutputStream fout=new FileOutputStream("file1.txt");
BufferedOutputStream bout=new BufferedOutputStream(fout);
FileOutputStream fout1=new FileOutputStream("file2.txt");
BufferedOutputStream bout1=new BufferedOutputStream(fout1);
String s="hii";
byte b[]=s.getBytes();
String s1="Hello world";
byte b1[]=s1.getBytes();
bout.write(b);
bout1.write(b1);
bout.flush();
bout1.flush();
bout.close();
bout1.close();
fout.close();
fout1.close();
System.out.println("Success");
}
}

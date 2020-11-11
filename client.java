import java.io.*;
import java.net.*;
public class EchoClient

{
public static void main(String args[]) throws Exception
{
try {
int Port;
BufferedReader Buf =new BufferedReader(new
InputStreamReader(System.in));
System.out.print(&quot; Enter the Port Address : &quot; );
Port=Integer.parseInt(Buf.readLine());
Socket sok=new Socket(&quot;localhost&quot;,Port);
if(sok.isConnected()==true)
System.out.println(&quot; Server Socket is Connected Succecfully. &quot;);
InputStream in=sok.getInputStream();
OutputStream ou=sok.getOutputStream();
PrintWriter pr=new PrintWriter(ou);
BufferedReader buf1=new BufferedReader(new
InputStreamReader(System.in));
BufferedReader buf2=new BufferedReader(new
InputStreamReader(in));
String str1,str2;
System.out.print(&quot; Enter the Message : &quot;);
str1=buf1.readLine();
pr.println(str1);
pr.flush();
System.out.println(&quot; Message Send Successfully. &quot;);
str2=buf2.readLine();
System.out.println(&quot; Message From Server : &quot; + str2);
}
catch(Exception e)
{
System.out.println(&quot; Error : &quot; + e.getMessage());
}
}

}
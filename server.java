import java.io.*;
import java.net.*;
public class EchoServer
{
public static void main(String args[]) throws Exception
{
try
{

int Port;
BufferedReader Buf =new BufferedReader(new
InputStreamReader(System.in));
System.out.print(&quot; Enter the Port Address : &quot; );
Port=Integer.parseInt(Buf.readLine());
ServerSocket sok =new ServerSocket(Port);
System.out.println(&quot; Server is Ready To Receive a Message. &quot;);
System.out.println(&quot; Waiting ..... &quot;);
Socket so=sok.accept();
if(so.isConnected()==true)
System.out.println(&quot; Client Socket is Connected Succecfully. &quot;);
InputStream in=so.getInputStream();
OutputStream ou=so.getOutputStream();
PrintWriter pr=new PrintWriter(ou);
BufferedReader buf=new BufferedReader(new
InputStreamReader(in));
String str=buf.readLine();
System.out.println(&quot; Message Received From Client : &quot; + str);
System.out.println(&quot; This Message is Forwarded To Client. &quot;);
pr.println(str);
pr.flush();
}
catch(Exception e)
{
System.out.println(&quot; Error : &quot; + e.getMessage());
}
}
}
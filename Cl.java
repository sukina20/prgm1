import java.net.*;
import java.rmi.*;
import java.io.*;
import java.rmi.Naming.*;
public class Cl
{
        public static void main(String args[])throws IOException,NotBoundException
        {
                F1 a=(F1)Naming.lookup("//192.168.0.20/localhost");
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader br=new BufferedReader(isr);
                BufferedReader br2=new BufferedReader(isr);
                String s1=br.readLine();
                String s2=br2.readLine();
                a.cmpr(s1,s2);
                a.rvs(s1,s2);
                a.ct(s1,s2);
                a.cs(s1,s2);
        }
}


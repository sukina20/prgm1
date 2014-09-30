import java.rmi.*;
import java.rmi.server.*;
import java.rmi.Naming.*;
import java.rmi.registry.*;
import java.io.*;
public class S
{
        public static void main(String args[])throws IOException
        {
                try
                {
                        F2 f=new F2();
                        Naming.rebind("localhost",f);
                        System.out.println("server bound");
                }
                catch(Exception e)
                {}
        }
}


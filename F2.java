import java.net.*;
import java.lang.String;
import java.rmi.*;
import java.rmi.server.*;
public class F2 extends UnicastRemoteObject implements F1
{

        public  F2()throws RemoteException
        {
        }
        public void cmpr(String s1,String s2)throws RemoteException
        {
                int l=s1.length();
                int l2=s2.length();
                int c=0;
                if(l==l2)
                {
                        for(int i=0;i<=l;i++)
                        {
                                if(s1.charAt(i)==s2.charAt(i))
                                c++;
                                else
                                c=0;
                        }
                }
                if(c!=0)
                {
                        System.out.println("Strings are equal");
                }
                else
                        System.out.println("strings are not equal");
        }
        public void rvs(String s1,String s2)throws RemoteException
        {
                String rev="",rev1="";
                int l=s1.length();
		int l1=s2.length();
                for(int i=l-1;i>=0;i--)
                {
                        rev=rev+s1.charAt(i);
                }
		System.out.println("Reverse of first string:"+rev);
		for(int i=l1-1;i>=0;i--)
		{
			rev1=rev1+s2.charAt(i);
		}
        }
        public void ct(String s1,String s2)throws RemoteException
        {
	
                s1=s1+s2;
                System.out.println("concat:"+s1);
        }
        public void cs(String s1,String s2)throws RemoteException
        {
		String s3,s4;
                s3=s1.toLowerCase();
		s4=s1.toUpperCase();
		System.out.println("First string"+s1);
                System.out.println("lower:"+s3);
		System.out.println("upper:"+s4);

                s3=s2.toLowerCase();
		 s4=s2.toUpperCase();

                System.out.println("Second string"+s2);
                System.out.println("lower:"+s3);
                System.out.println("upper:"+s4);

        }

}


import java.net.*;
import java.lang.String;
import java.rmi.*;
import java.rmi.server.*;
public class F2 extends UnicastRemoteObject implements F1
{


        public  F2()throws RemoteException
        {
        }
        public int cmpr(String s1,String s2)throws RemoteException
        {
                int f;
       		if(s1.compareTo(s2)>0)
		{
			f=1;
			return f;
		}
		else if(s1.compareTo(s2)<0)
		{
			f=-1;
			return f;
		}
		else
		{
			f=0;
			return f;
		}
                
		
                
                
        }
        public String rvs(String s1)throws RemoteException
        {
                String rev="";
                int l=s1.length();
		for(int i=l-1;i>=0;i--)
                {
                        rev=rev+s1.charAt(i);
                }
		return(rev);
		
        }
        public String ct(String s1,String s2)throws RemoteException
        {
	
                s1=s1+s2;
                return(s1);
        }
        public String cs(String s1)throws RemoteException
        {
		String s3;
                s3=s1.toLowerCase();
		return(s3);
	}
	public String cs1(String s1)throws RemoteException
	{
		String s4;
		s4=s1.toUpperCase();
		return(s4);
	}               
	public void close()throws RemoteException
	{
		System.exit(0);
	}
}


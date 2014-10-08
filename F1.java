import java.net.*;
import java.rmi.*;
public interface F1 extends Remote
{
        public int cmpr(String s1,String s2)throws RemoteException;
        public String rvs(String s1)throws RemoteException;
        public String ct(String s1,String s2)throws RemoteException;
        public  String cs (String s1)throws RemoteException;
	public String cs1(String s1)throws RemoteException;
	public void close()throws RemoteException;
}


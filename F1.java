import java.net.*;
import java.rmi.*;
public interface F1 extends Remote
{
        public void cmpr(String s1,String s2)throws RemoteException;
        public void rvs(String s1,String s2)throws RemoteException;
        public void ct(String s1,String s2)throws RemoteException;
        public void cs(String s1,String s2)throws RemoteException;
}


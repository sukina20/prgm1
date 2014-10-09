import java.net.*;
import java.rmi.*;
import java.io.*;
import java.rmi.Naming.*;
public class Cl
{
        public static void main(String args[])throws IOException,NotBoundException
        {
            	int com;
		String rev1,ct1,cs1,cs2;    
                F1 a=(F1)Naming.lookup("//192.168.0.11/localhost");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1,s2;
		do
		{
		System.out.println("1).COMPARISON \t 2).REVERSE \t3).CONCATINATION\t4).LOWERCASE\t 5).UPPERCASE\t 6).EXIT\n");
		System.out.println("Enter your choice");
		int n=Integer.parseInt(br.readLine());
                switch(n)
		{
		case 1:
			System.out.println("Enter the first string");
			s1=br.readLine();
			System.out.println("Enter the second  string");
			s2=br.readLine();
			com=a.cmpr(s1,s2);
                        if(com==1)
                        {
				System.out.println("First string is greater");
                        }
                        else if(com==-1)
                        {
				System.out.println(" Second string is greater");
		
                        }
			else
			{
				System.out.println("Strings are equal");
			}					
			break;
                case 2:
		 	System.out.println("Enter the  string");
                  	s1=br.readLine();
		 	rev1=a.rvs(s1);
			System.out.println("Reverse of  string:"+rev1);
			break;
		case 3:
		 	System.out.println("Enter the first string");
                  	s1=br.readLine();
			System.out.println("Enter the second  string");
                	s2=br.readLine();
		 	ct1=a.ct(s1,s2);
			System.out.println("concat:"+ct1);
			break;
		case 4:
		 	System.out.println("Enter the  string");
                  	s1=br.readLine();
			
                	cs1=a.cs(s1);
			System.out.println("lowercase:"+cs1);
                	break;

		case 5:
			System.out.println("Enter the  string");
                        s1=br.readLine();
			cs2=a.cs1(s1);
			System.out.println("Uppercase:"+cs2);
                        break;

              case 6:	
			a.close(); 
			break;
	      default:  System.out.println("wrong choice");
			break;
            
              }
		}while(true);
}
}

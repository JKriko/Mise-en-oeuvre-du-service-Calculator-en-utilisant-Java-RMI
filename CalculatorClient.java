import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
public class CalculatorClient {
public static void main(String[] args) {
try {
Calculator c = (Calculator) Naming.lookup( "rmi://localhost/CalculatorService");
System.out.println( c.sub(1, 5) );
System.out.println( c.add(4, 7) );
System.out.println( c.mul(4, 9) );
System.out.println( c.div(6, 3) );
}
catch (MalformedURLException murle) { System.out.println( "MalformedURLException"+ murle); }
catch (RemoteException re) { System.out.println("RemoteException"+re); }
catch (NotBoundException nbe) {System.out.println("NotBoundException"+nbe);}
catch (java.lang.ArithmeticException ae) {System.out.println("java.lang.ArithmeticException"+ae);}
}
} 

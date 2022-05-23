import java.net.*;
import java.rmi.*;
public class AddServer {
public static void main(String args[]) {
try {
AddServerImpl addServerImpl = new AddServerImpl();
Naming.rebind("rmi://localhost:5000/ADD", addServerImpl);
}
catch(Exception e) {
System.out.println("Exception: " + e);
}
}
}

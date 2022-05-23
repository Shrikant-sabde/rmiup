import java.rmi.*;
public class AddClient {
public static void main(String args[]) {
try {
AddServerIntf addServerIntf =
(AddServerIntf)Naming.lookup("rmi://localhost:5000/ADD");

System.out.println(addServerIntf.add(45, 05));
}
catch(Exception e) {
System.out.println("Exception: " + e);
}
}
}

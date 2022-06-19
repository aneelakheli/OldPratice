import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet = InetAddress.getByName("www.google.com");
        System.out.println("host name = " + inet.getHostName());
        System.out.println("Ipaddress = " + inet.getHostAddress());
    }

}
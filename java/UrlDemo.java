import java.net.URL;
import java.net.UnknownHostException;

public class UrlDemo {
    public static void main(String[] args) throws UnknownHostException {
        URL url = new URL("hhtps://www.google.com:8080/index.php?name=helge");
        System.out.println("protocol=  " + url.getProtocol());
        System.out.println("host name=  " + url.getHost());
        System.out.println("prt number=  " + url.getPort());
        System.out.println("query =  " + url.getQuery());
        System.out.println("file name =  " + url.getFile());
    }
}
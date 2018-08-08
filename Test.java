import java.net.InetAddress;
import java.net.UnknownHostException;

class InetAddressTest {
    public static void main(String args[]) throws
            UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("test.example.com");
        System.out.println(address);
        InetAddress SW[] = InetAddress.getAllByName("test.example.com");
        for (int i = 0; i < SW.length; i++)
            System.out.println(SW[i]);
        System.out.println("InetAddress.getCanonicalHostName()" + address.getCanonicalHostName());
    }
}

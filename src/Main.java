import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Sven", 89337882, 8);
        employee.print();
        Client client = new Client("Alex", 89228066, 22);
        client.seasonColor();
    }
}

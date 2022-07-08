import db.dao.CustomerDao;
import db.dao.CustomerDaoImpl;
import model.Customer;

import java.util.List;
import java.util.Optional;

public class TestCustomerDao {
    public static void main(String[] args) {

        CustomerDao dao = new CustomerDaoImpl();

        dao.insert(new Customer("Rany",
                "Albeg Wein",
                "rany.albeg@gmail.com",
                "1234"
        ));
        dao.insert(new Customer(
                "david",
                "cohen",
                "dc@gmail.com",
                "54321"));

        Optional<Customer> optCustomer = dao.findById(2);

        if(optCustomer.isPresent()){
            Customer customer = optCustomer.get();
            System.out.println(customer);
        }else {
            System.out.println("No customer!");
        }

        List<Customer> customers = dao.findAll();
        System.out.println(customers);


    }
}

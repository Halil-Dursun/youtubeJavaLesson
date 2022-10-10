public class Main {
    public static void main(String[] args) {
        CreditManager creditManager =  new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer =  new Customer();//örneğini oluşturmak - instance oluşturmak - instance creation
        customer.id = 1;
        customer.city  ="Antalya";

        CustomerManager customerManager = new CustomerManager(customer);

        customerManager.save();

        Company company = new Company();
        company.taxNumber = "123456";
        company.companyName = "Arçelik";
        company.id = 100;

        CustomerManager customerManager1 = new CustomerManager(new Person());

        Person person = new Person();
        person.id = 1;
        person.nationalIdentity = "123456";

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
    }
}
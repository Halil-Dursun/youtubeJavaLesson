public class CustomerManager {

    private ICreditManager creditManager;

    public CustomerManager(ICreditManager creditManager){
        this.creditManager = creditManager;
    }

    public void  giveCredit(){
        creditManager.calculate();
        System.out.println("Kredi verildi.");
        creditManager.save();
    }
}

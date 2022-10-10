public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Öğretmen Kredisi Hesaplandı.");
    }

    @Override
    public void save(){
        System.out.println("Öğretmen : ");
        super.save();
    }
}

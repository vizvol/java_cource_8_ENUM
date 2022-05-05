// дочерний класс от Person с реализацией 2-х интерфейсов Printable и SeasonHandler
public class Employee extends Person implements Printable  {

    private int experience;
    // конструктор
    public Employee(String name, long phone, int experience){
        super(name, phone);
        this.experience = experience;
    }


    @Override
    public void print() {
        System.out.println(this.getClass() + ":\nname " + this.name  + "\nphone " + this.phone + "\nexperience " + this.experience );
    }

}

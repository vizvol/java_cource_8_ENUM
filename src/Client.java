import java.util.Date;

// дочерний класс от Person с реализацией 2-х интерфейсов Printable и SeasonHandler
public class Client extends Person implements SeasonHandler {

    private int age;
    // конструктор
    public Client(String name, long phone, int age){
        super(name, phone);
        this.age = age;

    }

    @Override
    public void seasonColor() {
        Season season;
        Date dateNow = new Date();
        int month = dateNow.getMonth();
        switch (month) {
            case 0:
            case 1:
            case 2:
                season = Season.winter;
                break;
            case 3:
            case 4:
            case 5:
                season = Season.Spring;
                break;
            case 6:
            case 7:
            case 8:
                season = Season.summer;
                break;
            case 9:
            case 10:
            case 11:
                season = Season.autumn;
                break;
            default:
                season = null;

        }
        System.out.println("Сейчас " + season.name() + ". Цвет сезона " + season.getColor() + ".");
    }

}

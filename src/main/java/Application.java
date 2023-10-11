import animals.Kotik;

public class Application {
    public static void main(String[] args) {

        Kotik kotik = new Kotik("Вася", "Мяу", 10, 3.4);
        kotik.setSatiety(10);
        Kotik kotik1 = new Kotik("Вася", "Мрр", 10, 3.4);



        kotik.liveAnotherDay();
        String str1 = String.format("%n Результат сравнения переменных voice у созданных объектов: ");
        System.out.println(str1 + kotik.getVoice().equals(kotik1.getVoice()));
        String str = String.format("%n Количество созданных объектов: ");
        System.out.println(str + Kotik.getCount());
        String[] activities = kotik.liveAnotherDay();

        for (String activity : activities) {
            System.out.println(activity);
        }

    }
}
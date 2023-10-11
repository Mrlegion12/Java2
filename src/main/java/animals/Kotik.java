package animals;

import java.util.ArrayList;


public class Kotik {
    private static final int METHODS = 5;
    private static int count = 0;

    private String name;
    private String voice;
    private int satiety;
    private double weight;


    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }


    public Kotik(String name, String voice, int satiety, double weight) {
        this.name = name;
        this.voice = voice;
        this.satiety = satiety;
        this.weight = weight;
        count++;
    }

    public boolean play() {
        if (satiety > 0) {
            System.out.println("играет");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, пожалуйста, покормите его");
            return false;
        }
    }

    public boolean sleep() {
        if (satiety > 0) {
            System.out.println("спит");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, пожалуйста, покормите его");
            return false;
        }
    }


    public boolean wash() {
        if (satiety > 0) {
            System.out.println("умывается");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, пожалуйста, покормите его");
            return false;
        }
    }

    public boolean walk() {
        if (satiety > 0) {
            System.out.println("гуляет");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, пожалуйста, покормите его");
            return false;
        }
    }

    public boolean hunt() {
        if (satiety > 0) {
            System.out.println("охотится");
            satiety--;
            return true;
        } else {
            System.out.println("Котик голоден, пожалуйста, покормите его");
            return false;
        }
    }

    public boolean eat(int satietyAmount) {
        if (satietyAmount > 0) {
            satiety += satietyAmount;
            System.out.println("Котик покушал и его сытость увеличилась на " + satietyAmount);
            return true;
        } else {
            System.out.println("Некорректное количество сытости");
            return false;
        }
    }

    public boolean eat(int satietyAmount, String food) {
        if (satietyAmount > 0) {
            satiety += satietyAmount;
            System.out.println("Котик покушал " + food + " и его сытость увеличилась на " + satietyAmount);
            return true;
        } else {
            System.out.println("Некорректное количество сытости");
            return false;
        }
    }

    public boolean eat() {
        return eat(10, "Whiskas");
    }

    public String[] liveAnotherDay() {
        ArrayList<String> activities = new ArrayList<>();
        for (int hour = 0; hour < 24; hour++) {
            int randomMethod = (int) (Math.random() * METHODS) + 1;
            switch (randomMethod) {
                case 1:
                    if (play()) {
                        activities.add(hour + " - играл");
                    }
                    break;
                case 2:
                    if (sleep()) {
                        activities.add(hour + " - спал");
                    }
                    break;
                case 3:
                    if (wash()) {
                        activities.add(hour + " - умывался");
                    }
                    break;
                case 4:
                    if (walk()) {
                        activities.add(hour + " - гулял");
                    }
                    break;
                case 5:
                    if (hunt()) {
                        activities.add(hour + " - охотился");
                    }
                    break;
            }
            if (!satietyCheck()) {
                eat();
                activities.add(hour + " - покушал");
            }
        }
        return activities.toArray(new String[0]);
    }

    private boolean satietyCheck() {
        return satiety > 0;
    }


    public boolean compareVoices(Kotik otherKotik) {
        return this.voice.equals(otherKotik.voice);
    }


    public static boolean compareVoice(Kotik kotik1, Kotik kotik2) {
        return kotik1.getVoice().equals(kotik2.getVoice());
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getVoice() {
        return voice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }


    public static int getCount() {
        return count;
    }

}
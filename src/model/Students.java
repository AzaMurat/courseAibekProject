package model;

public class Students extends Courses{
    String name;
    String surName;
    String age;
    String happybrithay;
    String livein;

    public Students(String nameCompany, String adressCompany, String lesson, String timelesson, String name, String surName, String age, String happybrithay, String livein) {
        super(nameCompany, adressCompany, lesson, timelesson);
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.happybrithay = happybrithay;
        this.livein = livein;
    }

    public Students() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHappybrithay() {
        return happybrithay;
    }

    public void setHappybrithay(String happybrithay) {
        this.happybrithay = happybrithay;
    }

    public String getLivein() {
        return livein;
    }

    public void setLivein(String livein) {
        this.livein = livein;
    }

    @Override
    public String toString() {
        return super.toString() +
                "name : " + name + "\n" +
                "surName : " + surName + "\n" +
                "age : " + age +
                "happybrithay : " + happybrithay + "\n" +
                "livein : " + livein + "\n";
    }
}

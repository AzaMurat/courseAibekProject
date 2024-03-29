package service;

import model.Students;

public class Logics {
    public static void setEqualsStudents(String a, String b, String c, String d, String e, String f, String j, String h, String i) {
    Students students = new Students();
        students.setNameCompany(a);
        students.setAdressCompany(b);
        students.setLesson(c);
        students.setTimelesson(d);
        students.setName(e);
        students.setSurName(f);
        students.setAge(j);
        students.setHappybrithay(h);
        students.setLivein(i);
    }
    public static String getEqualsStudents() {
        Students students = new Students();
        students.getNameCompany();
        students.getAdressCompany();
        students.getLesson();
        students.getTimelesson();
        students.getName();
        students.getSurName();
        students.getAge();
        students.getHappybrithay();
        students.getLivein();

        return students.toString();
    }
}
package Btb2bitc;

public class Person {
    public int YoB;
    public Person() {
    }
    public int CurrentAge() {
        int CurrentYear = 2024;
        return CurrentYear - YoB;
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.YoB = 2004;
        int CurAge = person1.CurrentAge();
        System.out.printf("Your current age is %d\n", CurAge);
    }
}

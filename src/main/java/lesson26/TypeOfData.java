package lesson26;

import java.lang.reflect.Type;

public class TypeOfData {
    public static void main(String[] args) {
        int simpleAge = 10;
        TypeOfData typeOfData = new TypeOfData();
        System.out.println("old simlpe simpleAge:" + simpleAge);
        typeOfData.changeAge(simpleAge);
        System.out.println("new simple age:" + simpleAge);


        Age objectAge = new Age();
        objectAge.setAge(10);
        System.out.println("old objectAge:" + objectAge);
        typeOfData.changeAge(objectAge);
        System.out.println("new objectAge:" + objectAge);
        Age secondObjectAge = objectAge;
        secondObjectAge.setAge(30);
        Age thirdObjectAge = secondObjectAge;
        thirdObjectAge.setAge(40);

        System.out.println(objectAge);

        int a = 5;
        int b = a;
        b += 1;

        System.out.println(a);
        System.out.println(b);

        Age fourObjectAger = new Age(objectAge);
        fourObjectAger.setAge(1000);

        System.out.println(objectAge);




    }

    void changeAge(int age) {
        age = 20;
    }

    void changeAge(Age age) {
        age.setAge(20);
    }
}

package lesson26;

public class Age {
   private int age;

    public Age() {
    }

    public Age(Age newAge) {
        this.age  = newAge.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                '}';
    }
}

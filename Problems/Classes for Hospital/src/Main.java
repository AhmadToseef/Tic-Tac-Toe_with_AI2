class Person {
    protected String name;
    protected int age;
    protected String address;
    protected int yearOfBirth;

    public Person() {

    }

    public Person(String name, int age, String address, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }
}

class Employee extends Person {

}

class Doctor extends Employee {

}

class Patient extends Person {

}

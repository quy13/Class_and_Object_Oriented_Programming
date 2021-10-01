package com.example.learnjava;

public class MyClass {
    public static void main(String[] args) {

//        Microphone microphone = new Microphone();
//        microphone.name = "Blue Yeti";
//        microphone.color = "Blue";
//        microphone.model = 133423;
//        System.out.println(
//
//                microphone.name  + " " +
//                microphone.color + " " +
//                microphone.model + "."
//
//                );

//        microphone.turnOn();
//        microphone.setVolume();
//        microphone.turnOff();
//        System.out.println(microphone.showDescription());

        Microphone microphone1 = new Microphone("Blue","Blue Yeti",133423);//instantiating our object
        Microphone microphone2 = new Microphone("Red Hulk","Red",2019);

        System.out.println(microphone1.showDescription());
        System.out.println(microphone2.showDescription());
        microphone1.turnOn();
        microphone2.turnOn();
        microphone1.setVolume();
        microphone2.turnOff();

        microphone1.setModel(152007);
        System.out.println("New Mic: " + microphone1.getModel());

//        Person person = new Person("Steve",56);
//        System.out.println(person.name + " age " + person.age);
//
//        Hero superman = new Hero("Super Man",132,1000);
//        System.out.println(
//                superman.name + " age " +
//                superman.age + " power " +
//                superman.power
//        );
        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setAge(35);
        employee.setId(1425);
        employee.setAnnualSalary(1000000);
        System.out.println(employee.getId()+","+employee.getAnnualSalary());
        Manager manager = new Manager();
        manager.setFirstName("Manager George");
        manager.setLastName("Kilos");
        manager.setAge(46);
        manager.setId(665);
        manager.setAnnualSalary(2000000);

        System.out.println(manager.getAnnualSalary()+","+manager.getFirstName());
    }
}
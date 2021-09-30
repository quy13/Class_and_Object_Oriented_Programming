package com.example.learnjava;

public class Microphone {
    //instance variables/ properties/ fields
    private String name;
    private String color;
    private int model;


    //Action/Behavior method
    public void turnOff(){
        System.out.println(this.name +" turning Off...");
    };
    public void turnOn(){
        System.out.println(this.name +" turning On...");
    };
    public void setVolume(){
        System.out.println(this.name +" Setting Volume...");
    };
    public String showDescription(){
        return "Microphone name :" + this.name
                + " with color :" + this.color
                + " model :"  + this.model;
        // "this" can be used to return the instance of the current class when that class invoke it
        // "this" có thể được dùng để trả về instance của lớp hiện tại
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getModel() {
        return model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public Microphone(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }
    //overloading a constructor
    public Microphone(){}
    public Microphone(String name, String color) {
        this.name = name;
        this.color = color;
    }

}

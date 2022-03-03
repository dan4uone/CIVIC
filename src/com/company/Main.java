package com.company;

public class Main {

    public static void main(String[] args) {
        Model model = new Model("1", "1", "1,", Color.BROWN);
        System.out.println(model.getInfo());
        Honda civic = new Honda("R", "Auto", "Civic", Color.BLACK, 2.4, 2012);
        System.out.println(civic.getInfo());
        civic.signal("beeping");
    }
}
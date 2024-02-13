package ru.t1murcoder.personpetslist.domain;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int id;
    private String name;
    private String phone;
    private List<Pet> petList = new ArrayList<>();

    public Person(int id, String name, String phone, List<Pet> petList) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.petList = petList;
    }

    public void addPet(Pet pet) {
        petList.add(pet);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<Pet> getPetList() {
        return petList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pets=" + petList +
                '}';
    }
}

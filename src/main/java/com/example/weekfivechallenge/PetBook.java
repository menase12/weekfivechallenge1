package com.example.weekfivechallenge;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class PetBook {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String petName;

    @NotNull
    private int age;

    @NotEmpty
    private String typeOfAnimal;

    private String breed;

    @NotEmpty
    private String color;

    private String feature;

    @NotEmpty
    @Size (min=10)
    private String phoneNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName=petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal=typeOfAnimal;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed=breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature=feature;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber=phoneNumber;
    }
}

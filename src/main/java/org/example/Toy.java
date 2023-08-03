package org.example;

import java.time.LocalDate;
import java.util.Objects;

public class Toy {

    private String name;
    private String ageGroup;
    private Double price;

    public Toy(String name, String ageGroup, Double price) {
        this.name = name;
        this.ageGroup = ageGroup;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return name.equals(toy.name) && ageGroup.equals(toy.ageGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ageGroup);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", ageGroup='" + ageGroup + '\'' +
                ", price=" + price +
                '}';
    }
}

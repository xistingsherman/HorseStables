package org.example.HorseStables.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Horses")
public class Horse {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "horse_id")
    private int horseID;
    private String name;
    private int age;
    private int owner;


    public int getHorseID() {
        return horseID;
    }

    public void setHorseID(int horseID) {
        this.horseID = horseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "stables.models.Horse{" +
                "horseID=" + horseID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                '}';
    }

}

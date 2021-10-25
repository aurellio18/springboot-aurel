package com.example.aurelliof.hello.model;


import javax.persistence.*;

@Entity
@Table(name = "test")
public class Identity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Name;
    private String Description;
    private String Job;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", Job='" + Job + '\'' +
                '}';
    }
}

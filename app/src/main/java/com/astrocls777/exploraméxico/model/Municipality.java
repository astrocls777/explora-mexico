package com.astrocls777.exploraméxico.model;

public class Municipality {
    private String id;
    private String name;
    private double population;
    private double area;
    private String description;

    public Municipality() {}

    public Municipality(String id, String name, double population, 
                       double area, String description) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.area = area;
        this.description = description;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

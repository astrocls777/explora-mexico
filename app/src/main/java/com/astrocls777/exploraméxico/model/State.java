package com.astrocls777.exploraméxico.model;

import java.util.List;

public class State {
    private String id;
    private String name;
    private String capital;
    private double population;
    private double area;
    private String region;
    private String description;
    private String imageUrl;
    private List<Municipality> municipalities;

    public State() {}

    public State(String id, String name, String capital, double population, 
                 double area, String region, String description, 
                 String imageUrl, List<Municipality> municipalities) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.region = region;
        this.description = description;
        this.imageUrl = imageUrl;
        this.municipalities = municipalities;
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

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Municipality> getMunicipalities() {
        return municipalities;
    }

    public void setMunicipalities(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

    public int getMunicipalitiesCount() {
        return municipalities != null ? municipalities.size() : 0;
    }
}

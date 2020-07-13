package com.cheba00.models;



 
import javax.persistence.*;

@Entity
@Table(name = "team")

public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "logo")
    private String logo;

    @Column(name = "country")
    private String country;

    @Column(name = "foundet")
    private String foundet;

    @Column(name = "venue_name")
    private String venue_name;

    @Column(name = "venue_surface")
    private String venue_surface;

    @Column(name = "venue_city")
    private String venue_city;

    @Column(name = "venue_capacity")
    private String venue_capacity;

    public Team() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFoundet() {
        return foundet;
    }

    public void setFoundet(String foundet) {
        this.foundet = foundet;
    }

    public String getVenue_name() {
        return venue_name;
    }

    public void setVenue_name(String venue_name) {
        this.venue_name = venue_name;
    }

    public String getVenue_surface() {
        return venue_surface;
    }

    public void setVenue_surface(String venue_surface) {
        this.venue_surface = venue_surface;
    }

    public String getVenue_city() {
        return venue_city;
    }

    public void setVenue_city(String venue_city) {
        this.venue_city = venue_city;
    }

    public String getVenue_capacity() {
        return venue_capacity;
    }

    public void setVenue_capacity(String venue_capacity) {
        this.venue_capacity = venue_capacity;
    }
}

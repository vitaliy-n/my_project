package com.cheba00.models;


import javax.persistence.*;

@Entity
@Table(name = "lineup")

public class LineUp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lineup_id")
    private Integer id;

    @Column(name = "formation")
    private String formation;

    public LineUp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFormation() {
        return formation;
    }

    public void setFormation(String formation) {
        this.formation = formation;
    }
}

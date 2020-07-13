package com.cheba00.models;


import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "bet")
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bet_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fixture_id")
    private Fixture fixture;

    @ManyToOne
    @JoinColumn(name = "outcome_id")
    private Outcome outcome;

    public Bet() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Outcome getOutcome() {
        return outcome;
    }

    public void setOutcome(Outcome outcome) {
        this.outcome = outcome;
    }
}

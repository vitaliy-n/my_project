package com.cheba00.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ligue_member")
public class LigueMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ligue_member_id")
    private Integer id;

    @Column(name = "rank")
    private Integer rank;


    @Column(name = "points")
    private Integer points;

    @Column(name = "last_update")
    private Date lastUpdate;

    @Column(name = "goals_scored")
    private Integer goalsScored;

    @Column(name = "goals_conseded")
    private Integer goalsConseded;

    @ManyToOne
    @JoinColumn(name = "fixture_member_id")
    private FixtureMember fixtureMember;

    @ManyToOne
    @JoinColumn(name = "ligue_id")
    private Ligue ligue;


    public LigueMember() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getGoalsConseded() {
        return goalsConseded;
    }

    public void setGoalsConseded(Integer goalsConseded) {
        this.goalsConseded = goalsConseded;
    }

    public FixtureMember getFixtureMember() {
        return fixtureMember;
    }

    public void setFixtureMember(FixtureMember fixtureMember) {
        this.fixtureMember = fixtureMember;
    }

    public Ligue getLigue() {
        return ligue;
    }

    public void setLigue(Ligue ligue) {
        this.ligue = ligue;
    }
}

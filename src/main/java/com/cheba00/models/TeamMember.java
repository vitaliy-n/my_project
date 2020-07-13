package com.cheba00.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "team_member")
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_member_id")
    private Integer id;


    @Column(name = "data_of_entry")
    private Date dataOfEntry;

    @Column(name = "number")
    private Integer number;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "is_capitan")
    private Boolean isCapitan;

    @Column(name = "injured")
    private Boolean isInjured;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;


    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    public TeamMember() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataOfEntry() {
        return dataOfEntry;
    }

    public void setDataOfEntry(Date dataOfEntry) {
        this.dataOfEntry = dataOfEntry;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getCapitan() {
        return isCapitan;
    }

    public void setCapitan(Boolean capitan) {
        isCapitan = capitan;
    }

    public Boolean getInjured() {
        return isInjured;
    }

    public void setInjured(Boolean injured) {
        isInjured = injured;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

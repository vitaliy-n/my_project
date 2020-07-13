package com.cheba00.models;




import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ligue")
public class Ligue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ligue_id")
    private Integer id;


    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "season")
    private Integer season;

    @Column(name = "season_start_date")
    private Date seasonStartDate;

    @Column(name = "season_end_date")
    private Date seasonEndDate;

    @Column(name = "logo")
    private String logo;

    @Column(name = "flag")
    private String flag;

    public Ligue() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Date getSeasonStartDate() {
        return seasonStartDate;
    }

    public void setSeasonStartDate(Date seasonStartDate) {
        this.seasonStartDate = seasonStartDate;
    }

    public Date getSeasonEndDate() {
        return seasonEndDate;
    }

    public void setSeasonEndDate(Date seasonEndDate) {
        this.seasonEndDate = seasonEndDate;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}

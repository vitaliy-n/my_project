package com.cheba00.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bets")
public class Bets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bets_id")
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "bet_id")
    private Bet bet;

    @Column(name = "date")
    private Date date;


    @Column(name = "roi")
    private Integer roi;

    @Column(name = "money_back")
    private Boolean isMoneyBack;

    @Column(name = "is_won")
    private Boolean isWon;

    public Bets() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bet getBet() {
        return bet;
    }

    public void setBet(Bet bet) {
        this.bet = bet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRoi() {
        return roi;
    }

    public void setRoi(Integer roi) {
        this.roi = roi;
    }

    public Boolean getMoneyBack() {
        return isMoneyBack;
    }

    public void setMoneyBack(Boolean moneyBack) {
        isMoneyBack = moneyBack;
    }

    public Boolean getWon() {
        return isWon;
    }

    public void setWon(Boolean won) {
        isWon = won;
    }
}

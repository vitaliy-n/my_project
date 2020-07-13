package com.cheba00.models;


import javax.persistence.*;

@Entity
@Table(name = "lineup_member")

public class LineUpMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lineup_member_id")
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
    @JoinColumn(name = "lineup_id")
    private LineUp lineUp;

    @Column(name = "position")
    private String position;

    @Column(name = "is_subst")
    private Boolean isSubst;

    @Column(name = "rating")
    private Float rating;

    @Column(name = "minutes_played")
    private Integer minutesPlayed;

    @Column(name = "offsides")
    private Integer offsides;

    @Column(name = "shots_on")
    private Integer shotsOn;

    @Column(name = "shots_total")
    private Integer shotsTotal;

    @Column(name = "goal_total")
    private Integer goalTotal;

    @Column(name = "goal_conceded")
    private Integer goalConceded;

    @Column(name = "goal_assist")
    private Integer goalAssist;

    @Column(name = "passes_total")
    private Integer passesTotal;

    @Column(name = "passes_key")
    private Integer passesKey;

    @Column(name = "passes_accuracy")
    private Integer passesAccuracy;

    @Column(name = "takles_total")
    private Integer taklesTotal;

    @Column(name = "takles_block")
    private Integer taklesBlock;

    @Column(name = "takles_intersiption")
    private Integer taklesIntersiption;

    @Column(name = "duel_total")
    private Integer duelTotal;

    @Column(name = "duel_won")
    private Integer duelWon;


    @Column(name = "dribbles_attempts")
    private Integer dribblesAttempts;

    @Column(name = "dribbles_succes")
    private Integer dribblesSuccess;

    @Column(name = "dribbles_past")
    private Integer dribblesPast;

    @Column(name = "fouls_drawn")
    private Integer foulsDrawn;

    @Column(name = "fouls_committed")
    private Integer foulsCommitted;

    @Column(name = "cards_yellow")
    private Integer cardsYellow;

    @Column(name = "cards_red")
    private Integer cardsRed;

    @Column(name = " penalty_won")
    private Integer penaltyWon;

    @Column(name = "penalty_commited")
    private Integer penaltyCommitted;

    @Column(name = "penalty_succes")
    private Integer penaltySuccess;

    @Column(name = "penalty_missed")
    private Integer penaltyMissed;

    @Column(name = "penalty_saved")
    private Integer penaltySaved;

    public LineUpMember() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public LineUp getLineUp() {
        return lineUp;
    }

    public void setLineUp(LineUp lineUp) {
        this.lineUp = lineUp;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getSubst() {
        return isSubst;
    }

    public void setSubst(Boolean subst) {
        isSubst = subst;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Integer getOffsides() {
        return offsides;
    }

    public void setOffsides(Integer offsides) {
        this.offsides = offsides;
    }

    public Integer getShotsOn() {
        return shotsOn;
    }

    public void setShotsOn(Integer shotsOn) {
        this.shotsOn = shotsOn;
    }

    public Integer getShotsTotal() {
        return shotsTotal;
    }

    public void setShotsTotal(Integer shotsTotal) {
        this.shotsTotal = shotsTotal;
    }

    public Integer getGoalTotal() {
        return goalTotal;
    }

    public void setGoalTotal(Integer goalTotal) {
        this.goalTotal = goalTotal;
    }

    public Integer getGoalConceded() {
        return goalConceded;
    }

    public void setGoalConceded(Integer goalConceded) {
        this.goalConceded = goalConceded;
    }

    public Integer getGoalAssist() {
        return goalAssist;
    }

    public void setGoalAssist(Integer goalAssist) {
        this.goalAssist = goalAssist;
    }

    public Integer getPassesTotal() {
        return passesTotal;
    }

    public void setPassesTotal(Integer passesTotal) {
        this.passesTotal = passesTotal;
    }

    public Integer getPassesKey() {
        return passesKey;
    }

    public void setPassesKey(Integer passesKey) {
        this.passesKey = passesKey;
    }

    public Integer getPassesAccuracy() {
        return passesAccuracy;
    }

    public void setPassesAccuracy(Integer passesAccuracy) {
        this.passesAccuracy = passesAccuracy;
    }

    public Integer getTaklesTotal() {
        return taklesTotal;
    }

    public void setTaklesTotal(Integer taklesTotal) {
        this.taklesTotal = taklesTotal;
    }

    public Integer getTaklesBlock() {
        return taklesBlock;
    }

    public void setTaklesBlock(Integer taklesBlock) {
        this.taklesBlock = taklesBlock;
    }

    public Integer getTaklesIntersiption() {
        return taklesIntersiption;
    }

    public void setTaklesIntersiption(Integer taklesIntersiption) {
        this.taklesIntersiption = taklesIntersiption;
    }

    public Integer getDuelTotal() {
        return duelTotal;
    }

    public void setDuelTotal(Integer duelTotal) {
        this.duelTotal = duelTotal;
    }

    public Integer getDuelWon() {
        return duelWon;
    }

    public void setDuelWon(Integer duelWon) {
        this.duelWon = duelWon;
    }

    public Integer getDribblesAttempts() {
        return dribblesAttempts;
    }

    public void setDribblesAttempts(Integer dribblesAttempts) {
        this.dribblesAttempts = dribblesAttempts;
    }

    public Integer getDribblesSuccess() {
        return dribblesSuccess;
    }

    public void setDribblesSuccess(Integer dribblesSuccess) {
        this.dribblesSuccess = dribblesSuccess;
    }

    public Integer getDribblesPast() {
        return dribblesPast;
    }

    public void setDribblesPast(Integer dribblesPast) {
        this.dribblesPast = dribblesPast;
    }

    public Integer getFoulsDrawn() {
        return foulsDrawn;
    }

    public void setFoulsDrawn(Integer foulsDrawn) {
        this.foulsDrawn = foulsDrawn;
    }

    public Integer getFoulsCommitted() {
        return foulsCommitted;
    }

    public void setFoulsCommitted(Integer foulsCommitted) {
        this.foulsCommitted = foulsCommitted;
    }

    public Integer getCardsYellow() {
        return cardsYellow;
    }

    public void setCardsYellow(Integer cardsYellow) {
        this.cardsYellow = cardsYellow;
    }

    public Integer getCardsRed() {
        return cardsRed;
    }

    public void setCardsRed(Integer cardsRed) {
        this.cardsRed = cardsRed;
    }

    public Integer getPenaltyWon() {
        return penaltyWon;
    }

    public void setPenaltyWon(Integer penaltyWon) {
        this.penaltyWon = penaltyWon;
    }

    public Integer getPenaltyCommitted() {
        return penaltyCommitted;
    }

    public void setPenaltyCommitted(Integer penaltyCommitted) {
        this.penaltyCommitted = penaltyCommitted;
    }

    public Integer getPenaltySuccess() {
        return penaltySuccess;
    }

    public void setPenaltySuccess(Integer penaltySuccess) {
        this.penaltySuccess = penaltySuccess;
    }

    public Integer getPenaltyMissed() {
        return penaltyMissed;
    }

    public void setPenaltyMissed(Integer penaltyMissed) {
        this.penaltyMissed = penaltyMissed;
    }

    public Integer getPenaltySaved() {
        return penaltySaved;
    }

    public void setPenaltySaved(Integer penaltySaved) {
        this.penaltySaved = penaltySaved;
    }
}

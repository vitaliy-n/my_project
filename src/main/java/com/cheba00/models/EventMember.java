package com.cheba00.models;


import javax.persistence.*;

@Entity
@Table(name = "event_member")
public class EventMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_member_id")
    private Integer id;

    @Column(name = "is_assist")
    private Boolean isAssist;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Events events;

    @ManyToOne
    @JoinColumn(name = "lineup_member_id")
    private LineUpMember lineUpMember;

    public EventMember() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAssist() {
        return isAssist;
    }

    public void setAssist(Boolean assist) {
        isAssist = assist;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public LineUpMember getLineUpMember() {
        return lineUpMember;
    }

    public void setLineUpMember(LineUpMember lineUpMember) {
        this.lineUpMember = lineUpMember;
    }
}

package com.cheba00.models;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sidelined")

public class Sidelined {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sidelined_id")
    private Integer id;

    @Column(name = "type")
    private String type;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;


}

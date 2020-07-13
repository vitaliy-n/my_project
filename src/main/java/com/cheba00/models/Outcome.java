package com.cheba00.models;


import javax.persistence.*;

@Entity
@Table(name = "outcome")
public class Outcome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outcome_id")
    private Integer id;


    @JoinColumn(name = "label_id")
    @ManyToOne
    private Label label;

    @JoinColumn(name = "value_id")
    @ManyToOne
    private Value value;

    public Outcome() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

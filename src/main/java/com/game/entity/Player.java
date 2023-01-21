package com.game.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;
    @Column (name = "name")
    private String name;
    @Column (name = "title")
    private String title;
    @Enumerated(EnumType.STRING)
    @Column (name = "race")
    private Race race;
    @Enumerated(EnumType.STRING)
    @Column (name = "profession")
    private Profession profession;
    @Column (name = "experience")
    private Integer experience;
    @Column (name = "level")
    private Integer level;
    @Column (name = "untilNextLevel")
    private Integer untilNextLevel;
    @Column (name = "birthday")
    private Date birthday;
    @Column (name = "banned")
    private Boolean banned;

    public Player() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    //V2
    public Integer getLevel() {
        return (int)(Math.sqrt(2500 + (200 * this.experience)) -50)/100;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    //V2
    public Integer getUntilNextLevel() {
        return 50*(this.level + 1)*(this.level + 2) - this.experience;
    }
    public void setUntilNextLevel(Integer untilNextLevel) {
        this.untilNextLevel = untilNextLevel;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }
}

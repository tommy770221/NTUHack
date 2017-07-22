package com.ntuhackathon.ubike.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class BikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String bikeName;

    @Column
    private String comment;

    @Column
    private Date createDate;

    @Column
    private String latitude;


    @Column
    private String logtitude;

    @Column
    private int scoreBike;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLogtitude() {
        return logtitude;
    }

    public void setLogtitude(String logtitude) {
        this.logtitude = logtitude;
    }

    public int getScoreBike() {
        return scoreBike;
    }

    public void setScoreBike(int scoreBike) {
        this.scoreBike = scoreBike;
    }
}

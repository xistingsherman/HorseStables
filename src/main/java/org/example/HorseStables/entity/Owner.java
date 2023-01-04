package org.example.HorseStables.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "owner_id")
    private int ownerID;
    private String ownerName;
    private String email;
    private String phone;
    private Date memberSince;
    private boolean currentlyActive;

    public Owner() {
    }

    public Owner(int ownerID, String ownerName, String email, String phone, Date memberSince, boolean currentlyActive) {
        this.ownerID = ownerID;
        this.ownerName = ownerName;
        this.email = email;
        this.phone = phone;
        this.memberSince = memberSince;
        this.currentlyActive = currentlyActive;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getMemberSince() {
        return memberSince;
    }

    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    public boolean isCurrentlyActive() {
        return currentlyActive;
    }

    public void setCurrentlyActive(boolean currentlyActive) {
        this.currentlyActive = currentlyActive;
    }

    @Override
    public String toString() {
        return "stables.models.Owner{" +
                "ownerID=" + ownerID +
                ", ownerName='" + ownerName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", memberSince=" + memberSince +
                ", currentlyActive=" + currentlyActive +
                '}';
    }
}

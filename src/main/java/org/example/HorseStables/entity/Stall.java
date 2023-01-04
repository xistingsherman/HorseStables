package org.example.HorseStables.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Stall {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "stall_id")
    private int stallID;
    private int  horseID;
    private Date leaseStart;
    private Date leaseEnd;

    public Stall() {
    }

    public Stall(int stallID, int horseID, Date leaseStart, Date leaseEnd) {
        this.stallID = stallID;
        this.horseID = horseID;
        this.leaseStart = leaseStart;
        this.leaseEnd = leaseEnd;
    }

    public int getStallID() {
        return stallID;
    }

    public void setStallID(int stallID) {
        this.stallID = stallID;
    }

    public int getHorseID() {
        return horseID;
    }

    public void setHorseID(int horseID) {
        this.horseID = horseID;
    }

    public Date getLeaseStart() {
        return leaseStart;
    }

    public void setLeaseStart(Date leaseStart) {
        this.leaseStart = leaseStart;
    }

    public Date getLeaseEnd() {
        return leaseEnd;
    }

    public void setLeaseEnd(Date leaseEnd) {
        this.leaseEnd = leaseEnd;
    }

    @Override
    public String toString() {
        return "stables.models.Stall{" +
                "stallID=" + stallID +
                ", horseID=" + horseID +
                ", leaseStart=" + leaseStart +
                ", leaseEnd=" + leaseEnd +
                '}';
    }
}

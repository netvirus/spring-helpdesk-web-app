package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "createdDate")
    private Timestamp createdDate;

    @Column(name = "closedDate")
    private Timestamp closedDate;

    @Column(name = "stateId")
    private int stateId;

    @Column(name = "ownerId")
    private int ownerId;

    @Column(name = "managerId")
    private int managerId;

    @Column(name = "messageId")
    private int messageId;

    public Ticket() {
    }

    public Ticket(int id, Timestamp createdDate, Timestamp closedDate, int stateId, int ownerId, int managerId, int messageId) {
        this.id = id;
        this.createdDate = createdDate;
        this.closedDate = closedDate;
        this.stateId = stateId;
        this.ownerId = ownerId;
        this.managerId = managerId;
        this.messageId = messageId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Timestamp closedDate) {
        this.closedDate = closedDate;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getResponsibleId() {
        return managerId;
    }

    public void setResponsibleId(int managerId) {
        this.managerId = managerId;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }
}

package com.loggin.demo.domain.Entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table()
public class Basket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workid",nullable = false)
    private Long id;



    @Column(name = "role",nullable = false)
    @Enumerated(EnumType.STRING)

    private Role role = Role.USER ;

    @Column()
    private String workname;

    @Column(name = "status",nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status = Status.DISABLE;

    @Column(name = "action",nullable = false)
    @Enumerated(EnumType.STRING)
    private Action action = Action.PENDING;

    public Basket() {
    }

    public Basket(Role role, String workname, Status status, Action action) {
        this.role = role;
        this.workname = workname;
        this.status = status;
        this.action = action;
    }

    public Long getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", role=" + role +
                ", workname='" + workname + '\'' +
                ", status='" + status + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}

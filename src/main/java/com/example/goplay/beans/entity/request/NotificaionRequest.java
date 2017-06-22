package com.example.goplay.beans.entity.request;

import com.example.goplay.beans.entity.User;

import javax.persistence.*;

@Entity
public class NotificaionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Request request;

    @OneToOne
    User receiver;

    NotificaionRequest() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }
}

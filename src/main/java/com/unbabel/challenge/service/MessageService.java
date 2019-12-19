package com.unbabel.challenge.service;

import com.unbabel.challenge.model.Message;

import java.util.Set;

public interface MessageService {

    Message translate(Message message);

    Message getStatus(Message message);

    void saveMessage(Message message);

    Set<Message> getMessages();

}

package com.unbabel.challenge.service;

import com.unbabel.challenge.model.Message;
import com.unbabel.challenge.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@Service
public class MessageServiceImpl implements MessageService {

    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    MessageRepository messageRepository;

    private final String URL = "https://sandbox.unbabel.com/tapi/v2/translation/";


    @Override
    public Message translate(Message message) {
        Message responseMessage = null;


        return null;
    }

    @Override
    public Message getStatus(Message message) {
        return null;
    }

    @Override
    public void saveMessage(Message message) {

    }

    @Override
    public Set<Message> getMessages() {
        return null;
    }
}

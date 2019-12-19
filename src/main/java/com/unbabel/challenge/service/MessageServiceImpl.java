package com.unbabel.challenge.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unbabel.challenge.model.Message;
import com.unbabel.challenge.repository.MessageRepository;
import com.unbabel.challenge.utils.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Set;

@Service
public class MessageServiceImpl implements MessageService {

    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    MessageRepository messageRepository;

    private final String URL = "https://sandbox.unbabel.com/tapi/v2/translation/";


    @Override
    public Message translate(Message message) {

        ObjectMapper objectMapper = new ObjectMapper();
        Message responseMessage = null;
//
//        try {
//            String jsonString = objectMapper.writeValueAsString(message);
//            HttpHeaders headers = HeaderUtil.setHeaders();
//            HttpEntity<String> entity = new HttpEntity<>(jsonString, headers);
//
//            logger.info("Request sent");
//            responseMessage = restTemplate.postForObject(URL, entity, Message.class);
//
//        } catch (IOException e) {
//            logger.error(e.getMessage());
//        } catch (HttpServerErrorException e) {
//            logger.error(e.getMessage());
//            translate(message);
//        }

        return responseMessage;
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

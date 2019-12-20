package com.unbabel.challenge.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.unbabel.challenge.model.Message;
import com.unbabel.challenge.repository.MessageRepository;
import com.unbabel.challenge.utils.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Service
public class MessageServiceImpl implements MessageService {

    RestTemplate restTemplate;

    Logger logger = LoggerFactory.getLogger(MessageServiceImpl.class);

    @Autowired
    MessageRepository messageRepository;

    private final String URL = "https://sandbox.unbabel.com/tapi/v2/translation/";


    @Override
    public Message translate(Message message) {

        ObjectMapper objectMapper = new ObjectMapper();
        Message responseMessage = message;

        //Set translated text manually since we don't have access to the API because of the missing Api Key
        responseMessage.setTranslatedText("This is the default translation since we don't have an Api Key to make calls to the API");

        if (message.getTarget_language().equals("fr")){
        responseMessage.setTranslatedText("Il s'agit de la traduction par défaut car nous n'avons pas d'ApiKey pour appeler l'API");
        }

        if (message.getTarget_language().equals("sp")){
        responseMessage.setTranslatedText("Esta es la traducción predeterminada ya que no tenemos un ApiKey para hacer llamadas a la API");
        }

        if (message.getTarget_language().equals("jp")){
        responseMessage.setTranslatedText("Api o yobidasu tame no Api kī ga nai tame, korega deforuto no hon'yakudesu");
        }

        responseMessage.setStatus("translated");

        saveMessage(responseMessage);
        return responseMessage;
    }

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
        logger.info("Message saved on database!");
    }

    @Override
    public Set<Message> getMessages() {
        Set<Message> messageSet = new HashSet<>();
        messageRepository.findAll().iterator().forEachRemaining(messageSet::add);
        return messageSet;
    }
}

package com.unbabel.challenge.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100)
    private String text;

    private String source_language;

    private String target_language;

    private String text_format;

    private String uid;

    private String status;

    private double order_number;

    private double price;

    private String translatedText;
}

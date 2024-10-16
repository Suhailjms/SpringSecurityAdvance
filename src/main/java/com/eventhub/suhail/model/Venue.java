package com.eventhub.suhail.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Venue")
public class Venue {

      @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String p_name;

    private String location;

    private int price;

}
package com.eventhub.suhail.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="food")
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int food_id;
  @Column
  private String food_type;
  @Column
  private String  food_cuisine;
  @Column
  private String food_menu;
  @Column
  private String event_type;
  public int getFood_id() {
    return food_id;
  }
  public void setFood_id(int food_id) {
    this.food_id = food_id;
  }
  public String getEvent_type() {
    return event_type;
  }
  public void setEvent_type(String event_type) {
    this.event_type = event_type;
  }
  public String getFood_type() {
    return food_type;
  }
  public void setFood_type(String food_type) {
    this.food_type = food_type;
  }
  public String getFood_cuisine() {
    return food_cuisine;
  }
  public void setFood_cuisine(String food_cuisine) {
    this.food_cuisine = food_cuisine;
  }
  public String getFood_menu() {
    return food_menu;
  }
  public void setFood_menu(String food_menu) {
    this.food_menu = food_menu;
  }


}
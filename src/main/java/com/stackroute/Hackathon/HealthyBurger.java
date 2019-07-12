package com.stackroute.Hackathon;

import java.util.ArrayList;

public class HealthyBurger extends Hamburger {

  String breadType;
  String meat;
  String burgerName;
  int[] items = new int[6];


  public HealthyBurger(String breadType, String meat, String burgerName ) {

    this.breadType=breadType;
    this.meat=meat;
    this.burgerName=burgerName;

  }

  @Override
  public void selectedItems(String[] items) {

    System.out.println("Items selected are:" +items);

  }

  @Override
  public void pricing() {
    int basePrice=100, price;
    int addons= items.length;
    price = basePrice + 20*addons;
    System.out.println("The price of the burger is:" +price);
  }


}

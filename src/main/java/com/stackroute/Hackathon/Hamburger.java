package com.stackroute.Hackathon;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hamburger {

  String[] items = new String[4];

   public void selectedItems(String[] items){

     System.out.println("Items selected are:" +items);

   }

  public void pricing()

  {
    int basePrice=100, price;
    int addons= items.length;
      price = basePrice + 20*addons;
    System.out.println("The price of the burger is:" +price);
  }


}



package com.greenfoxacademy.basicwebshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    List<ShopItem> itemList = new ArrayList<>();

    @PostConstruct
    public void init() {
        itemList.add( new ShopItem( "Running shoes", "Nike running shoes for everyday sport", 50, 5 ) );
        itemList.add( new ShopItem( "Printer", "HP printer that prints(!)", 220, 3 ) );
        itemList.add( new ShopItem( "Coca Cola", "0,5l standard coke", 2, 0 ) );
        itemList.add( new ShopItem( "Wokin", "Chicken with fried rice and Wokin sauce\t", 10, 80 ) );
        itemList.add( new ShopItem( "T-shirt", "Blue with a corgi on a bike\t", 15, 5 ) );
        itemList.add( new ShopItem( "TV", "Used Samsung OLED (broken)", 215, 1 ) );
        itemList.add( new ShopItem( "T-shirt", "Nike Jumpman Limited Edition", 25, 2 ) );
        itemList.add( new ShopItem( "Banana", "Fresh and Ripe", 2, 5 ) );
        itemList.add( new ShopItem( "iPhone XS", "BNIB", 915, 2 ) );


    }

    @GetMapping("/webshop")
    public String getHome(Model model) {
        model.addAttribute( "items", itemList );
        return "wshome";
    }

    @RequestMapping("/only-available")
    public String available(Model model) {
        List<ShopItem> filterAvailable = itemList
                .stream().filter( p -> p.getStockNr() > 0 )
                .collect( Collectors.toList() );
        model.addAttribute( "items", filterAvailable );
        return "wshome";

    }

    @RequestMapping("/contains-nike")
    public String getNikes(Model model) {
        List<ShopItem> filterNike = itemList
                .stream().filter( p -> p.getName().toUpperCase().contains( "NIKE" ) || p.getDescription().toUpperCase().contains( "NIKE" ) )
                .collect( Collectors.toList() );
        model.addAttribute( "items", filterNike );
        return "wshome";

    }

    @RequestMapping("/most-expensive")
    public String getPriciest(Model model) {
        ShopItem filterPrice = itemList
                .stream().filter( p -> p.getStockNr() > 0 )
                .max( Comparator.comparing( ShopItem::getPrice ) ).get();
        model.addAttribute( "expensiveName", filterPrice.getName() );
        return "wsmostexpitem";
    }

    @RequestMapping("/cheapest-first")
    public String getCheapest(Model model) {
        List<ShopItem> filterNike = itemList
                .stream()
                .sorted( Comparator.comparing( ShopItem::getPrice ) ).collect( Collectors.toList() );
        model.addAttribute( "items", filterNike );
        return "wshome";
    }


    @RequestMapping("/average-stock")
    public String getAverage(Model model) {
        double averageSum = itemList
                .stream().collect( Collectors.averagingInt( p -> p.getStockNr() ) );
        model.addAttribute( "average", averageSum );
        return "wsaverage";
    }


    @RequestMapping("/search")
    public String searchElements (Model model, @RequestParam String text) {
        List<ShopItem> searchBar = itemList
                .stream()
                .filter( p -> p.getDescription().toLowerCase().contains( text.toLowerCase() ) || p.getName().toLowerCase().contains( text.toLowerCase() ) )
                .collect( Collectors.toList() );
        model.addAttribute( "items", searchBar );
        return "wshome";
    }
}
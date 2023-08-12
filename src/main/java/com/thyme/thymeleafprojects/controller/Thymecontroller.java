package com.thyme.thymeleafprojects.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Thymecontroller {
    @GetMapping("/boocards")
    public String cardchanger(Model model){
    List<Card> cards=new ArrayList<>();
    cards.add(new Card("LADAKH", "Ladakh is the highest plateau in India ", "/images/LADAKH.jpg"));
    cards.add(new Card("COORG", "Kodagu, also known as Coorg, is a rural district in the southwest Indian state of Karnataka.", "/images/COORG.jpg"));
    cards.add(new Card("ANDMAN-NICOBAR", "The Andaman Islands are an Indian archipelago in the Bay of Bengal", "/images/ANDAMAN-NICOBAR-ISLANDS.jpg"));
    cards.add(new Card("MANALI", "Manali is a high-altitude Himalayan resort town in India 2019s northern Himachal Pradesh state", "/images/MANALI.jpg"));
    cards.add(new Card("PUTTUR", "This place consist of many notable visiting spots like Shri Mahathobara Mahalingeshwara Temple", "/images/mahalinkeshwar.jpeg"));
    cards.add(new Card("GOA", "Goa is a state in western India with coastlines stretching along the Arabian Sea", "/images/GOA.jpg"));
    model.addAttribute("cards",cards);
    return "cardhome";
}

}

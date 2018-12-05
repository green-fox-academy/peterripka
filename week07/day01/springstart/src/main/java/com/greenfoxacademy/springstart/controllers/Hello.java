package com.greenfoxacademy.springstart.controllers;

import java.util.Random;

public class Hello {
    int size;
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag", "Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"red", "pink", "maroon", "blue", "yellow", "aqua", "cyan", "orange", "navy", "green", "magenta", "olive", "lime", "purple", "teal", "coral", "gold"};

    Random random = new Random();

    public Hello() {
    }

    public String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];

    }

    public int getRandomSize() {
        size = random.nextInt(36) + 10;
        return size;
    }

    public String getRandomHello() {
        return hellos[(int) (Math.random() * hellos.length)];
    }
}
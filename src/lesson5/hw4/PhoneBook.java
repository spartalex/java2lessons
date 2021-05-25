package lesson5.hw4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> book = new HashMap<>();

    public void addContact(String phone, String surName) {
        book.put(phone, surName);
    }

    public List<String> getPhones(String surname) {
        ArrayList<String> phones = new ArrayList<>();
        for (Map.Entry<String, String> entry : book.entrySet()) {
            if (entry.getValue().equals(surname)) {
                phones.add(entry.getKey());
            }
        }
        return phones;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("123423", "Иванов");
        phoneBook.addContact("234", "Сидоров");
        phoneBook.addContact("23456556777", "Иванов");
        phoneBook.addContact("6534", "Петров");

        System.out.println(phoneBook.getPhones("Сидоров"));
    }
}

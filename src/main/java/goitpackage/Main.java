package goitpackage;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Gson().toJson(
                new User("Andrii", "Syrnyk")
        ));
    }
}
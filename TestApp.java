package atividadesomativa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestApp {
    public static void main(String[] args) {
        int max = 20;
        int min = 1;
        List<Integer> valores = new ArrayList<>();
        Random random = new Random();  
        int aleatorio = 0;
        for (int i = 0; i < 10; i++) {
            aleatorio = random.nextInt(max - min) + min;
            valores.add(aleatorio);
        }
        System.out.println("hello, world!");
    }
} 
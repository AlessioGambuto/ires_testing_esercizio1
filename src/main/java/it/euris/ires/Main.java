package it.euris.ires;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res = c.add(1,1);
        System.out.println(res);

        if (res == 2){
            System.out.println("TEST: Corretto");
        } else {
            System.out.println("TEST: Errore");
        }
    }
}

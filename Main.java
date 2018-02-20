package lab1;

import lab1.Bank;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank Monobank = new Bank();
        Bank Raifeissen = new Bank("Raifeissen", 1996, "Commercial", "Open");
        Bank Privatbank = new Bank("Privatbank", 1996, "Commercial","Open", "Big");

        System.out.println(Monobank.toString());
        System.out.println(Raifeissen.toString());
        System.out.println(Privatbank.toString());

        Monobank.printSum();
        Raifeissen.printSum();
        Privatbank.printSum();
        Privatbank.printStaticSum();
        System.out.println(" ");

        Monobank.resetValues("Universallbank", 1998, "Comercial", "Open", "Big");
        Privatbank.resetValues("PrivatBank", 2017,"State", "Open", "Big");
        Raifeissen.setQuantityOfCustomer(250000000);

        System.out.println(Monobank.toString());
        System.out.println(Raifeissen.toString());
        System.out.println(Privatbank.toString());

        Raifeissen.printSum();
        Privatbank.printSum();
        Raifeissen.printStaticSum();
    }


}

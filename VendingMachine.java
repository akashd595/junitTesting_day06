package com.bridgelabz_junit;

public class VendingMachine {
    static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
    static int calcNotes = 0;
    public int VendingMachine(int money) {

        int i = 0, rem;
        while (money > 0) {
            if (money >= notes[i]) {
                calcNotes += money / notes[i];
                rem = money % notes[i];
                money = rem;
            }
            i++;
        }
        return calcNotes;
    }
}
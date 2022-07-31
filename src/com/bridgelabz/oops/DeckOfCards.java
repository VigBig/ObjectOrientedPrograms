package com.bridgelabz.oops;

public class DeckOfCards {

    public static void main(String[] args) {

        System.out.println("Welcome to Deck of Cards :");

        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String players[][] = new String[4][9];

        String deck[] = new String[52];
        int k=0;

        for(int i=0; i< suit.length; i++){

            for(int j=0; j< rank.length; j++){

                deck[k] = rank[j] + " of " + suit[i];
                k++;

            }

        }

//        for(int m=0; m< deck.length; m++){
//            System.out.println(deck[m]);
//        }

//        int shuffle = (int) (Math.random()*52)+1;

        for(int i=0; i<4; i++){

            for(int j=0; j<9; j++){

                int shuffle = (int)(Math.random() * 52);

                if(deck[shuffle]!="0"){

                    players[i][j] = deck[shuffle];
                    deck[shuffle] = "0";

                }else{
                    --j;
                }

            }

        }

        for(int i=0; i<4; i++){
            System.out.println("Cards received by Player "+ (i+1) +":");
            for(int j=0; j<9; j++){

                System.out.println(players[i][j]);

            }

        }

    }

}

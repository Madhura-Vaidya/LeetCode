package org.example;

import java.util.Stack;

public class Racers {
    public static void main(String[] args){
        String[][] racers = {{"Madhura 140", "Amar 120", "Arya 100", "Hrihan 90"},
                            {"Madhura 130", "Amar 150", "Arya 120", "Hrihan 110"}
                            };
        String[] losers = findRacers(racers);
        for(String loser:losers){
            System.out.println("loser"+ loser);
        }

    }

    public static String[] findRacers(String[][] racers){
        Stack<String> losers = new Stack<>();

        for(int i = 0; i< racers.length; i++){
            String[] racer = racers[i];
            int maxTime = Integer.MIN_VALUE;
            for(int j = 0; j < racer.length;j++){

                String[] racerTime = racer[j].split(" ");
                if(Integer.parseInt(racerTime[1]) > maxTime){
                    if(maxTime != Integer.MIN_VALUE){
                        losers.pop();
                    }
                    losers.push(racerTime[0]);
                    maxTime = Integer.parseInt(racerTime[1]);
                }


            }
        }
        return losers.toArray(new String[0]);

    }
}

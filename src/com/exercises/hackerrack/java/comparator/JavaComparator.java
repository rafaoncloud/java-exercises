package com.exercises.hackerrack.java.comparator;

import com.exercises.hackerrack.java.collections.JavaHashSet;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// Write your Checker class here
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2){
        if(p1.score > p2.score){
            return -1;
        }else if(p1.score < p2.score){
            return 1;
        }

        Integer val = p1.name.compareTo(p2.name);
        if(val < 0){
            return -1;
        }else if(val > 0){
            return 1;
        }

        return 0;
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class JavaComparator {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(JavaComparator.class.getResource("comparator-testcase.txt").getPath());
        Scanner in = new Scanner(file);

        int n = in.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(in.next(), in.nextInt());
        }
        in.close();

        Arrays.sort(player, checker); // Orders from smaller to larger values (the comparator was reversed)
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

package com.exercises.designPatterns.adapter.players;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Play mp4 file. Name: " + fileName);
    }
}

package brocodeAter28._39_Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        Scanner scn =new Scanner(System.in);
        File file=new File("WaveSong.wav");
        AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(file);
        Clip clip= AudioSystem.getClip();
        clip.open(audioInputStream);

        String input="";

        while (!input.equals("Q")){
            System.out.println("choose what you wanna do");
            System.out.println("play=P , pause=PS, reset=R , quit=Q");
            input=scn.next();
            input= input.toUpperCase();


            switch (input){
                case ("P"):clip.start();
                break;
                case("PS"):clip.stop();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                    clip.start();
                break;
                case ("Q"):clip.close();
                break;
                default:System.out.println("not a valid input");
            }
        }
        System.out.println("byeeeeeeeeeee");
    }
}

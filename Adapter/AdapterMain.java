/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gusti
 */
public class AdapterMain {
   public static void main(String[] args) {
      Video videoPlayer = new Video();

      videoPlayer.play("3gp", "AHAHAHHAHA.3gp");
      videoPlayer.play("mp4", "Reborn Behind The Scene.mp4");
      videoPlayer.play("mp3", "Stay With me.mp3");
      videoPlayer.play("avi", "Redfoo - MOMOMO.avi");
   }
}
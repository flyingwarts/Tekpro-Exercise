/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gusti
 */
public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String VideoType){
   
      if(VideoType.equalsIgnoreCase("3gp") ){
         advancedMusicPlayer = new trigpPlayer();			
         
      }else if (VideoType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }	
   }

   @Override
   public void play(String VideoType, String fileName) {
   
      if(VideoType.equalsIgnoreCase("3gp")){
         advancedMusicPlayer.play3gp(fileName);
      }
      else if(VideoType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}
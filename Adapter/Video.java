/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gusti
 */
public class Video implements MediaPlayer {
   MediaAdapter mediaAdapter; 

   @Override
   public void play(String VideoType, String fileName) {		

      //inbuilt support to play mp3 music files
      if(VideoType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: " + fileName);			
      } 
      
      //mediaAdapter is providing support to play other file formats
      else if(VideoType.equalsIgnoreCase("3gp") || VideoType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(VideoType);
         mediaAdapter.play(VideoType, fileName);
      }
      
      else{
         System.out.println("Invalid media. " + VideoType + " format not supported");
      }
   }   
}
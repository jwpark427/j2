package com.j2.state.videoplayer;  

public class OnvideoState implements State {  
   VideoPlayer videoplayer;  
   public OnvideoState(VideoPlayer videoplayer) {  
        this.videoplayer = videoplayer;  
    }  
   public void onVideoState(){
 System.out.println("video on!");
  }
   public void playVideoState(){
     System.out.println("video play!");
 }  
   public void stopplayVideoState(){
     System.out.println("stop play video ");
   }
   public void offVideoState(){
     System.out.println("video off!"); 

 }
 public void display(){
    System.out.println("display is the end");}  
       
}  

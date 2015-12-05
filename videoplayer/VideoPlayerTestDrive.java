package com.j2.state.videoplayer;  
public class VideoPlayerTestDrive {  
  public static void main(String[] args) {  
   VideoPlayer video = new VideoPlayer("Video");  
   
   System.out.println("-----------------");  
   System.out.println(video);
   video.onVideoState();  
   video.playVideoState();   
   System.out.println(video);
   video.onVideoState();  
   video.playVideoState();  
   video.stopplayVideoState();  
   video.offVideoState();  
  }  
 } 
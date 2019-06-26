void setup() {
  PImage waldo = loadImage("waldosaurus rex.jpg"); // Change this to match your file name.
  size(1300, 700);
  image(waldo, 0, 0, 1300, 700);
  
  doh = minim.loadSample("homer-doh.wav"); //drag and drop from project onto sketch
  woohoo = minim.loadSample("homer-woohoo.wav"); //drag and drop from project onto sketch } 
}

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
println("X: " + mouseX + " Y: " + mouseY);
      // If the mouse is on Waldo, print “Waldo found!”
if(mouseX == 950 && mouseY == 161 && mousePressed == true){
 println("Call off the search! Waldo has been located!"); 
 playWoohoo();
}
else if(mousePressed == true){
 playDoh(); 
}
      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;

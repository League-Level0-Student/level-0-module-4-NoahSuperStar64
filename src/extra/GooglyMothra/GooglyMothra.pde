int X = 209;
int Y = 251;
void setup(){
face = loadImage ("TITANUS_MOSURA.jpg");  
 size (664, 500);
 face.resize(664, 500);
  background (face);
  
}
 PImage face;
void draw(){
  background (face);
  fill(#B3E3DD);
ellipse(250, 235, 46, 50);
ellipse(209, 251, 64, 64);

if(dist (209, 251, mouseX, mouseY)<25){
  X = mouseX;
  Y = mouseY;
}

 fill(#000000);
 ellipse(X, Y, 13, 13);
 fill(#B3E3DD);
 ellipse(X, Y, 5, 5);
println (mouseX);
println (mouseY);
ellipse(250, 235, 10, 10);


ellipse(250, 235, 4, 4);

}

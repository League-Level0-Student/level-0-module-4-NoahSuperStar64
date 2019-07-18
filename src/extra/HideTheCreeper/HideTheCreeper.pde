int X = 754;
int Y = 208;
PImage creeper;
void setup() {
  size(1020, 680);
  creeper=loadImage("creeper.png"); 
  creeper.resize(50, 50);
  creeper.transparency
  PImage minecraft = loadImage("minecraft.png");     
  minecraft.resize(1020, 680);          
  background(minecraft);
}
void draw() {
  image(creeper, X, Y);
}

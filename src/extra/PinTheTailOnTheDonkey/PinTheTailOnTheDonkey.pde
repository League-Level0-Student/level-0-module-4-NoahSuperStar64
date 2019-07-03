PImage Donkey;
PImage Tail;
int X = mouseX;
int Y = mouseY;
boolean hasClicked = false;
void setup() {
  Donkey = loadImage("DonkeyKong.jpg");
  Tail = loadImage("tail.png");
  size(474, 511);
}
void draw() {
  background(Donkey);
  rect(0, 0, 30, 30);
  println(mouseX);
  println(mouseY);
  rect(60, 275, 40, 40);
  if (dist(0, 0, mouseX, mouseY) > 30) {
    background(#FFFFFF);
  }
  if (hasClicked = true){
    X = mouseX;
    Y = mouseY;
    background(Donkey);
    if (dist(60, 275, mouseX, mouseY) > 40) {
    }
  }
  if (mousePressed) {
   hasClicked = true;
  }
  image(Tail, X-190, Y, 200, 200);
}

PImage Donkey;
PImage Tail;
void setup(){
  Donkey = loadImage("DonkeyKong.jpg");
  Tail = loadImage("tail.png");
  size(474, 511);
}
void draw(){
  background(Donkey);
  rect(0, 0, 30, 30);
  image(Tail, mouseX-190, mouseY, 200, 200);
}

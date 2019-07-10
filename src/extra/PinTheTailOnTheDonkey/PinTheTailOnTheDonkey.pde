import ddf.minim.*;          
AudioSample woohooSound;          
boolean playSound = true;
PImage Donkey;
PImage Tail;
int X = mouseX;
int Y = mouseY;
boolean hasClicked = false;
void setup() {
  Donkey = loadImage("DonkeyKong.jpg");
  Tail = loadImage("tail.png");
  size(474, 511);
  Minim minim = new Minim(this);     
  woohooSound = minim.loadSample("homer-woohoo.wav");
}
void draw() {
  background(Donkey);

  println(mouseX);
  println(mouseY);

  if (dist(0, 0, mouseX, mouseY) > 30 && hasClicked == false) {
    background(#FFFFFF);
  }

  if (hasClicked) {
    background(Donkey);
    image(Tail, X-190, Y, 200, 200);
    if (dist(60, 275, mouseX, mouseY) > 40) {
      if (playSound) {
        woohooSound.trigger();
        playSound = false;
      }
    }
  } else {
    image(Tail, mouseX-190, mouseY, 200, 200);
  }
  if (mousePressed && !hasClicked) {
    hasClicked = true;
    X = mouseX;
    Y = mouseY;
  }
}

PImage rainbow;
PImage unicorn;
void setup(){
  rainbow = loadImage("Rainbow");
  size(800,600);
  rainbow.resize(960,720);
  unicorn = loadImage("Unicorn");
  image(unicorn, mouseX, mouseY);
}
void draw(){
  background(rainbow);
}

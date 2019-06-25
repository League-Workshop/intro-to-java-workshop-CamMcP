PImage rainbow;
PImage unicorm;
void setup(){
  rainbow = loadImage("Rainbow.jpg");
  size(800,600);
  rainbow.resize(800,600);
  unicorm = loadImage("Unicorm.png");
}
void draw(){
  background(rainbow);
  image(unicorm, mouseX, mouseY);
}

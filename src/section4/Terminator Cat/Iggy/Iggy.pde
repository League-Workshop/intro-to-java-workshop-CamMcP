PImage catPic;
int x = 0;
int y = 0;
int acceleration = 5;
void setup() {
  size(900, 900); 
  catPic = loadImage("cat.png");
  catPic.resize(900, 900);
  background(catPic);
}

void draw() {
  noStroke();
  ellipse( mouseX, mouseY, 50, 50);
  fill(255, 0, 0 );
ellipse( mouseX, mouseY, 50, 50);
  fill(255, 0, 0 );
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
keyPressed();  
}
}

void keyPressed() {
  x+=2*acceleration;
  y+=2*acceleration;
}

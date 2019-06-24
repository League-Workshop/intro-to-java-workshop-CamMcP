PImage musatche;
 PImage friend;
 int x;
 int y;
void setup(){
  friend =loadImage("friend.png");
  size(800, 600);
  friend.resize(800, 600);
  musatche = loadImage("Musatche.png");
  musatche.resize(400, 400);
}
void draw(){
  background(friend);
  image(musatche, x, y);
  if(mousePressed){
    x = mouseX;
    y =mouseY;
  }

}

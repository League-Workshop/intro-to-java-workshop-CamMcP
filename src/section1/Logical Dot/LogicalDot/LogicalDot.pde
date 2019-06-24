void setup() {
  size(800, 800);
}
void draw() {
  if (mousePressed) {
    fill(245, 10, 10);
  } else {
    fill(255, 115, 0);
  }
  ellipse(500, 500, mouseX, mouseY);
}

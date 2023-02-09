ArrayList<Schneeflocke> schneeflocke01 = new ArrayList<Schneeflocke>();
PImage img;


void setup() {
  size(1920, 1200);
  img = loadImage("haus.jpg");
  for (int i = 0; i < 1000; i++) {
    schneeflocke01.add(new Schneeflocke());
  }
}

void draw() {
  background(img);
  for (Schneeflocke schneeflocke01 : schneeflocke01) {
    schneeflocke01.draw();
  }
}

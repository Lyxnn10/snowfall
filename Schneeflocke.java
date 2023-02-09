public class Schneeflocke{

  float xPos = random(width);
  float yPos = random(height);
  float size = random(10);
  float velocity = random(1,12);

  void draw(){
   ellipse(xPos, yPos, size, size);

   yPos+= velocity;

   if(yPos > height){
     yPos = 0;
     xPos = random(width);
   }
  }
}

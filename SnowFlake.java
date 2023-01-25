class SnowFlake{

  float x = random(width);
  float y = random(height);
  float r = random(10);
  float v = random(1,10);
  
  void draw(){
   ellipse(x, y, r, r);

   y+=v;

   if(y > height){
     y = 0;
     x = random(width);
   }
  }
}

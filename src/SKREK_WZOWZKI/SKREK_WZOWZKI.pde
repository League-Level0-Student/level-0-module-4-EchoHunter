void setup(){
   size(750,1000);
    PImage face = loadImage("SKREK WZOWZKI.jpg");
    background(face);
    face.resize(width,height);
}
void draw(){
 ellipse(250,275,100,100);
 ellipse(450,275,100,100);
 if((mouseX > 295) && (mouseX < 295)){
   if((mouseY > 135) && (mouseY < 335)){
     ellipse(mouseX,mouseY,25,25);
   }
 }
 
 
}

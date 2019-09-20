void setup(){
   size(750,1000);
    PImage face = loadImage("SKREK WZOWZKI.jpg");
    background(face);
    face.resize(width,height);
}
void draw(){
 fill(#FFFFFF);
  ellipse(250,275,100,100);
 ellipse(450,275,100,100);
 if((mouseX > 215) && (mouseX < 285)){
   if((mouseY > 225) && (mouseY < 315)){
    fill(#000000);
     ellipse(mouseX,mouseY,25,25);
   fill(#1A03FF);
     ellipse(mouseX+200,mouseY,25,25);
   }
 }
 
 
}

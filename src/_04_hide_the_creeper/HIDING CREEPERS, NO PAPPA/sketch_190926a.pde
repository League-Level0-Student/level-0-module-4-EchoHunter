PImage creeper;
//at the top of your program
int place = (int)random(1,500);
int place2 = (int)random(1,500);
PImage minecraft ;


void setup(){
  size(500, 500); //in setup method
     //in setup method
minecraft = loadImage("minecraft.png");
minecraft.resize(width, height); 
background(minecraft);
         //in setup method  
     

creeper=loadImage("creeper.png");     //in setup method
creeper.resize(10, 10);     //in setup method

}

   
void draw(){ 
background(minecraft);    
  image(creeper, place, place2);     //in draw method
  if(mousePressed){
   if((mouseX > place ) && (mouseX < place + 10)){
     if((mouseY > place2) && (mouseY < place2 +10)){
       fill(#4BFC00);
   ellipse(mouseX,mouseY,10,10);
     }
   }
    else{
      fill(#FC0000);
    ellipse(mouseX,mouseY,10,10);
    }
    
  }
 
}

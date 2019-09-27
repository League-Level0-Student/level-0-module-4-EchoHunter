PImage creeper;     //at the top of your program
int place = 25;
int place2 = 25;
void setup(){
  size(500, 500); //in setup method
PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(500, 500);          //in setup method
background(minecraft);          //in setup method
creeper=loadImage("creeper.png");     //in setup method
creeper.resize(10, 10);     //in setup method
}


void draw(){
  image(creeper, mouseX, mouseY);     //in draw method
  
}

 PImage donkey;
PImage tail;
int distance;
int distance2;
int number = 30;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch



// put these lines where you want the sound to play

void setup() {Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
 donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(550, 406);     //replace width, height with your picture's dimensions
tail.resize(150, 150);     //replace width, height with your tail's dimension
}

void draw() {
  background (donkey);
rect(0, 0, 30, 30);
rect(450, 80, 40, 40);
distance = (int)dist(0, 0, mouseX, mouseY);
if(distance > number){
  background (#000000);
  if(mousePressed){
    image(tail, mouseX, mouseY);
    
  }
  if((mouseX > 450) && (mouseX <490)){
    if((mouseY > 80)&&(mouseY < 120)){
      if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
    }
  }
  
}
}

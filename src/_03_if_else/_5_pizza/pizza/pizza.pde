
void setup() {
    size(600, 600);
    pepperoni = loadImage("pepperoni.png");
}
void draw() {
    fill(255, 229, 175);
ellipse(300, 300, 550, 550);
fill(232, 67, 59);
ellipse(300, 300, 525, 525);
fill(250, 241, 146);
ellipse(300, 300, 480, 480);
image(pepperoni,200,200);
pepperoni.resize(80, 80);
image(pepperoni,130,120);
pepperoni.resize(80, 80);
image(pepperoni,300,300);
pepperoni.resize(80, 80);
image(pepperoni,230,460);
pepperoni.resize(80, 80);
image(pepperoni,130,120);
pepperoni.resize(80, 80);
image(pepperoni,130,120);
pepperoni.resize(80, 80);
image(pepperoni,360,70);
pepperoni.resize(80, 80);
}
PImage pepperoni;

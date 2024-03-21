import processing.core.PApplet;

/**
 * Processing Task 4
 * @author: Kayla Jin
 */

public class Sketch extends PApplet {

  // Window Size
  public void settings() {
    size(400, 400);
  }

  // Background
  public void setup() {
    background(255, 255, 255);
  }

  // Images
  public void draw() {
    
    // Quadrant 1 - 10x10 Grid
    
    // Grid Lines
    for(float fltLineX = width / 20; fltLineX < width / 2; fltLineX += width / 20){
      
      for(float fltLineY = height / 20; fltLineY < height / 2; fltLineY += height / 20){
        
        stroke(0, 0, 0);
        strokeWeight(width * 1/200);
        line(fltLineX, 0, fltLineX, height / 2);
        line(0, fltLineY, width / 2, fltLineY);
      }
    }
    // Quadrant 2 - 5 x 5 Evenly Spaced Circles
    for(float fltCircX = width * 8/13; fltCircX <= width * 12/13; fltCircX += width / 13){
      
      for(float fltCircY = height * 1/13; fltCircY <= height * 5/13; fltCircY += height / 13){
        
        strokeWeight(width * 1/400);
        fill(207, 0, 114);
        stroke(0, 0, 0);
        ellipse(fltCircX, fltCircY, width / 20, height / 20);
      }
    // Quadrant 3 - Linear Gradient
    float fltGradientX = 0;

    for(float fltStroke = 0; fltStroke <= 255; fltStroke += 1){
      
      stroke(fltStroke, fltStroke, fltStroke);
      line(fltGradientX, height / 2, fltGradientX, height);
      fltGradientX = (float)(fltGradientX + width / 510.0);
      }
    }
    // Quadrant 4 - 8 Petal Flower
    
    // Petals
    for(float fltAngle = 0; fltAngle <= 360; fltAngle += 45){
      
      fill(222, 106, 44);
      stroke(0, 0, 0);

      pushMatrix(); 
      translate(width * 3/4, height * 3/4); 
      rotate(radians(fltAngle));
      ellipse(width * 1/12, 0, width / 5, height / 20);
      popMatrix();
    }
    // Flower Centre
    fill(32, 117, 47);
    stroke(32, 117, 47);
    ellipse(width * 3/4, height * 3/4, width / 10, height / 10);
  }
}
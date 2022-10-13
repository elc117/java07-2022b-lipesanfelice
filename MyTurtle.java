public class MyTurtle extends BaseTurtle {

	public void draw() {
    
		this.back(4);			
		this.forward(8);
		this.turn(120);
    pen.setRandomColor();
		this.forward(8);
		this.turn(120);
    pen.setRandomColor();
		this.forward(8);
		this.turn(120);
		
    this.back(-4);			
		this.forward(-8);
		this.turn(120);
    pen.setRandomColor();
		this.forward(-8);
		this.turn(120);
    pen.setRandomColor();
		this.forward(-8);
		this.turn(120);

    this.back(-8);			
		this.forward(-8);
		this.turn(120);
		pen.setRandomColor(); 
		this.forward(-8);
		this.turn(120);
		pen.setRandomColor();
		this.forward(-8);
		this.turn(120);

    this.moveTo(0, 0);
		//this.reset();

    this.setDelay(1);
    pen.setColor(0,0,0);
		for (int i = 0; i < 60; i++) {
      //this.square(7);
      this.back(-i);			
		  this.forward(i);
		  this.turn(120);
		  pen.setRandomColor(); 
		  this.forward(i);
		  this.turn(120);
		  pen.setRandomColor();
		  this.forward(i);
		  this.turn(120);
      //this.square(7);
		}

    this.moveTo(0, 0);
    for (int i = 0; i < 60; i++) {
      this.back(i);			
		  this.forward(i);
		  this.turn(120);
		  pen.setRandomColor(); 
		  this.forward(i);
		  this.turn(120);
		  pen.setRandomColor();
		  this.forward(i);
		  this.turn(120);
		
		}
		this.pause(2); 	
		this.reset(); 

	}
}
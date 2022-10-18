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

    		this.setDelay(1);
    		pen.setColor(0,0,0);
		for (int i = 0; i < 60; i++) {
     		  this.back(i);			
		  this.forward(-i);
		  this.turn(120);
		  pen.setRandomColor(); 
		  this.forward(-i);
		  this.turn(120);
		  pen.setRandomColor();
		  this.forward(-i);
		  this.turn(120);
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

		this.moveTo(0, 0);

    		this.setDelay(1);
    		pen.setColor(0,0,0);
		for (int i = 0; i < 60; i++) {
     	 	  this.back(-i);			
		  this.forward(-i);
		  this.turn(120);
		  pen.setRandomColor(); 
		  this.forward(-i);
		  this.turn(120);
		  pen.setRandomColor();
		  this.forward(-i);
		  this.turn(120);
		}

    		this.moveTo(0, 0);
    		for (int i = 0; i < 60; i++) {
     		  this.back(-i);			
		  this.forward(i);
		  this.turn(120);
		  pen.setRandomColor(); 
		  this.forward(i);
		  this.turn(120);
		  pen.setRandomColor();
		  this.forward(i);
		  this.turn(120);
		
		}
		
		pen.up();
		this.moveTo(-6, -7);

		this.setDelay(20);  
		pen.down();
		pen.setRandomColor(); 
		for (int i = 0; i < 10; i++) {
			pen.setRandomColor(); 
			this.square(3);	
			this.turn(28);  	
		}

		pen.up();
		this.moveTo(6, -6.5);

		this.setDelay(20);  
		pen.down();
		pen.setRandomColor(); 
		for (int i = 0; i < 10; i++) {
			pen.setRandomColor(); 
			this.square(3);	
			this.turn(28);  	
		}

		pen.up();
		this.moveTo(-1.8, 7.5);

		this.setDelay(20);  
		pen.down();
		pen.setRandomColor(); 
		for (int i = 0; i < 10; i++) {
			pen.setRandomColor(); 
			this.square(3);	
			this.turn(28);  	
		}

		this.pause(2); 	
		this.reset(); 	



	}
	private void square(double size) {
		for (int i = 0; i < 5; i++) {
			this.forward(size);
			this.turn(120);
		}
	}
}

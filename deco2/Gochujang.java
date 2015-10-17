
   
 public class Gochujang extends CondimentDecorator { 
	 Food food; 
   
 	public Gochujang(Food food) { 
 		this.food = food; 
 	} 
   
 	public String getDescription() { 
 		return food.getDescription() + ", Gochujang"; 
 	} 
   
 	public double cost() { 
 		return .10 + food.cost(); 
 	} 
 } 

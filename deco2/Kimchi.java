
 
 
 public class Kimchi extends CondimentDecorator { 
 	Food food; 
 
 
 	public Kimchi(Food food) { 
 		this.food = food; 
 	} 
 
 
 	public String getDescription() { 
 		return food.getDescription() + ", Kimchi"; 
 	} 
 
 
 	public double cost() { 
 		return .10 + food.cost(); 
 	} 
 } 

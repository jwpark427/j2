
 
 
 public class Egg extends CondimentDecorator { 
 	Food food; 
 
 
 	public Egg(Food food) { 
 		this.food = food; 
 	} 
 
 
 	public String getDescription() { 
 		return food.getDescription() + ", Egg"; 
 	} 
 
 
 	public double cost() { 
 		return .10 + food.cost(); 
 	} 
 } 

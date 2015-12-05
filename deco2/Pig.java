
 
 
 public class Pig extends CondimentDecorator { 
 	Food food; 
 
 
 	public Pig(Food food) { 
 		this.food = food; 
	} 
 
 
 	public String getDescription() { 
 		return food.getDescription() + ", Pig"; 
 	} 
 
 
 	public double cost() { 
 		return .15 + food.cost(); 
 	} 
 }
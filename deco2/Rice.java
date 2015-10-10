
 
 
 public class Rice extends CondimentDecorator { 
 	Food food; 
 
 
 	public Rice(Food food) { 
 		this.food = food; 
	} 
 
 
 	public String getDescription() { 
 		return food.getDescription() + ", Rice"; 
 	} 
 
 
 	public double cost() { 
 		return .15 + food.cost(); 
 	} 
 } 

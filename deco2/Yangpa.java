
 
 
 public class Yangpa extends CondimentDecorator { 
	 Food food; 
 
 
 	public Yangpa(Food food) { 
 		this.food = food; 
 	} 
 
 
 	public String getDescription() { 
 		return food.getDescription() + ", Yangpa"; 
 	} 
 
 
 	public double cost() { 
 		return .10 + food.cost(); 
 	} 
 } 

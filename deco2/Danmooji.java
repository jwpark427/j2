

 public class Danmooji extends CondimentDecorator { 
 	Food food; 
   
 	public Danmooji(Food food) { 
 		this.food = food; 
 	} 
   
 	public String getDescription() { 
 		return food.getDescription() + ", Danmooji"; 
 	} 
   
 	public double cost() { 
 		return .20 + food.cost(); 
 	} 
 } 

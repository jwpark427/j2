

 public class Ggae extends CondimentDecorator { 
 	Food food; 
   
 	public Ggae(Food food) { 
 		this.food = food; 
 	} 
   
 	public String getDescription() { 
 		return food.getDescription() + ", Ggae"; 
 	} 
   
 	public double cost() { 
 		return .100 + food.cost(); 
 	} 
 } 



 public class Kim extends CondimentDecorator { 
 	Food food; 
   
 	public Kim(Food food) { 
 		this.food = food; 
 	} 
   
 	public String getDescription() { 
 		return food.getDescription() + ", Kim"; 
 	} 
   
 	public double cost() { 
 		return .20 + food.cost(); 
 	} 
 } 

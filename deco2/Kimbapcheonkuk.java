
 
 
 public class Kimbapcheonkuk { 
   
 	public static void main(String args[]) { 
 		Food food = new Ramen(); 
 		System.out.println(food.getDescription()  
 				+ " $" + food.cost()); 
   
 		Food food2 = new Jeyookbokeum(); 
 		food2 = new Pig(food2); 
 		food2 = new Gochujang(food2); 
 		food2 = new Yangpa(food2);
 		food2 = new Ggae(food2);
 		System.out.println(food2.getDescription()  
 				+ " $" + food2.cost()); 
   
 		Food food3 = new Kimbap(); 
 		food3 = new Kim(food3); 
 		food3 = new Rice(food3); 
 		food3 = new Danmooji(food3); 
 		System.out.println(food3.getDescription()  
 				+ " $" + food3.cost());

		Food food4 = new Kimchibokeumbap(); 
 		food4 = new Kimchi(food4); 
 		food4 = new Rice(food4); 
 		food4 = new Egg(food4); 
 		System.out.println(food4.getDescription()  
 				+ " $" + food4.cost()); 
 	} 
 } 

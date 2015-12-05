package com.j2.iterator.dinermerger.after;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 9;
    int numberOfItems = 0;
    MenuItem[] menuItems;
  
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
 
        addItem("Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT",
                "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day",
                "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog",
                "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Steamed Veggies and Brown Rice",
                "Steamed vegetables over brown rice", true, 3.99);
        addItem("Pasta",
                "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
        addItem("당근 스프",
                "당근을 잘라서 끓인 스프", true, 6.77);        
        addItem("양송이 토마토 파스타",
                "양송이와 토마토소스로 만든 파스타", true, 2.23);      
        addItem("양송이 크림 파스타",
                "양송이와 크림소스로 만든 파스타", true, 2.23);     
 }
    public void addItem(String n, String d, boolean v, double p) {
        MenuItem menuItem = new MenuItem(n, d, v, p);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}

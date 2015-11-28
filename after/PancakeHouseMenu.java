package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("칠리 치즈 오믈렛", 
                "칠리소스와 소세지가 들어간 오믈렛", true, 3.12);
        addItem("프렌치토스트와 과일콤비네이션", 
                "프렌치토스트와 과일이 같이 나오는 메뉴", false, 2.55);
        addItem("해산물 오일 파스타",
                "각종 해산물에 올리브 오일이 들어간 파스타", true, 3.65);
        addItem("버터밀크 팬케익",
                "버터,밀크로 만든 팬케익", true, 1.65);
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
    public String toString() {
        return "Objectville Pancake House Menu";
    }
   
}

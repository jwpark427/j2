package com.j2.iterator.dinermerger.after;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;
 
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
    
        addItem("ĥ�� ġ�� ���ɷ�", 
                "ĥ���ҽ��� �Ҽ����� �� ���ɷ�", true, 3.12);
        addItem("����ġ�佺Ʈ�� �����޺���̼�", 
                "����ġ�佺Ʈ�� ������ ���� ������ �޴�", false, 2.55);
        addItem("�ػ깰 ���� �Ľ�Ÿ",
                "���� �ػ깰�� �ø��� ������ �� �Ľ�Ÿ", true, 3.65);
        addItem("���͹�ũ ������",
                "����,��ũ�� ���� ������", true, 1.65);
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

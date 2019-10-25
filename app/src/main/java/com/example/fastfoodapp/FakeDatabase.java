package com.example.fastfoodapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {


    public static MenuItem getMenuItembyId(int menuItemId) {
        return menuItems.get(menuItemId);
    }

    public static ArrayList<MenuItem> getAllMenuItems() {
        return new ArrayList<MenuItem>((List) Arrays.asList(menuItems.values().toArray()));
    }

    private static final HashMap<Integer, MenuItem> menuItems = new HashMap<>();

    static {
        menuItems.put(1, new MenuItem(
                "Triple Stacker Kong",
                R.drawable.menu_item1,
                "$8.50", "features more than ¾ lb.* of savory flame-grilled 100% beef, topped with smoky bacon, melted American cheese and our special Stacker sauce all on a toasted sesame bun."
                ,1

        ));
        menuItems.put(2, new MenuItem(
                "Kong Cheeseburger",
                R.drawable.menu_item2,
                "$4.00",
                "You can’t go wrong with our Bacon Cheeseburger, a signature flame-grilled beef patty topped with smoked bacon and a layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                2
        ));

        menuItems.put(3, new MenuItem(
                "Chicken Fries",
                R.drawable.menu_item3,
                "$3.00",
                "our Chicken Fries are coated in a light crispy breading seasoned with savory spices and herbs. Chicken Fries are shaped like fries and are perfect to dip in any of our delicious dipping sauces. Choose from BBQ, Honey Mustard, Ranch, Zesty, Buffalo and Sweet & Sour.",
                3
        ));

        menuItems.put(4, new MenuItem(
                "Kong Chicken Club",
                R.drawable.menu_item4,
                "$6.00",
                "made with 100% white meat chicken filet, seasoned and breaded and carefully layered with thick-cut smoked bacon, American cheese, fresh lettuce, ripe tomato, and creamy mayonnaise on a potato bun.",
                4
        ));

        menuItems.put(5, new MenuItem(
                "Caesar Chicken Kong",
                R.drawable.menu_item5,
                "$7.00",
                "made with 100% white meat seasoned chicken filet, battered and breaded, and carefully layered with fresh lettuce, ripe tomato, creamy Caesar sauce, bacon, and shaved parmesan cheese all on a potato bun.",
                5
        ));

        menuItems.put(6, new MenuItem(
                "Kong Chicken Rodeo",
                R.drawable.menu_item6,
                "$8.50",
                " is made with our breaded 100% white meat seasoned chicken filet, topped with 3 half-strips of thick-cut smoked bacon, crispy onion rings, tangy BBQ sauce, creamy mayonnaise and American Cheese all on our potato bun.",
                6
        ));

        menuItems.put(7, new MenuItem(
                "Kong Chicken Salad",
                R.drawable.menu_item7,
                "$5.00",
                "is made with our breaded 100% white meat seasoned chicken filet, topped with 3 half-strips of thick-cut smoked bacon, crispy onion rings, tangy BBQ sauce, creamy mayonnaise and American Cheese all on our potato bun.",
                7
        ));

        menuItems.put(8, new MenuItem(
                "Side Salad",
                R.drawable.menu_item8,
                "$2.00",
                "Our Garden Side Salad is a blend of premium lettuces garnished with juicy tomatoes, home-style croutons, a three-cheese medley, and your choice of KEN’S® salad dressing.",
                8
        ));



        menuItems.put(9, new MenuItem(
                "Kong-normous Burrito",
                R.drawable.menu_item9,
                "$6.50",
                "Featuring a generous serving of savory sausage, thick-cut smoked bacon, lots of fluffy eggs, shredded cheddar cheese, golden hash browns, plus a creamy spicy sauce all wrapped up in a warm flour tortilla and served with a side of Picante Sauce.",
                9
        ));

        menuItems.put(10, new MenuItem(
                "B&E Kong Sandwich",
                R.drawable.menu_item10,
                "$3.00",
                "Wake up with our Bacon, Egg & Cheese Maple Waffle sandwich. Thick cut naturally smoked bacon, fluffy eggs, and creamy American cheese are layered carefully between two savory and sweet waffle slices.",
                10
        ));

        menuItems.put(11, new MenuItem(
                "BK coffee",
                R.drawable.menu_item11,
                "$3.00",
                "made with 100% Arabica beans and freshly brewed to deliver perfectly balanced flavor in every cup.",
                11
        ));

        menuItems.put(12, new MenuItem(
                "Frozen Coke",
                R.drawable.menu_item12,
                "$1.00",
                " It’s a cool and refreshing blend of Frozen Coke® and soft serve. ",
                12
        ));

        menuItems.put(13, new MenuItem(
                "Mini Kong Scrolls",
                R.drawable.menu_item13,
                "$3.00",
                "Warm, freshly baked, delicious bite-size cinnamon rolls with its own icing dipping sauce.",
                13
        ));


        menuItems.put(14, new MenuItem(
                "Kong Crumble Pie",
                R.drawable.menu_item14,
                "$2.00",
                "A gooey apple filling enveloped by a flaky pastry crust, our Dutch Apple Pie is served to you warm right out of the kitchen.",
                14
        ));

        menuItems.put(15, new MenuItem(
                "Kong JR meal",
                R.drawable.menu_item15,
                "$10.00",
                "Our Cheeseburger KING JR™ Meal is a signature flame-grilled beef patty topped with a simple layer of melted American cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun Served with a small side of Mott's® natural apple sauce and milk or juice to make it a meal.",
                15
        ));


    }
}



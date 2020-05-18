package homework3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Recipeクラス
		Recipe r1 = new Recipe("ハンバーグ", 200.5);
		Recipe r2 = new Recipe("サーモン", 120);
		System.out.println(r1.getName());
		System.out.println(r1.getCal());
		//Menuクラス
		Menu menu = new Menu("ハンバーグ弁当", "洋食", List.of(r1, r2));
		System.out.println(menu.getName());
		System.out.println(menu.getType());
		System.out.println(menu.getCal());
		System.out.println(menu.getRecipes().get(0).getName());
		//MenuSetクラス
		Menu menu1 = new Menu("鮭弁当", "和食", List.of(r1, r2));
		MenuSet menuSet = new MenuSet(List.of(menu, menu1));
		var menus = menuSet.getMenus();
		System.out.println(menus);
	}

}

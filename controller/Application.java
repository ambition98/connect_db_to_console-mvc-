package mall.controller;

import mall.constant.MenuList;
import mall.controller.menu.CategoryMenu;
import mall.controller.menu.MainMenu;
import mall.controller.menu.Product;
import mall.controller.menu.ProductMenu;
import mall.model.ProductDTO;

public class Application {

	public static void main(String[] args) {
		String category = "";
		
		System.out.println(MenuList.MAIN.ordinal());
		while(true) {
			System.out.println("current pos: " + Position.getCurrentMenu());
			if(ConnectedUser.currentUser == null)
				System.out.println("not logined");
			else
				System.out.println("current user: " 
							+ ConnectedUser.currentUser.getUserId());
			
			switch(Position.getCurrentMenu()) {
			case MAIN:
				MainMenu.execute();
				break;
			case CATEGORY: //미구현
				category = CategoryMenu.execute();
				break;
			case PRODUCT: //미구현
				ProductMenu.execute(category);
				break;
			case PRODUCT_ACT: //미구현
				break;
			}
		}// while
	}
}

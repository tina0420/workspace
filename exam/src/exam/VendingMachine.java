package exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("使用鍵盤輸入投幣金額，只能輸入1,5,10元硬幣");
		Scanner scanner = new Scanner(System.in);
		int money = 0;
		while(true){
			String choice = scanner.nextLine();
		if(choice!="0"){
			switch(choice){
			case "1":
				money = money+1;
				System.out.println("販賣機餘額"+money+"元");
				break;
			case "5":
				money = money+5;
				System.out.println("販賣機餘額"+money+"元");
				break;
			case "10":
				money = money+1;
				System.out.println("販賣機餘額"+money+"元");
				break;
			case "a":
				if(money<10){
					System.out.println("BEEP!");
					money = money;
					System.out.println("販賣機餘額"+money+"元");
				}
				money = money-10;
						System.out.println("販賣機餘額"+money+"元");
						
;			}
		}
		}

	}

}

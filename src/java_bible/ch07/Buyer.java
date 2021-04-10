package java_bible.ch07;


class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	Product [] item  = new Product[10];	//구입한 제품을 저장하기 위한 배열
	int i = 0;
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족해 물건을 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList="";
		
		for(int i=0; i<item.length;i++) {
			if(item[i]==null) break;
			sum+=item[i].price;
			itemList+=item[i]+", ";
		}
		
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 제품은 "+ itemList + "입니다.");
	}
}

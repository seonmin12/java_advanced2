package interfaceEx.homework.Prob1;

public class AnimalTest {

	public static void main(String[] args) {
//		Animal dog = new Dog(8);
//		Animal chicken = new Chicken(3);
//		Chicken cheatableChicken = new Chicken(5);
//
//
//		if(cheatableChicken instanceof Cheatable){
//			cheatableChicken.fly();
//
//		}
//
////		if(chicken instanceof Cheatable){
////		chicken.fly(); // Animal클래스에서 fly가 정의 되어있지 않기 때문에
////		}
//
//		for(int i = 0; i<3; i++){
//			dog.run(1);
//			chicken.run(1);
//			cheatableChicken.run(1);
//			System.out.println((i+1)+"시간 후");
//			System.out.println("개의 이동거리= "+dog.distance);
//			System.out.println("닭의 이동거리= "+chicken.distance);
//			System.out.println("날으는 닭의 이동거리= "+cheatableChicken.distance);
//		}
//		public static void main(String[] args) {
//			Animal dog = new Dog(8);
//			Animal chicken = new Chicken(3);
//			Chicken cheatableChicken = new Chicken(5);
//
//			isCheatable(dog);
//			isCheatable(chicken);
//			isCheatable(cheatableChicken);
//
//
//			for(int i =0; i<3; i++){
//				System.out.println(i+1 + "시간 후");
//				dog.run(1);
//				System.out.println(dog.getDistance());
//				chicken.run(1);
//				System.out.println(chicken.getDistance());
//				cheatableChicken.run(1);
//				System.out.println(cheatableChicken.getDistance());
//			}
//		}
//
//		static void isCheatable(Animal a) {
//			if (a instanceof Cheatable) {
//				((Cheatable) a).fly();
//
//			}

		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);

		isCheatable(chicken);
		isCheatable(cheatableChicken);

		for (int i = 1; i <= 3; i++) {
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);

			System.out.println(i + "시간 후");
			System.out.println("개의 이동거리=" + dog.getDistance());
			System.out.println("닭의 이동거리=" + chicken.getDistance());
			System.out.println("날으는 닭의 이동거리=" + cheatableChicken.getDistance());
		}
	}

	public static void isCheatable(Animal animal) {
		if (animal instanceof Cheatable cheatable) {
			cheatable.fly();
		}
	}

		}















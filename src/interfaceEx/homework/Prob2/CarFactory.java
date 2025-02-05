package interfaceEx.homework.Prob2;

public class CarFactory extends Factory implements IWorkingTogether{

	CarFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		
		return ((CarFactory)partner).makeProducts('B'); 
	}

	@Override
	int makeProducts(char skill) {
		// TODO Auto-generated method stub
		switch(skill){
		case 'A':
			return 3*super.getWorkingTime();

		case 'B':
			return 2*super.getWorkingTime();

		case 'C':
			return 1*super.getWorkingTime();

		default :
			return 0;

		}
	}

}

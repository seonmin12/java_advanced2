package interfaceEx.homework.Prob2;

public class TVFactory extends Factory implements IWorkingTogether{

	TVFactory(String name, int openHour, int closeHour) {
		super(name, openHour, closeHour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int workTogether(IWorkingTogether partner) {
		// TODO Auto-generated method stub
		return ((TVFactory)partner).makeProducts('C');
	}

	@Override
	int makeProducts(char skill) {
		// TODO Auto-generated method stub
		switch(skill){
		case 'A':
			return 8*super.getWorkingTime();

		case 'B':
			return 5*super.getWorkingTime();

		case 'C':
			return 3*super.getWorkingTime();

		default :
			return 1*super.getWorkingTime();

		}
	}

}

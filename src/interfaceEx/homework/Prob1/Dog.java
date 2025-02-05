package interfaceEx.homework.Prob1;

public class Dog extends Animal{

	Dog(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	void run(int hours) {
		// TODO Auto-generated method stub
		distance+=(double)speed*hours/2;
	}

}

package interfaceEx.homework.Prob2;

public class FactoryExample {
	
	public static void main(String[] args) {
		// ===== 1st Car Factory Information
		// Factory Name: CarABC
		// openHour: 7 AM, closeHour: 9 PM
		CarFactory CarABC = new CarFactory("CarABC", 7, 21);
		// ===== 2nd Car Factory Information
		// Factory Name: CarXYZ
		// openHour: 8 AM, closeHour: 7 PM
		CarFactory CarXYZ = new CarFactory("CarXYZ", 8, 19);
		// ===== 1st TV Factory Information
		// Factory Name: TVABC
		// openHour: 8 AM, closeHour: 5 PM
		TVFactory TVABC = new TVFactory("TVABC", 8, 17);
		// ===== 2nd TV Factory Information
		// Factory Name: TVXYZ
		// openHour: 9 AM, closeHour: 6 PM
		TVFactory TVXYZ = new TVFactory("TVXYZ", 9, 18);

		FactoryExample ex = new FactoryExample();
		// �� ���� ���α���°��� ���� �Ϸ� ���귮�� ��Ʈ�� �� ���� �� �߰� ���귮�� �˾ƺ���  
		ex.getResult(CarABC, 'A', CarXYZ);
		ex.getResult(CarXYZ, 'B', CarABC);
		ex.getResult(TVABC, 'A', TVXYZ);
		ex.getResult(TVXYZ, 'B', TVABC);

	}

	public void getResult(Factory mainFactory, char mainFactorySkill, IWorkingTogether partner) {
		
		System.out.println("* " + mainFactory.getFactoryName() + " ������ �Ϸ� ���귮�� ��Ʈ�� ���� ���� �� �߰� ���귮�� ������ ����.");
		// TODO
		System.out.println("1. �Ϸ� ���귮 = "+mainFactory.makeProducts(mainFactorySkill));
		if(mainFactory instanceof CarFactory){
			CarFactory parFactory = (CarFactory) mainFactory;
			System.out.println("2. ��Ʈ�� ���� ["+((Factory)partner).getFactoryName()+"] ���� �� �߰� ���귮 = "+parFactory.workTogether(partner));
		}else if(mainFactory instanceof TVFactory){
			TVFactory parFactory = (TVFactory) mainFactory;
			System.out.println("2. ��Ʈ�� ���� ["+((Factory)partner).getFactoryName()+"] ���� �� �߰� ���귮 = "+parFactory.workTogether(partner));
		}

		System.out.println("--------------------------------------------------------------");
	}

}

package oopsdemo;

public class TestRemote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SonyTV sonyTV = new SonyTV();
		System.out.println("Sony TV");
		IUniversalRemote iRemote = new SonyTV();
		iRemote.SwitcOn();
		iRemote.changeChannel("Sports 18");
		iRemote.changeVolume(15);
		iRemote.SwitcOff();
		System.out.println("Android TV");
		iRemote = new AndroidTV();
		iRemote.SwitcOn();
		iRemote.changeChannel("SonyMAX");
		iRemote.changeVolume(15);
		iRemote.SwitcOff();
		
		

	}

}

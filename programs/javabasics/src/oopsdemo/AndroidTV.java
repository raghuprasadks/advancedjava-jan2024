package oopsdemo;

public class AndroidTV implements IUniversalRemote{

	String currentChannel="";
	int volume=0;
	
	@Override
	public void SwitcOn() {
		// TODO Auto-generated method stub
		System.out.println("AndroidTV is Switched on");
		
	}

	@Override
	public void SwitcOff() {
		// TODO Auto-generated method stub
		System.out.println("AndroidTV is Switched off");
		
	}

	@Override
	public void changeChannel(String channel) {
		// TODO Auto-generated method stub
		this.currentChannel=channel;
		System.out.println("AndroidTV:Current Channel  is "+this.currentChannel);
	}

	@Override
	public void changeVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume = volume;
		System.out.println("AndroidTV:Current volume  is "+this.volume);
	}

}

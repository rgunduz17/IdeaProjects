package day53_InterfaceContinue;

public class Tesla_Model3 implements Cars, ElectricVehicles {

	@Override
	public void start() {
		System.out.println("Voice Conttol \"Tesla Start   \" ");
	}

	@Override
	public void Charge() {
		System.out.println("Charging");
	}

	@Override
	public void SelfDrive() {
		System.out.println("Self Driving mode");
	}

	@Override
	public void Fly() {
		System.out.println("Tesla is flying");
	}

}

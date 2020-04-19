package day53_InterfaceContinue;

public class Toyota_Hybrid implements Cars, ElectricVehicles, GasVehicles{

	@Override
	public void PumpGas() {
		System.out.println("Pumping Gas");
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
    public void start() {
        System.out.println("push start button");
    }
	
	@Override
	public void Fly() {
		System.out.println("Toyota is flying");
	}

	@Override
	public void SelfParking() {
		System.out.println("Self parking mode");
	}

}

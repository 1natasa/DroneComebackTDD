package drone;

public class Drone implements StandardDrone{
	
	private int [] startCoordinates;
	private int [] boundaries;
	public Drone()
	{
		
	}
	
	public Drone(int [] startCoordinates, int [] boundaries )
	{
		this.startCoordinates=startCoordinates;
		this.boundaries=boundaries;
	}

	@Override
	public String moveUp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveDown() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveLeft() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveRight() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveBack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String moveForth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFormatedCoordinates() {
		// TODO Auto-generated method stub
		return null;
	}

}

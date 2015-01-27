package test;

import java.awt.Point;

import world.Robot;

/**
 * You need to extend the Robot class to make your own robot!
 * */
public class MyRobotClass extends Robot{

	/**
	 * You will need to override and implement the travelToDestination() method.
	 * This method will be your path finding.
	 * */
	@Override
	public void travelToDestination() {
		
		/* You can call pingMap if you want to see a part of the map */
		super.pingMap(new Point(5,3));
		
		/* You can call move to move your robot to a new location */
		super.move(new Point(3,7));
	}

	
}

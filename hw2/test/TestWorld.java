package test;

import world.World;

public class TestWorld {

	
	public static void main(String[] args){
		
		try{
			/* Create a world. Pass the input filename first. Second parameter... */
			/* ...is whether or not the world is uncertain.*/
			World myWorld = new World("myInputFile.txt", false);
			
			/* Create a robot that will run around in the World */
			MyRobotClass myRobot = new MyRobotClass();
			myRobot.addToWorld(myWorld);
			
			
			/* Tell the robot to travel to the destination */
			/* you will be implementing this method yourself! */
			myRobot.travelToDestination();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

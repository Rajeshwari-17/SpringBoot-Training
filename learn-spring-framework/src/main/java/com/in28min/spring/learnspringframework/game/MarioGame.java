
package com.in28min.spring.learnspringframework.game;

import com.in28min.spring.learnspringframework.GamingConsole;

public class MarioGame implements GamingConsole {
	public void up()
	{
		System.out.println("up");
	}
     public void down()
     {
    	 System.out.println("Down");
     }
     public void left()
     {
    	 System.out.println("left");
     }
     public void right()
     {
    	 System.out.println("right");
     }
}
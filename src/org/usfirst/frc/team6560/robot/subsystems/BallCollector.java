package org.usfirst.frc.team6560.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6560.robot.RobotMap.Can;

import com.ctre.CANTalon;

/**
 *
 */
public class BallCollector extends Subsystem {

    CANTalon intakeMotor = new CANTalon(Can.INTAKE);
    
    public void stopIntake() {
    	intakeMotor.set(0);
    }
    
    public void intakeBall() {
    	intakeMotor.set(0.8);
    }
    
    public void intakeBall(double magnitude) {
    	intakeMotor.set(magnitude);
    }
    
    public void dumpBall() {
    	intakeMotor.set(-0.2);
    }
    
    public void dumpBall(double magnitude) {
    	intakeMotor.set(-1*magnitude);
    }

    public void initDefaultCommand() {
        
    }
}


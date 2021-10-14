package frc.robot.Spinsor;

import frc.robot.OI;
import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.CommandBase;

public class SpecialFunctions extends CommandBase {
    public SpecialFunctions() {
        requires(spinnerSubsystem);
        // requires(colorSensorSubsystem);

        if (RobotMap.debug) {
            // System.out.println("Spinsor init");
        }
    }

    // Makes a controller called Spinsor that is equal to a controller defined in OI
    // File
    private static XboxController spinsor = OI.specialController;

    // Declare speed variables as true or false
    public boolean spinnerRight;

    // Set color sensor printing on or off
    public boolean sensorOn;
    public boolean sensorOff;

    @Override
    protected void execute() {
        // checkSensor();
        motorSpinnerCode();
    }

    // public void checkSensor()
    // {
    // //if X button is pressed, transmit color data from sensor to laptop
    // if (sensorOn)
    // {
    // System.out.println("Starting transmission of Color Data.");
    // colorSensorSubsystem.printColor();
    // }

    // if B button is pressed, stop transmitting color data from sensor
    // else if (sensorOff)
    // {
    // //System.out.println("Finished Transmitting, Press X to start again.");
    // }
    // else
    // {
    // // System.out.println("Sensor Not Activated");
    // }

    // }

    public void motorSpinnerCode() {
        // when a or b button is held down, motor is activated
        if (spinsor.getAButton()) {
            spinnerSubsystem.setMotors(1, RobotMap.spinnerSafetySpeedMod);
        } else if (spinsor.getBButton()) {
            spinnerSubsystem.setMotors(-1, RobotMap.spinnerSafetySpeedMod);
        } else {
            spinnerSubsystem.setMotors(0, RobotMap.spinnerSafetySpeedMod);
        }
    }

    public void motorClimberCode() {
        // when either x or y is held down, motor is activated
        if (spinsor.getXButton()) {
            climberSubsystem.setMotors(1, RobotMap.climberSafetySpeedMod);
        } else if (spinsor.getYButton()) {
            climberSubsystem.setMotors(-1, RobotMap.climberSafetySpeedMod);
        } else {
            climberSubsystem.setMotors(0, RobotMap.climberSafetySpeedMod);
        }
    }

    @Override
    protected boolean isFinished() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void end() {

    }
}
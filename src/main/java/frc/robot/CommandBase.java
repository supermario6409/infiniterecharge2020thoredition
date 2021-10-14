package frc.robot;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.DriveTrain.*;
import frc.robot.Spinsor.*;

public abstract class CommandBase extends Command {

    /// This is a hub for Subsystem Initializations ///

    public static DriveTrainSubsystem driveSubsystem;
    // public static ColorSensorSubsystem colorSensorSubsystem;
    public static SpinnerMotorSubsystem spinnerSubsystem;
    public static climberMotorSubsystem climberSubsystem;

    public static void init() {
        // colorSensorSubsystem = new ColorSensorSubsystem();
        spinnerSubsystem = new SpinnerMotorSubsystem();
        driveSubsystem = new DriveTrainSubsystem();
        climberSubsystem = new climberMotorSubsystem();

    }

}
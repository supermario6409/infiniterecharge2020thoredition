package frc.robot.Spinsor;

import frc.robot.OI;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
// sets up motor speed, will be on or off.
// debug at end

public class climberMotorSubsystem extends Subsystem {

    // set up motors//
    public TalonSRX climberMotorLeader = new TalonSRX(RobotMap.climberMotorLeader);
    public TalonSRX climberMotorFollower1 = new TalonSRX(RobotMap.climberMotorFollower1);
    public TalonSRX climberMotorFollower2 = new TalonSRX(RobotMap.climberMotorFollower2);

    public void setMotors(final double speed, double climberSafetySpeedMod) {

        climberMotorLeader.set(ControlMode.PercentOutput, speed);
        climberMotorFollower1.set(ControlMode.PercentOutput, speed);
        climberMotorFollower2.set(ControlMode.PercentOutput, speed);

        // DEBUG CODE//
        if (RobotMap.driveDebug) {
            System.out.println("Climber Speed : " + speed);
        }
    }

    public static double configSpeed(final double speed, final double speedMod) {
        final double returnVar;

        returnVar = speed * speedMod;

        /// DEBUG CODE ///
        if (RobotMap.driveDebug) {
            System.out.println("Error in configSpeed");
            /// Return 0 ///
            return 0;
        }
        return returnVar;
    }

    @Override
    protected void initDefaultCommand() {
        // TODO Auto-generated method stub
    }
}
package frc.robot.Subsystems;
import frc.lib.core.motors.TeamSparkMAX;
import frc.robot.constants.Ports;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase
{
	public TeamSparkMAX lMotor;
	public TeamSparkMAX rMotor;
	private static double voltage = 12;
	public ShooterSubsystem()
	{
		lMotor = new TeamSparkMAX("Left Motor", Ports.LEFT_SHOOTER_MOTOR);
		rMotor = new TeamSparkMAX("Right Motor", Ports.RIGHT_SHOOTER_MOTOR);

		rMotor.follow(lMotor,true);
		lMotor.setInverted(true);
		rMotor.enableVoltageCompensation(voltage);
		lMotor.enableVoltageCompensation(voltage);
	}


}

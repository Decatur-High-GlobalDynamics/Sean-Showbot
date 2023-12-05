package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Subsystems.ShooterSubsystem;

public class ShootCommand extends CommandBase
{
	private ShooterSubsystem shooter;

	public ShootCommand(ShooterSubsystem shooter)
	{
		this.shooter = shooter;

		addRequirements(shooter);
		// constructor

	}

	public void execution()
	{
		shooter.setMotorPower(1, "shoot_button_down");
	}

	public void end()
	{
		shooter.setMotorPower(0, "shoot_button_release");

	}

}
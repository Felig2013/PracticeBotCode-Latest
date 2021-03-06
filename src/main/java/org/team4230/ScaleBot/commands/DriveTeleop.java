package org.team4230.ScaleBot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.team4230.ScaleBot.Robot;

public class DriveTeleop extends Command {


    public DriveTeleop() {
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
        Robot.driveTrain.drive(Robot.oi.getDriveSpeed(), Robot.oi.getDriveRot(), Robot.oi.getDriveMod());
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    }
}

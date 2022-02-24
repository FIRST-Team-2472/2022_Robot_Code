package frc.robot.ActionQueue.Actions.Misc;

import frc.robot.Robot;
import frc.robot.ActionQueue.Runners.TimerBase;

public class ShootBall extends TimerBase
{

    public ShootBall(double seconds)
    {
        super(seconds);

    }

    @Override
    public void startAction()
    {
        super.startAction();
        Robot.shooter.runFlyWheelPower(1);
        Robot.intake.runConveyorPower(.5);
    }

    @Override
    public void periodic()
    {
        
    }

    @Override
    public void endAction()
    {
        Robot.intake.runConveyorPower(0);
        Robot.shooter.runFlyWheelPower(0);
    }
}
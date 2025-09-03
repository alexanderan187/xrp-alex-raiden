package frc.auton;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.XRPDrivetrain;

public class Auton {
    public static Command driveForward(XRPDrivetrain xrpDrivetrain) {
        return Commands.race(
            Commands.run(() -> xrpDrivetrain.tankDrive(1, 1), xrpDrivetrain),
            Commands.waitSeconds(2)
        );
    }
}

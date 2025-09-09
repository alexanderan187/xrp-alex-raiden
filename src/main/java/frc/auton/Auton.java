package frc.auton;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.XRPDrivetrain;

public class Auton {
    public static Command driveForward(XRPDrivetrain xrpDrivetrain, double seconds) {
        return Commands.race(
            Commands.run(() -> xrpDrivetrain.tankDrive(0.75, 0.75), xrpDrivetrain),
            Commands.waitSeconds(seconds)
        );
    }
    public static Command driveBackward(XRPDrivetrain xrpDrivetrain, double seconds) {
        return Commands.race(
            Commands.run(() -> xrpDrivetrain.tankDrive(-0.75, -0.75), xrpDrivetrain),
            Commands.waitSeconds(seconds)
        );
    }
    public static Command turnLeft90(XRPDrivetrain xrpDrivetrain) {
        return Commands.race(
            Commands.run(() -> xrpDrivetrain.tankDrive(-0.5, 0.5), xrpDrivetrain),
            Commands.waitSeconds(1.18) // Time it runs for
        );
    }
    public static Command turnRight90(XRPDrivetrain xrpDrivetrain) {
        return Commands.race(
            Commands.run(() -> xrpDrivetrain.tankDrive(0.5, -0.5), xrpDrivetrain),
            Commands.waitSeconds(1.28)
        );
    }
    public static Command resetMotors(XRPDrivetrain xrpDrivetrain) {
        return Commands.race(
            Commands.run(() -> xrpDrivetrain.tankDrive(0, 0), xrpDrivetrain),
            Commands.waitSeconds(0.5)
        );
    }
}

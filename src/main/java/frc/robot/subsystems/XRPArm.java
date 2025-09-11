package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.xrp.XRPServo;

public class XRPArm extends SubsystemBase {
    private final XRPServo m_armServo = new XRPServo(4);
    
    public XRPArm() {}

    public double getAngle() {
        return m_armServo.getAngle();
    }

    public void setAngle(double angle) {
        m_armServo.setAngle(angle);
    }

    public void rotate(double degrees) {
        m_armServo.setAngle(m_armServo.getAngle() + degrees);
    }

    public void triggerMoveArm(XRPArm xrpArm, boolean moveDown, boolean moveUp) {
        if (moveDown == moveUp) {
            ; // Do nothing
        }
        if (moveDown == true) {
            xrpArm.rotate(-5);
        } else if (moveUp == true) {
            xrpArm.rotate(5);
        }
    }
}

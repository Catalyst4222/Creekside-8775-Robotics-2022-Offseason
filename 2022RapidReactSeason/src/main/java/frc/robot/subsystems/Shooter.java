package frc.robot.subsystems;

import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//Sensor data management will be added once we recive the pigeon order.
public class Shooter extends SubsystemBase {
  //Robot objects
  private CANSparkMax flywheelMotor;
  private double multiplier;

  public Shooter(double multiplier) {
    this.flywheelMotor = new CANSparkMax(Constants.flywheel, MotorType.kBrushless);
    this.multiplier = multiplier;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setRPM(double speed){
    this.flywheelMotor.set(this.multiplier * speed);
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
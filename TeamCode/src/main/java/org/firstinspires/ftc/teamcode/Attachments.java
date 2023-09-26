package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.acmerobotics.dashboard.FtcDashboard;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class Attachments extends SampleMecanumDrive {

    private Telemetry telemetry;
    private ElapsedTime runtime = new ElapsedTime();

    public Servo clawServo, clawArmServo, planeServo;
    public DcMotorEx liftMotor, hangMotor;
    public WebcamName webcam;

    public void initialize(HardwareMap hardwareMap, Telemetry telemetry_) {

        // Random Stuff IDK
        telemetry = telemetry_;
        FtcDashboard dashboard = FtcDashboard.getInstance();


        // Initialize Roadrunner
        initializeRoadrunner(hardwareMap);

        telemetry.addLine("Roadrunner Initialized");
        telemetry.update();


        // Motors
        liftMotor = hardwareMap.get(DcMotorEx.class, names.liftMotor);
        hangMotor = hardwareMap.get(DcMotorEx.class, names.hangMotor);

        telemetry.addLine("Motors Initialized");
        telemetry.update();


        // Servos
        clawServo = hardwareMap.get(Servo.class, names.clawServo);
        clawArmServo = hardwareMap.get(Servo.class, names.clawArmServo);
        planeServo = hardwareMap.get(Servo.class, names.planeServo);

        telemetry.addLine("Servos Initialized");
        telemetry.update();


        // Camera
        webcam = hardwareMap.get(WebcamName.class, names.webcam);

        telemetry.addLine("Camera Initialized");
        telemetry.update();

    }

    // Run Motors
    public void runLiftMotor(double power) {
        liftMotor.setPower(power);
    }
    public void runHangMotor(double power) {
        hangMotor.setPower(power);
    }

    // Set Motors
    public void setLiftMotor(double power, int position) {
        liftMotor.setPower(power);
        liftMotor.setTargetPosition(position);
        liftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void setHangMotor(double power, int position) {
        hangMotor.setPower(power);
        hangMotor.setTargetPosition(position);
        hangMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }


    // Set Servos
    public void setClawServo (double position) {clawServo.setPosition(position);}
    public void setClawArmServo (double position) {clawArmServo.setPosition(position);}
    public void setPlaneServo (double position) {planeServo.setPosition(position);}


    // Get Motor Positions
    public int getLiftMotorPosition() {
        return liftMotor.getCurrentPosition();
    }
    public int getHangMotorPosition() {
        return hangMotor.getCurrentPosition();
    }

    // Get Servo Positions
    public double getClawPosition() {
        return clawServo.getPosition();
    }
    public double getClawArmPosition() {
        return clawArmServo.getPosition();
    }
    public double getPlanePosition() {
        return planeServo.getPosition();
    }


}

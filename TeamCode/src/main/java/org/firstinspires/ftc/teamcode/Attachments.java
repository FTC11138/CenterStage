package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import com.acmerobotics.dashboard.FtcDashboard;
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


//        // Motors
//        liftMotor = hardwareMap.get(DcMotorEx.class, names.liftMotor);
//        hangMotor = hardwareMap.get(DcMotorEx.class, names.hangMotor);
//
//        telemetry.addLine("Motors Initialized");
//        telemetry.update();
//
//
//        // Servos
//        clawServo = hardwareMap.get(Servo.class, names.clawServo);
//        clawArmServo = hardwareMap.get(Servo.class, names.clawArmServo);
//        planeServo = hardwareMap.get(Servo.class, names.planeServo);
//
//        telemetry.addLine("Servos Initialized");
//        telemetry.update();
//
//
//        // Camera
//        webcam = hardwareMap.get(WebcamName.class, names.webcam);
//
//        telemetry.addLine("Camera Initialized");
//        telemetry.update();

    }
}

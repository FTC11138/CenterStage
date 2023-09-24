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

        initializeRoadrunner(hardwareMap);
        // Random Stuff IDK
        telemetry = telemetry_;
        FtcDashboard dashboard = FtcDashboard.getInstance();

        // Motors
        liftMotor = hardwareMap.get(DcMotorEx.class, names.liftMotor);
        hangMotor = hardwareMap.get(DcMotorEx.class, names.hangMotor);

        // Servos
        clawServo = hardwareMap.get(Servo.class, names.clawServo);
        clawArmServo = hardwareMap.get(Servo.class, names.clawArmServo);
        planeServo = hardwareMap.get(Servo.class, names.planeServo);

        webcam = hardwareMap.get(WebcamName.class, names.webcam);
    }
}

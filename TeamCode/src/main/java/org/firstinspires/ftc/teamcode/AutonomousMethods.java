package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.vision.VisionPortal;

public abstract class AutonomousMethods extends LinearOpMode {


    public Attachments robot = new Attachments();

    FtcDashboard dashboard = FtcDashboard.getInstance();
    private Orientation angles;
    public ElapsedTime runtime = new ElapsedTime();




    public boolean opModeStatus() {
        return opModeIsActive();
    }

    public void initializeRobot(HardwareMap hardwareMap, Telemetry telemetry) {

        robot.initialize(hardwareMap, telemetry, true);

    }


}

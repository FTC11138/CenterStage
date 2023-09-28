package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;

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

    public static class redLeft {
        public static Pose2d start = new Pose2d(-36, -63, Math.toRadians(90));
        public static Vector2d right = new Vector2d(-24, -3);
        public static Vector2d center = new Vector2d(-36, -2);
        public static Vector2d left = new Vector2d(-48, -3);

        public static double spikeMarkAngle = Math.toRadians(90);

        public static Pose2d backdrop = new Pose2d(48, -36, Math.toRadians(0));
        public static Pose2d parkRight = new Pose2d(60, -60, Math.toRadians(0));
        public static Pose2d parkLeft = new Pose2d(60, -12, Math.toRadians(0));
    }

    public void dropPixel(int propLocation, String startPosition) {
        Trajectory spikeMarkTraj = null;

        Pose2d startPose = null;
        Vector2d pixelVector = null;
        double pixelAngle = 0;


        if (startPosition == "redLeft") {
            startPose = PoseConstants.redLeft.start;
            pixelVector = (propLocation == 1) ? PoseConstants.redLeft.left : ((propLocation == 2) ? PoseConstants.redLeft.center : PoseConstants.redLeft.right);
            pixelAngle = PoseConstants.redLeft.spikeMarkAngle;
        } else if (startPosition == "redRight") {
            startPose = PoseConstants.redRight.start;
            pixelVector = (propLocation == 1) ? PoseConstants.redRight.left : ( (propLocation == 2) ? PoseConstants.redRight.center : PoseConstants.redRight.right);
            pixelAngle = PoseConstants.redRight.spikeMarkAngle;
        } else if (startPosition == "blueLeft") {
            startPose = PoseConstants.blueLeft.start;
            pixelVector = (propLocation == 1) ? PoseConstants.blueLeft.left : ( (propLocation == 2) ? PoseConstants.blueLeft.center : PoseConstants.blueLeft.right);
            pixelAngle = PoseConstants.blueLeft.spikeMarkAngle;
        } else if (startPosition == "blueRight") {
            startPose = PoseConstants.blueRight.start;
            pixelVector = (propLocation == 1) ? PoseConstants.blueRight.left : ( (propLocation == 2) ? PoseConstants.blueRight.center : PoseConstants.blueRight.right);
            pixelAngle = PoseConstants.blueRight.spikeMarkAngle;
        }

        spikeMarkTraj = robot.trajectoryBuilder(startPose)
                .splineTo(pixelVector, pixelAngle)
                .build();

        
        robot.followTrajectory(spikeMarkTraj);

    }


}

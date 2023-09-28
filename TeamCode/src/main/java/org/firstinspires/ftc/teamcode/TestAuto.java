package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.trajectory.constraints.AngularVelocityConstraint;
import com.acmerobotics.roadrunner.trajectory.constraints.MinVelocityConstraint;
import com.acmerobotics.roadrunner.trajectory.constraints.TrajectoryVelocityConstraint;
import com.acmerobotics.roadrunner.trajectory.constraints.TranslationalVelocityConstraint;

import org.firstinspires.ftc.teamcode.AutonomousMethods;
import org.firstinspires.ftc.teamcode.drive.DriveConstants;

import java.util.Arrays;

public class TestAuto extends AutonomousMethods {
    @Override
    public void runOpMode() throws InterruptedException {

        /* -------------------------------------------- INIT -------------------------------------------- */
        int propLocation;

        Pose2d startPose = new Pose2d(-36, -60, Math.toRadians(90));
        Pose2d backBoardPose = new Pose2d(40, -36, Math.toRadians(0));

        TrajectoryVelocityConstraint splineVelConstraint = new MinVelocityConstraint(Arrays.asList(
                new TranslationalVelocityConstraint(Constants.slowerSplineVel),
                new AngularVelocityConstraint(16)
        ));



        // Wait for start button to be pressed
        while (!isStarted()) {
            propLocation = robot.getPropLocation();
            telemetry.addLine("Location: " + propLocation);
            telemetry.update();
        }

        /* -------------------------------------------- START -------------------------------------------- */

        propLocation = robot.getPropLocation();
        telemetry.addLine("Location: " + propLocation);
        telemetry.update();

        dropPixel(propLocation, "redLeft");


    }
}

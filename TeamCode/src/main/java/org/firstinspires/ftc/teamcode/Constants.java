package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;

@Config
public class Constants {

    /* -------------------------------------------- DRIVE CONSTANTS -------------------------------------------- */

    public static double moveSpeed = 1;
    public static double rotSpeed = 1;


    public static double slowerMoveVel = 10;
    public static double slowerSplineVel = 30;


    /* -------------------------------------------- POSE CONSTANTS -------------------------------------------- */

    // Start Poses
    public static Pose2d redLeft_start = new Pose2d(-36, -63, Math.toRadians(90));
    public static Pose2d redRight_start = new Pose2d(12, -63, Math.toRadians(90));
    public static Pose2d blueLeft_start = new Pose2d(12, 63, Math.toRadians(-90));
    public static Pose2d blueRight_start = new Pose2d(-36, 63, Math.toRadians(-90));


    // Spike Mark Poses
    public static Pose2d redLeft_right = new Pose2d(-24, -36, Math.toRadians(90));
    public static Pose2d redLeft_center = new Pose2d(-36, -24, Math.toRadians(90));
    public static Pose2d redLeft_left = new Pose2d(-48, -36, Math.toRadians(90));

    public static Pose2d redRight_right = new Pose2d(24, -36, Math.toRadians(90));
    public static Pose2d redRight_center = new Pose2d(36, -24, Math.toRadians(90));
    public static Pose2d redRight_left = new Pose2d(48, -36, Math.toRadians(90));

    public static Pose2d blueLeft_right = new Pose2d(24, 36, Math.toRadians(-90));
    public static Pose2d blueLeft_center = new Pose2d(36, 24, Math.toRadians(-90));
    public static Pose2d blueLeft_left = new Pose2d(48, 36, Math.toRadians(-90));

    public static Pose2d blueRight_right = new Pose2d(-24, 36, Math.toRadians(-90));
    public static Pose2d blueRight_center = new Pose2d(-36, 24, Math.toRadians(-90));
    public static Pose2d blueRight_left = new Pose2d(-48, 36, Math.toRadians(-90));

    // Backdrop poses
    public static Pose2d redBackdrop = new Pose2d(48, -36, Math.toRadians(0));
    public static Pose2d blueBackdrop = new Pose2d(48, 36, Math.toRadians(0));

    // Park Poses
    public static Pose2d redPark_right = new Pose2d(60, -60, Math.toRadians(0));
    public static Pose2d redPark_left = new Pose2d(60, -12, Math.toRadians(0));

    public static Pose2d bluePark_left = new Pose2d(60, 60, Math.toRadians(0));
    public static Pose2d bluePark_right = new Pose2d(60, 12, Math.toRadians(0));




    /* -------------------------------------------- VISION CONSTANTS -------------------------------------------- */

    public static int rLx = 5;
    public static int rLy = 320;
    public static int rLw = 100;
    public static int rLh = 80;

    public static int rRx = 500;
    public static int rRy = 330;
    public static int rRw = 135;
    public static int rRh = 80;

    public static int rMx = 140;
    public static int rMy = 300;
    public static int rMw = 300;
    public static int rMh = 50;

}

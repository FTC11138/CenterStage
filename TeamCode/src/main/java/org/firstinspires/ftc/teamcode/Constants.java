package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;

@Config
public class Constants {

    /* -------------------------------------------- DRIVE CONSTANTS -------------------------------------------- */

    public static double moveSpeed = 1;
    public static double rotSpeed = 1;


    public static double slowerMoveVel = 10;
    public static double slowerSplineVel = 30;


    /* -------------------------------------------- SERVO CONSTANTS -------------------------------------------- */

    // TODO: Tune Values

    public static double pixelHold = 1;
    public static double pixelDrop = 0;

    public static double clawClose = 1;
    public static double clawOpen = 0;

    public static double clawArmDown = 0;
    public static double clawArmUp = 1;
    public static double clawArmSpeed = 0.05;

    public static double planeHold = 1;
    public static double planeRelease = 0;


    /* -------------------------------------------- MOTOR CONSTANTS -------------------------------------------- */


    public static int liftMin = 0;
    public static int liftLow = 0;
    public static int liftMed = 500;
    public static int liftHigh = 1000;
    public static int liftMax = 1000;

    public static double liftUpRatio = 1;
    public static double liftDownRatio = 0.8;
    public static int liftSlow = 100;
    public static double liftSlowRatio = 0.4;

    public static int liftTolerance = 15;
    public static int liftkPTele = 10;
    public static double liftkP = 0.005; // 10
    public static double liftkI = 0;
    public static double liftkD = 0.001;
    public static double liftkF = 0.25;
    public static double liftMinPow = 0.1;




    public static int hangMin = 0;
    public static int hangLow = 0;
    public static int hangHigh = 1000;
    public static int hangMax = 1000;

    public static double hangUpRatio = 1;
    public static double hangDownRatio = 0.8;
    public static int hangSlow = 100;
    public static double hangSlowRatio = 0.4;

    public static int hangTolerance = 15;
    public static int hangkPTele = 10;
    public static double hangkP = 0.005; // 10
    public static double hangkI = 0;
    public static double hangkD = 0.001;
    public static double hangkF = 0.25;
    public static double hangMinPow = 0.1;


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

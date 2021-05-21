package com.uwjx.springfunction.service;

import com.uwjx.springfunction.domain.CoordinatePoint;
import com.uwjx.springfunction.util.CoordinateUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class CoordinateService {

    public static void main(String[] args) {
        Map [] map=new Map[]{};
//        CoordinatePoint[] ps = new CoordinatePoint[] {
//                new CoordinatePoint(114.309914,30.599556),//114.309914,30.599556
//                new CoordinatePoint(114.295688,30.592879),//114.295688,30.592879
//                new CoordinatePoint(114.292812,30.587726), //114.292812,30.587726
//                new CoordinatePoint(114.292812,30.587726), //114.292812,30.587726
//                new CoordinatePoint(114.30058,30.580318),//114.30058,30.580318
//                new CoordinatePoint(114.303606,30.586959),//114.303606,30.586959
//                new CoordinatePoint(114.304534,30.594751),//114.304534,30.594751
//                new CoordinatePoint(114.30838,30.590131),//114.30838,30.590131
//                new CoordinatePoint(114.308651,30.584182),//114.308651,30.584182
//                new CoordinatePoint(114.304495,30.584015),//114.304495,30.584015
//                new CoordinatePoint(114.301301,30.578759),//114.301301,30.578759
//                new CoordinatePoint(114.309437,30.578528),//114.309437,30.578528
//                new CoordinatePoint(114.323282,30.592786)
//        };//114.323282,30.592786
        CoordinatePoint[] ps = new CoordinatePoint[] {
                new CoordinatePoint(120.134839,30.252566),//114.309914,30.599556
                new CoordinatePoint(120.155954,30.262426),//114.295688,30.592879
                new CoordinatePoint(120.170803,30.24226), //114.292812,30.587726
                new CoordinatePoint(120.13853,30.222386), //114.292812,30.587726
                new CoordinatePoint(120.120592,30.237069)
        };



        CoordinatePoint n1 = new CoordinatePoint(120.099906,30.239145);
        CoordinatePoint n2 = new CoordinatePoint(120.152778,30.248859);
        CoordinatePoint n3 = new CoordinatePoint(120.151576,30.235438);//在
        CoordinatePoint y1 = new CoordinatePoint(120.166254,30.226168);//不在
        CoordinatePoint y2 = new CoordinatePoint(120.13441,30.248636);//在
        CoordinatePoint y4 = new CoordinatePoint(120.205478,30.242186);//不在
        System.out.println( "n1:" + CoordinateUtil.isPtInPoly(n1.getX() , n1.getY() , ps));
        System.out.println( "n2:" + CoordinateUtil.isPtInPoly(n2.getX() , n2.getY() , ps));
        System.out.println( "n3:" + CoordinateUtil.isPtInPoly(n3.getX() , n3.getY() , ps));
        System.out.println( "y1:" + CoordinateUtil.isPtInPoly(y1.getX() , y1.getY() , ps));
        System.out.println( "y2:" + CoordinateUtil.isPtInPoly(y2.getX() , y2.getY() , ps));
        System.out.println( "y4:" + CoordinateUtil.isPtInPoly(y4.getX() , y4.getY() , ps));
    }
}

package com.uwjx.springfunction.util;

import com.uwjx.springfunction.domain.CoordinatePoint;

public class CoordinateUtil {

    private final static int RANGE_LIMIT = 3;

    public static boolean isPtInPoly(double longitude, double latitude, CoordinatePoint[] rangePoints) {
        if (rangePoints == null || rangePoints.length < RANGE_LIMIT) {
            //样本不足
            return false;
        }
        int iSum, iCount, iIndex;
        double dLon1 = 0, dLon2 = 0, dLat1 = 0, dLat2 = 0, dLon;

        iSum = 0;
        iCount = rangePoints.length;
        for (iIndex = 0; iIndex < iCount; iIndex++) {
            if (iIndex == iCount - 1) {
                dLon1 = rangePoints[iIndex].getX();
                dLat1 = rangePoints[iIndex].getY();
                dLon2 = rangePoints[0].getX();
                dLat2 = rangePoints[0].getY();
            } else {
                dLon1 = rangePoints[iIndex].getX();
                dLat1 = rangePoints[iIndex].getY();
                dLon2 = rangePoints[iIndex + 1].getX();
                dLat2 = rangePoints[iIndex + 1].getY();
            }
            if (((latitude >= dLat1) && (latitude < dLat2)) || ((latitude >= dLat2) && (latitude < dLat1))) {
                if (Math.abs(dLat1 - dLat2) > 0) {
                    dLon = dLon1 - ((dLon1 - dLon2) * (dLat1 - latitude)) / (dLat1 - dLat2);
                    if (dLon < longitude) {
                        iSum++;
                    }
                }
            }
        }
        if ((iSum % 2) != 0) {
            return true;
        }
        return false;
    }
}

package com.sf.tools;

/**
 * Created by Finltop on 2017/8/16.
 */

public class HttpTool {
    // public static String ecgUrl =
    // "http://192.168.1.110/FTGatewayServer/ECGWaveTransmit1";
    public static String ecgUrl = "http://121.42.253.245/FTGatewayServer/ECGWaveTransmit1";
    public static String gluUrl = "http://121.42.253.245/FTGatewayServer/GluTransmit1?";
    public static String nibpUrl = "http://121.42.253.245/FTGatewayServer/NibpTransmit1?";
    public static String spo2Url = "http://121.42.253.245/FTGatewayServer/Spo2Transmit1";
    public static String urineUrl = "http://121.42.253.245/FTGatewayServer/UrineTransmit1?";
    public static String bodyUrl = "http://121.42.253.245/FTGatewayServer/BodyTransmit1?";
    public static String bdfUrl = "http://121.42.253.245/FTGatewayServer/CholTransmit1?";
    public static String tempUrl = "http://121.42.253.245/FTGatewayServer/TempTransmit1?";

    public static String accUrl = "http://118.190.77.82/api/access_token?";
    public static String uInfoUrl = "http://118.190.77.82/api/getUserInfo?";
    public static String bindUel = "http://118.190.77.82/api/user/bindCard?";

    public static String doctorWebURL = "http://121.42.253.245/any-appserver/doctorList.html";

    public static String myWebURL = "http://121.42.253.245/any-appserver/user.jsp";

    // public static String mallWebURL =
    // "http://192.168.2.64:8080/any-appserver/myser.html";
    public static String mallWebURL = "http:/121.42.253.245/any-appserver/myser.html";

    public static String userHeadUPURL = "http://121.42.253.245/any-appserver/user/updatePortrait.do";
    public static String userHeaddownURL = "http://118.190.77.225:8080";

    // 健康学院URL
    public static String healthschoolURL = "http://121.42.253.245/HealthSchool/";
    public static String homeTokenURL = "http://118.190.77.82/api/access_token?client_id=100001&client_secret=34c24e41f2a1a0fc0f7ec160df714801";
    public static String getHealthScore = "http://118.190.77.82/api/user/userHealthyScore?";
    public static String getDoctorInfoH = "http://118.190.77.82/api/doctor/getDoctorInfoByServiceId?";
    public static String getDoctorInfo = "http://118.190.77.82/api/getUserInfo?user_id=89&access_token=07c939cbda39eeb19437615f3e6629c5";
    public static String getUserInfo = "http://118.190.77.82/api/getUserInfo?access_token="+"07c939cbda39eeb19437615f3e6629c5";
    public static String userStartServiceURL = "http://121.42.253.245/any-appserver/user/userStartService.do?";
    public static String getDiscussList = "http://118.190.77.82/api/user/getDiscussListByUserId?";
    public static String getUserReply = "http://118.190.77.82/api/user/userReply?";

    public static String getOrderInfo = "http://118.190.77.82/api/aliPay/order?";

}

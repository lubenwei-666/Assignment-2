package models;

import utils.Utilities;

public class SmartBand extends WearableDevice{
 private boolean hasHeartRateMonitor;
 public SmartBand(String modelName,double price,Manufacturer manufacturer,String id,String material,String size,boolean hasHeartRateMonitor)
 {
  super(modelName,price,manufacturer,id,material,size);
  this.hasHeartRateMonitor=hasHeartRateMonitor;
 }
 public double getInsurancePremium() {
     return Utilities.toTwoDecimalPlaces(getPrice() * 0.07);
 }
 public String connectToInternet() {
     return "Connecting to the internet via Companion App";
 }
 public boolean isHasHeartRateMonitor() {
     return hasHeartRateMonitor;
 }
 public void setHasHeartRateMonitor(boolean hasHeartRateMonitor) {
     this.hasHeartRateMonitor = hasHeartRateMonitor;
 }
@Override
public String toString() {
    // 调用父类的 toString 方法
    String parentToString = super.toString();
    
    // 心率监测器状态
    String heartRateStatus = hasHeartRateMonitor ? "Includes Heart Rate Monitor" : "No Heart Rate Monitor included";
    
    // 保险费用
    double insurancePremium = getInsurancePremium();
    
    // 网络连接信息
    String internetConnection = connectToInternet();
    
    // 拼接所有信息为单行字符串
    return parentToString + ", " + heartRateStatus + ", Insurance Premium: $" + insurancePremium + ", " + internetConnection;
}

}

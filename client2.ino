#include <OneWire.h>
#include <DallasTemperature.h>
#include <Wire.h>
#include <BH1750.h>
#include <SoftwareSerial.h>
#define ONE_WIRE_BUS 2
OneWire oneWire(ONE_WIRE_BUS);
DallasTemperature sensors(&oneWire);
BH1750 lightMeter(0x23);
SoftwareSerial mySerial(10, 11); // RX, TX
void setup(void)
{
  mySerial.begin(9600);
  sensors.begin();
  lightMeter.begin(BH1750_CONTINUOUS_HIGH_RES_MODE);
}

void loop(void)
{
  delay(6000);  
  sensors.requestTemperatures(); 
  Serial.println(sensors.getTempCByIndex(0));  
  uint16_t lux = lightMeter.readLightLevel();
  String data = "Temp2 : " + String(sensors.getTempCByIndex(0)) + " C " + " Light2 :" + String(lux) + " Lux ";
  delay(300);
  mySerial.println(data);
  delay(100);
}

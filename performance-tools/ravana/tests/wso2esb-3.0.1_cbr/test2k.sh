#!/bin/bash
mkdir ./tests/temp
mv ./scenario/wso2esb-3.0.0_cbr/message* ./tests/temp/
cp -f ./tests/temp/message2k.xml ./scenario/wso2esb-3.0.0_cbr/
mv ./conf/config.xml ./tests/temp
cp -f ./tests/wso2esb-3.0.0_cbr/config_2k.xml ./conf/config.xml
./Test.pl
mv ./tests/temp/config.xml ./conf
mv ./tests/temp/* ./scenario/wso2esb-3.0.0_cbr/
rm -rf tests/temp

<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>04-selected industry</name>
   <tag></tag>
   <elementGuidId>ce1d6b2a-7320-4f09-a852-8cd4f0a16877</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
         <value>//*[@data-testid = 'project_industry_${id}' and (text() = '${textid}' or . = '${textid}')]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-testid</name>
      <type>Main</type>
      <value>project_industry_${id}</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>${textid}</value>
   </webElementProperties>
</WebElementEntity>

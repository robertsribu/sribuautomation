<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>08-Select Subcategory</name>
   <tag></tag>
   <elementGuidId>2dbb5117-8e5f-454d-a194-8938760a779a</elementGuidId>
   <selectorCollection>
      <entry>
         <key>BASIC</key>
         <value>//*[@data-testid = 'subcategorySelected_${subcatid}' and (text() = '${subcat}' or . = '${subcat}')]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-testid</name>
      <type>Main</type>
      <value>subcategorySelected_${subcatid}</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>${subcat}</value>
   </webElementProperties>
</WebElementEntity>

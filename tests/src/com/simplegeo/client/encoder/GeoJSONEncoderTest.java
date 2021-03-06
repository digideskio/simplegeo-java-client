/**
 * Copyright 2010 SimpleGeo. All rights reserved.
 */
package com.simplegeo.client.encoder;


import java.util.List;

import junit.framework.TestCase;

import com.simplegeo.client.model.DefaultRecord;
import com.simplegeo.client.model.GeoJSONRecord;
import com.simplegeo.client.test.TestEnvironment;
import com.simplegeo.client.utilities.ModelHelper;

/**
 * @author Derek Smith
 *
 */
public class GeoJSONEncoderTest extends TestCase {

	public void testRecordToGeoJSON() throws Exception {
		
		String layer = TestEnvironment.getLayer();
		DefaultRecord record = ModelHelper.getRandomDefaultRecord(layer);
		record.getProperties().put("name", "derek");
		
		GeoJSONRecord jsonRecord = GeoJSONEncoder.getGeoJSONRecord(record);
		assertNotNull(String.format("GeoJSON record %s should not be null", jsonRecord.toString()), jsonRecord);
		assertTrue(String.format("Record %s does not equal %s", record, jsonRecord), ModelHelper.equals(record, jsonRecord));

		jsonRecord = (GeoJSONRecord)GeoJSONEncoder.getGeoJSONRecord((DefaultRecord)null);
		assertNull(String.format("GeoJSON record %s should be null", jsonRecord), jsonRecord);
	}
	
	public void testGeoJSONToRecord() throws Exception {
		String layer = TestEnvironment.getLayer();

		GeoJSONRecord jsonRecord = ModelHelper.getRandomGeoJSONRecord(layer);
		jsonRecord.setObjectProperty("name", "derek");
				
		DefaultRecord record = GeoJSONEncoder.getRecord(jsonRecord);
		assertNotNull(record);
		assertTrue(ModelHelper.equals(record, jsonRecord));
		
		record = GeoJSONEncoder.getRecord(null);
		assertNull(record);
		
	}
	
	public void testMultiGeoJSONToRecords() throws Exception {
		
		String layer = TestEnvironment.getLayer();

		GeoJSONRecord bigGeoJSONRecord = ModelHelper.getRandomGeoJSONRecordList(layer, 10);
		List<DefaultRecord> defaultRecords = GeoJSONEncoder.getRecords(bigGeoJSONRecord);
		
	}
	
	public void testMultiRecordsToGeoJSON() {
		
		
	}

}

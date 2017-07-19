package trhod17.randomlyassorteditems.util;

import org.apache.logging.log4j.Logger;

import trhod17.randomlyassorteditems.Reference;

import org.apache.logging.log4j.LogManager;

public class Utils {

	
	private static Logger logger;
	
	public static Logger getLogger() {
		if(logger == null) {
			logger = LogManager.getFormatterLogger(Reference.MODID);
		}
		return logger;
	}
	
}

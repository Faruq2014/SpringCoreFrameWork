package com.molla.CommonInterfaceDI;

public class ServiceProvider {
Services service;

public void setService(Services service) {
	this.service = service;
}

public void activeServices() {
	service.name();
	service.calling();
	service.data();
	service.texting();
	service.picture();
}
}

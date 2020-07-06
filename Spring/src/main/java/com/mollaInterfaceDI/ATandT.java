package com.mollaInterfaceDI;

public class ATandT {
private Services service;

public void setService(Services service) {
	this.service = service;
}

public void activeService() {
	service.callService();	
}
}

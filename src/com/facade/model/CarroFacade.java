package com.facade.model;

public class CarroFacade {

	private Acelerador acelerador;
	private Freio freio;
	private Marcha marcha;

	public CarroFacade(Acelerador acelerador, Freio freio, Marcha marcha) {
		this.acelerador = acelerador;
		this.freio = freio;
		this.marcha = marcha;
	}

	public void ligarCarro() {
		marcha.engatarMarcha();
		acelerador.acelerar();
		marcha.mudarMarcha();
		acelerador.desacelerar();
		marcha.reduzirMarcha();
		freio.freiar();
	}
	
}
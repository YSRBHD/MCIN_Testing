package com.mcin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcin.qa.pages.SolicitudReconocimientoPage;

public class SolicitudReconocimientoPageTest extends SolicitudReconocimientoPage {
	@BeforeMethod
	public void setUp() {
		initialization();
		authentication();
		clickOnButtonReconocimiento();
	}

	@Test(priority = 1)
	public void reconocimientoSolicitanteTest() {
		fillTabDatosRelativosAlProcedimientoParaSolicitante();
		fillTabSolicitanteParaSolicitante();
		fillTabRepresentanteParaSolicitante();
		fillTabDatosDeNotificacion();
		fillTabDocumentacion();
		fillTabPresentacion();
		assertTabFirmaYPresentacionDeSolicitudDataParaSolicitante();
		enviarSolicitud();
		assertSolicitudFirmadaYPresentada();
	}

	@Test(priority = 2)
	public void reconocimientoRepresentanteTest() {
		fillTabDatosRelativosAlProcedimientoParaRepresentante();
		fillTabSolicitanteParaRepresentante();
		fillTabRepresentanteParaRepresentanteFisica();
		fillTabDatosDeNotificacion();
		fillTabDocumentacion();
		fillTabPresentacion();
		assertTabFirmaYPresentacionDeSolicitudDataParaRepresentanteFisica();
		enviarSolicitud();
		assertSolicitudFirmadaYPresentada();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

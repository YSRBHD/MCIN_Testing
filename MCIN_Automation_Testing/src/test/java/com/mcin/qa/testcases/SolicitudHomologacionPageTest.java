package com.mcin.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcin.qa.pages.SolicitudHomologacionPage;

public class SolicitudHomologacionPageTest extends SolicitudHomologacionPage {

	@BeforeMethod
	public void setUp() {
		initialization();
		authentication();
		clickOnButtonHomologacion();
	}

	@Test(priority = 1)
	public void homologacionSolicitanteTest() {
		fillTabDatosRelativosAlProcedimientoParaSolicitante();
		fillTabSolicitanteParaSolicitante();
		fillTabRepresentanteParaSolicitante();
		fillTabDatosDeNotificacion();
		fillTabDocumentacion();
		fillTabPagosDeTasas();
		fillTabPresentacion();
		assertTabFirmaYPresentacionDeSolicitudDataParaSolicitante();
		enviarSolicitud();
		assertSolicitudFirmadaYPresentada();
	}

	@Test(priority = 2)
	public void homologacionRepresentanteTest() {
		fillTabDatosRelativosAlProcedimientoParaRepresentante();
		fillTabSolicitanteParaRepresentante();
		fillTabRepresentanteParaRepresentanteFisica();
		fillTabDatosDeNotificacion();
		fillTabDocumentacion();
		fillTabPagosDeTasas();
		fillTabPresentacion();
		assertTabFirmaYPresentacionDeSolicitudDataParaRepresentanteFisica();
		enviarSolicitud();
		assertSolicitudFirmadaYPresentada();
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}
}

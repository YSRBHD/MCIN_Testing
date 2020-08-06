package org.mcin.tests.solicitud;

import org.mcin.utils.SolicitudPageObject;
import org.openqa.selenium.WebDriver;

public class EquivalenciaEsPageObject extends SolicitudPageObject {

	public EquivalenciaEsPageObject(WebDriver driver) {
		super(driver);
	}

	// ========== Solicitante Page Object ==========//

	public void autentification() {
		authentication();
	}

	public void createSolicitanteEquivalencia() {
		clickOnButtonNuevaSolicitud();
		clickOnButtonEquivalencia();
	}

	public void fillTabDatosRelativosAlProcedimiento() {
		clickOnTabDatosRelativosAlProcedimiento();
		clickOnUsuarioSolicitante();
		fillDenominacionDelTituloSolicitante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillRamaDeConocimiento();
	}

	public void fillTabSolicitante() {
		clickOnButtonSolicitante();
		fillGenero();
		fillPaisDeNacimientoSolicitante();
		fillFechaDeNacimientoSolicitante();
		fillNationalidadSolicitante();
		// fillTipoDeDocumentoSolicitante();
		// fillPaisDelDocumentoSolicitante();
		// fillEmailSolicitante();
	}

	public void fillTabRepresentante() {
		clickOnButtonRepresentante();
	}

	public void fillTabDatosDeNotificacion() {
		clickOnButtonDatosDeNotificacion();
		fillTelefonoMovilDatosDeNotification();
		fillTelefonoFijoDatosDeNotification();
		fillEmailDatosDeNotificationSinPostales();
	}

	public void fillTabDocumentacion() {
		clickOnButtonDocumentacion();
		uploadAcreditativoIdentidadNacionalidad();
		uploadDeclaracionResponsable();
		uploadTituloAcadémicoCertificadoUniversidad();
		uploadCertificacionAcademicaLosEstudiosRealizados();
		uploadAcreditacionCompetenciaLinguistica();
		uploadOtrosDocumentos();
		// uploadDatosIdentificativosSolicitanteConDIS();
	}

	public void fillTabPagosDeTasas() {
		clickOnButtonPagosDeTasas();
		chooseTarjetaDeCredito();
	}

	public void fillTabPresentacion() {
		clickOnButtonPresentacion();
		fillObservacionesDePresentacion();
	}

	public void checkTabFirmaYPresentacionDeSolicitudData() {
		clickOnCheckBoxAceptarCondiciones();
		clickOnButtonRevisarYFirmar();
		assertTipoDeSolicitudFP();
		assertDenominacionDelTítuloSolicitanteFP();
		assertFechaInicioFP();
		assertFechaFinFP();
		assertUniversidadFP();
		assertPaisFP();
		assertNombreFP();
		assertPrimerApellidoFP();
		assertSegundoApellidoFP();
		assertGeneroFP();
		assertPaisDeNaciminetoFP();
		assertFechaDeNaciminetoFP();
		assertNacionalidadFP();
		assertTipoDeDocumentoFP();
		assertPaisDelDocumentoFP();
		assertNumDocumentoFP();
		// assertEmailInfoContactoFP();
		assertTelefonoFijoFP();
		assertTelefonoMovilFP();
		assertEmailDatosElectroFP();
		assertDocumentoAcreditativoIdentidadNacionalidadFP();
		assertDocumentoDeclaracionResponsableFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosFP();
		assertDocumentoAcreditacionCompetenciaLinguisticaFP();
		assertDocumentoOtrosDocumentosFP();
		// assertDocumentoDatosIdentificativosDelSolicitanteFPConDIS();
		assertObservacionesFP();

	}

	public void checkSolicitudFirmadaYPresentada() {
		clickOnButtonFirmarYPresentarSolitanteFP();
		clickOnButtonFirmarYPresentar();
		assertSolicitudFirmadaYPresentada();
	}

	// ========== Representante Page Object ==========//

	public void createRepresentanteEquivalencia() {
		clickOnButtonNuevaSolicitud();
		clickOnButtonEquivalencia();
	}

	public void fillTabDatosRelativosAlProcedimientoParaRepresentante() {
		clickOnTabDatosRelativosAlProcedimiento();
		clickOnUsuarioRepresentante();
		fillDenominacionDelTituloRepresentante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillRamaDeConocimiento();
	}

	public void fillTabSolicitanteParaRepresentante() {
		clickOnButtonSolicitante();
		fillNombreSolicitante();
		fillPrimerApellidoSolicitante();
		fillSegundoApellidoSolicitante();
		fillGenero();
		fillPaisDeNacimientoSolicitante();
		fillFechaDeNacimientoSolicitante();
		fillNationalidadSolicitante();
		fillTipoDeDocumentoSolicitante();
		// fillPaisDelDocumentoSolicitante();
		fillNumDocumentoSolicitante();
	}

	public void fillTabRepresentanteParaRepresentanteJuridica() {
		clickOnButtonRepresentante();
//		clickOnRadioButtonPersonaJuridica();
//		fillRazonRJ();
//		fillTipoDeDocumentoRJ();
//		fillNumdocumentoRJ();
//		fillTelefonoRJ();
		uploadApudActaRJ();
	}

	public void fillTabRepresentanteParaRepresentanteFisica() {
		clickOnButtonRepresentante();
//		clickOnRadioButtonPersonaFisica();
//		fillTipoDeDocumentoRF();
//		fillTelefonoRF();
		uploadApudActaRF();
	}

	public void checkTabFirmaYPresentacionDeSolicitudDataParaRepresentanteJuridica() {
		clickOnCheckBoxAceptarCondiciones();
		clickOnButtonRevisarYFirmar();
		assertTipoDeSolicitudFP();
		assertDenominacionDelTítuloRepresentanteFP();
		assertFechaInicioFP();
		assertFechaFinFP();
		assertUniversidadFP();
		assertPaisFP();
		// assertProfesionFP();
		assertNombreParaRepresentanteFP();
		assertPrimerApellidoParaRepresentanteFP();
		assertSegundoApellidoParaRepresentanteFP();
		assertGeneroFP();
		assertPaisDeNaciminetoFP();
		assertFechaDeNaciminetoFP();
		assertNacionalidadFP();
		assertTipoDeDocumentoFP();
		assertPaisDelDocumentoFP();
		assertNumDocumentoPararepresentanteFP();
		// assertEmailInfoContactoFP();
		assertTelefonoFijoFP();
		assertTelefonoMovilFP();
		assertEmailDatosElectroFP();
		assertRazonFP();
		assertTipoDocumentoRepresentanteFP();
		assertNumDocumentoRepresentanteJuridicaFP();
		assertTelefonoRepresentanteFP();
		assertDocumenApudActa();
		assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP();
		assertDocumentoDeclaracionResponsableRepresentanteFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP();
		assertDocumentoAcreditacionCompetenciaLinguisticaRepresentanteFP();
		assertDocumentoOtrosDocumentosFPRepresentante();
		// assertDocumentoDatosIdentificativosDelSolicitanteFPConDISRepresentante();
		assertObservacionesFP();
	}

	public void checkTabFirmaYPresentacionDeSolicitudDataParaRepresentanteFisica() {
		clickOnCheckBoxAceptarCondiciones();
		clickOnButtonRevisarYFirmar();
		assertTipoDeSolicitudFP();
		assertDenominacionDelTítuloRepresentanteFP();
		assertFechaInicioFP();
		assertFechaFinFP();
		assertUniversidadFP();
		assertPaisFP();
		// assertProfesionFP();
		assertNombreParaRepresentanteFP();
		assertPrimerApellidoParaRepresentanteFP();
		assertSegundoApellidoParaRepresentanteFP();
		assertGeneroFP();
		assertPaisDeNaciminetoFP();
		assertFechaDeNaciminetoFP();
		assertNacionalidadFP();
		assertTipoDeDocumentoFP();
		assertPaisDelDocumentoFP();
		assertNumDocumentoPararepresentanteFP();
		// assertEmailInfoContactoFP();
		assertTelefonoFijoFP();
		assertTelefonoMovilFP();
		assertEmailDatosElectroFP();
		assertTipoDocumentoRepresentanteFP();
		assertNumDocumentoRepresentanteFisicaFP();
		// assertTelefonoRepresentanteFP();
		assertDocumenApudActa();
		assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP();
		assertDocumentoDeclaracionResponsableRepresentanteFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP();
		assertDocumentoAcreditacionCompetenciaLinguisticaRepresentanteFP();
		assertDocumentoOtrosDocumentosFPRepresentante();
		// assertDocumentoDatosIdentificativosDelSolicitanteFPConDISRepresentante();
		assertObservacionesFP();
	}

	public void checkSolicitudFirmadaYPresentadaRepresentante() {
		clickOnButtonFirmarYPresentarRepresentanteFP();
		clickOnButtonFirmarYPresentar();
		assertSolicitudFirmadaYPresentada();
	}

}

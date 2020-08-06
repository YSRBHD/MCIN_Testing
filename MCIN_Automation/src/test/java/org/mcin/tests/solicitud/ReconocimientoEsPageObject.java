package org.mcin.tests.solicitud;

import org.mcin.utils.SolicitudPageObject;
import org.openqa.selenium.WebDriver;

public class ReconocimientoEsPageObject extends SolicitudPageObject {

	public ReconocimientoEsPageObject(WebDriver driver) {
		super(driver);
	}

	public void autentification() {
		authentication();
	}

	public void createSolicitanteReconocimiento() {
		clickOnButtonNuevaSolicitud();
		clickOnButtonReconocimiento();
	}

	public void fillTabDatosRelativosAlProcedimiento() {
		clickOnTabDatosRelativosAlProcedimiento();
		clickOnUsuarioSolicitante();
		fillDenominacionDelTituloSolicitante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillProfesion();
	}

	public void fillTabSolicitante() {
		clickOnButtonSolicitante();
		fillGenero();
		fillPaisDeNacimientoSolicitante();
		fillFechaDeNacimientoSolicitante();
		fillNationalidadSolicitante();
//		fillTipoDeDocumentoSolicitante();
//		fillPaisDelDocumentoSolicitante();
//		fillEmailSolicitante();
//		fillTelefonoMovilDatosDeNotification();
	}

	public void fillTabRepresentante() {
		clickOnButtonRepresentante();
	}

	public void fillTabDatosDeNotificacion() {
		clickOnButtonDatosDeNotificacion();
		fillTelefonoMovilDatosDeNotification();
		fillTelefonoFijoDatosDeNotification();
		fillEmailDatosDeNotificationConPostales();
	}

	public void fillTabDocumentacion() {
		clickOnButtonDocumentacion();
		uploadAcreditativoIdentidadNacionalidad();
		uploadDeclaracionResponsable();
		uploadTituloAcadémicoCertificadoUniversidad();
		uploadCertificacionAcademicaLosEstudiosRealizados();
		uploadOtrosDocumentosSinDIS();
		// uploadDatosIdentificativosSolicitanteSinDIS();
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
		assertProfesionFP();
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
		assertDocumentoOtrosDocumentosReconocimientoFP();
		assertObservacionesFP();

	}

	public void checkSolicitudFirmadaYPresentada() {
		clickOnButtonFirmarYPresentarSolitanteFP();
		clickOnButtonFirmarYPresentar();
		assertSolicitudFirmadaYPresentada();
	}

	// ========== Representante Page Object ==========//

	public void createRepresentanteReconocimiento() {
		clickOnButtonNuevaSolicitud();
		clickOnButtonReconocimiento();
	}

	public void fillTabDatosRelativosAlProcedimientoParaRepresentante() {
		clickOnTabDatosRelativosAlProcedimiento();
		clickOnUsuarioRepresentante();
		fillDenominacionDelTituloRepresentante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillProfesion();
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
//			clickOnRadioButtonPersonaJuridica();
//			fillRazonRJ();
//			fillTipoDeDocumentoRJ();
//			fillNumdocumentoRJ();
//			fillTelefonoRJ();
		uploadApudActaRJ();
	}

	public void fillTabRepresentanteParaRepresentanteFisica() {
		clickOnButtonRepresentante();
//			clickOnRadioButtonPersonaFisica();
//			fillTipoDeDocumentoRF();
//			fillTelefonoRF();
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
		assertProfesionFP();
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
		assertProfesionFP();
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
		assertDocumentoOtrosDocumentosRepresentanteReconocimientoFP();
		// assertDocumentoDatosIdentificativosDelSolicitanteFPConDISRepresentante();
		assertObservacionesFP();
	}

	public void checkSolicitudFirmadaYPresentadaRepresentante() {
		clickOnButtonFirmarYPresentarRepresentanteFP();
		clickOnButtonFirmarYPresentar();
		assertSolicitudFirmadaYPresentada();
	}

}

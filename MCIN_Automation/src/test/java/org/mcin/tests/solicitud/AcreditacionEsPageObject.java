package org.mcin.tests.solicitud;

import org.mcin.utils.SolicitudPageObject;
import org.openqa.selenium.WebDriver;

public class AcreditacionEsPageObject extends SolicitudPageObject {

	public AcreditacionEsPageObject(WebDriver driver) {
		super(driver);
	}

	// ========== Solicitante Page Object ==========//

	public void autentification() {
		authentication();
	}

	public void createSolicitanteAcreditacion() {
		clickOnButtonNuevaSolicitud();
		clickOnButtonAcreditacion();
	}

	public void fillTabDatosRelativosAlProcedimiento() {
		clickOnTabDatosRelativosAlProcedimiento();
		clickOnUsuarioSolicitante();
		fillDenominacionDelTituloAcriditacionSolicitante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPaisUniversidadAccriditacion();
		fillProfesionAccriditacion();
		fillPaisProfesionAccriditacion();
	}

	public void fillTabSolicitante() {
		clickOnButtonSolicitante();
		fillGenero();
		fillPaisDeNacimientoSolicitante();
		fillFechaDeNacimientoSolicitante();
		fillNationalidadSolicitante();
		// fillTipoDeDocumentoSolicitante();
		// fillPaisDelDocumentoSolicitante();
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
		uploadAcreditacionCompetenciaLinguistica();
		uploadOtrosDocumentos();
		// uploadDatosIdentificativosSolicitanteConDIS();
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
		assertProfesionAccriditacionFP();
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
		assertDocumentoOtrosDocumentosFP();
		// assertDocumentoDatosIdentificativosDelSolicitanteFPConDIS();
		assertObservacionesFP();

	}

	public void checkSolicitudFirmadaYPresentada() {
		clickOnButtonFirmarYPresentarSolitanteFP();
		clickOnButtonFirmarYPresentar();
		assertSolicitudFirmadaYPresentada();
		// assertCreationSolicitudComoSolicitante();
	}

	// ========== Representante Page Object ==========//

	public void createRepresentanteAcreditacion() {
		clickOnButtonNuevaSolicitud();
		clickOnButtonAcreditacion();
	}

	public void fillTabDatosRelativosAlProcedimientoParaRepresentante() {
		clickOnTabDatosRelativosAlProcedimiento();
		clickOnUsuarioRepresentante();
		fillDenominacionDelTituloAcriditacionRepresentante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPaisUniversidadAccriditacion();
		fillProfesionAccriditacion();
		fillPaisProfesionAccriditacion();
	}

	public void fillTabSolicitanteParaRepresentante() {
		clickOnButtonSolicitante();
		fillGenero();
		fillNombreSolicitante();
		fillPrimerApellidoSolicitante();
		fillSegundoApellidoSolicitante();
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
		// clickOnRadioButtonPersonaFisica();
		// fillTipoDeDocumentoRF();
		// fillTelefonoRF();
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
		assertProfesionAccriditacionFP();
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
		assertProfesionAccriditacionFP();
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
		// assertRazonFP();
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
		// assertCreationSolicitudComoRepresentante();
	}

}

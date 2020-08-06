package org.mcin.utils;

import org.openqa.selenium.By;

public class SolicitudElementsLocators {

	// ======================== Test Data Directory ======================== //

//Please change the Test file path to match the location of the file in your computer.

	public String testDocument = "C:\\Development\\MCIN\\MCIN_Automation\\Test data\\TEST.docx";

	// ========================= Buttons Locators ========================= //

	public By buttonAcceder = By.xpath("//*[@id=\"formularioPrincial\"]/div/div/div/div[3]/div/div/button");
	public By buttonAccess = By.xpath("//*[@id=\"tooltip1\"]/div[2]/div/fieldset/div");
	public By buttonUserTypeSolicitante = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div[3]/div/div[1]/div/div[1]/img");
	public By buttonNuevaSolicitud = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[1]/div[2]/button");
	public By buttonHomologacion = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[4]/div/div[1]/div/div/div[1]/img");
	public By buttonEquivalencia = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[4]/div/div[2]/div/div/div[1]/img");
	public By buttonReconocimineto = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[4]/div/div[3]/div/div/div[1]/img");
	public By buttonAcreditacion = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[6]/div/div[2]/div/div/div[1]/img");
	public By buttonDatosRelativosAlProcedimiento = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[4]/div/div[1]/button");
	public By buttonSolicitante = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[4]/div/div[2]/button");
	public By buttonRepresentante = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[4]/div/div[2]/button");
	public By buttonDatosDeNotificacion = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[4]/div/div[2]/button");
	public By buttonDocumentacion = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[4]/div/div[2]/button");
	public By buttonPagosDeTasas = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[4]/div/div[2]/button");
	public By buttonPresentacion = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[4]/div/div[2]/button");
	public By buttonAnadirAcreditativoIdentidadNacionalidad = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div[2]/input");
	public By buttonActualizarDoc1 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[2]/div[1]/div[3]/div[2]/input");
	public By buttonAnadirDeclaracionResponsable = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[3]/div[1]/div[2]/input");
	public By buttonActualizarDoc2 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[3]/div[1]/div[3]/div[2]/input");
	public By buttonAnadirTituloAcadémicoCertificadoUniversidad = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[4]/div[1]/div[2]/input");
	public By buttonActualizarDoc3 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[4]/div[1]/div[3]/div[2]/input");
	public By buttonAnadirCertificacionAcademicaEstudiosRealizados = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[5]/div[1]/div[2]/input");
	public By buttonActualizarDoc4 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[5]/div[1]/div[3]/div[2]/input");
	public By buttonAnadirAcreditacionCompetenciaLinguistica = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[6]/div[1]/div[2]/input");
	public By buttonAnadirDatosIdentificativosSolicitanteConDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[9]/div[1]/div[2]/input");
	public By buttonAnadirDatosIdentificativosSolicitanteSinDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[8]/div[1]/div[2]/input");
	public By buttonActualizarDoc5 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[6]/div[1]/div[3]/div[2]/input");
	public By buttonAnadirOtrosDocumentosConDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[7]/div[1]/div[2]/input");
	public By buttonAnadirOtrosDocumentosSinDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[6]/div[1]/div[2]/input");
	public By buttonActualizarOtroDoc1ConDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[7]/div[2]/div[2]/div[3]/input");
	public By buttonActualizarOtroDoc1SinDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[6]/div[2]/div[2]/div[3]/input");
	public By buttonActualizarOtroDoc2 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[7]/div[2]/div[3]/div[3]/input");
	public By buttonActualizarOtroDoc3 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[7]/div[2]/div[4]/div[3]/input");
	public By buttonActualizarOtroDoc4 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[7]/div[2]/div[5]/div[3]/input");
	public By buttonActualizarOtroDoc5 = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[7]/div[2]/div[6]/div[3]/input");
	public By buttonActualizarDatosIdentificados = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[9]/div[1]/div[3]/div[2]/input");
	public By buttonAdjuntarArchivoDocumentPopup = By
			.xpath("//*[@id=\"modalDocumentacion\"]/div/div/div[3]/div[2]/label");
	public By buttonAnadirApudActa = By.xpath("//*[@id=\"formRepresentante\"]/div[9]/div[2]/div[1]/div[2]/input");
	public By buttonAdjuntarArchivoPopup = By.xpath("//*[@id=\"modalDocumentacion\"]/div/div/div[3]/div[2]/label");
	public By buttonAnadirDocumentPopup = By.xpath("//*[@id=\"modalDocumentacion\"]/div/div/div[8]/div/div[2]/input");
	public By buttonAnadirDocumentApudActaPopup = By
			.xpath("//*[@id=\"modalRepresentante\"]/div/div/div[7]/div/div[2]/input");
	public By buttonActualizarDocumentApudActaPopup = By
			.xpath("//*[@id=\"formRepresentante\"]/div[9]/div[2]/div[1]/div[3]/div[2]/input");
	public By buttonContinuarConElPagoTC = By.xpath("//*[@id=\"pagarOnlineModal\"]/div/div/div[9]/div/div[3]/button");
	public By buttonRevisarYFirmar = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div/div[4]/div/div/div/button[1]");
	public By buttonFirmarYPresentarSolicitanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[14]/div/div/div/button[1]");
	public By buttonFirmarYPresentarRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[16]/div/div/div/button[1]");
	public By buttonFirmarYPresentar = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div[7]/div/div[3]/button[1]");
	public By buttonIrAMisTramites = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div[7]/div/div[3]/button[2]");

	// ========================= Tabs Locators ========================= //

	public By tabSolicitante = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[2]/a");
	public By tabDatosRelativosAlProcedimiento = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[1]/a");
	public By tabRepresentante = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[3]/a");
	public By tabDatodDeNotificacion = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[4]/a");
	public By tabDocumentacion = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[5]/a");
	public By tabPagosDeTasas = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[6]/a");
	public By tabPresentacion = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[7]/a");
	public By tabExpedientes = By.xpath("//*[@id=\"adminHeaderButtons\"]/ul/li[2]/a");
	public By tabExpedientesDeMisRepresentadores = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[2]/ul/li[4]/a");
	public By tabMisExpedientes = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[2]/ul/li[3]/a");

	// ========================= Date Pickers Locators ================== //

	public By datePickerFechaInicioDRAP = By.xpath("//*[@id=\"fechaInicioMask\"]");
	public By datePickerFechaFinDRAP = By.xpath("//*[@id=\"fechaFinMask\"]");
	public By datePickerFechaDeNacimiento = By.xpath("//*[@id=\"fechaNacimientoSolMask\"]");

	// ======================== TextBox Locators ======================= //

	public By textBoxDenominacionDelTitulo = By.xpath("//*[@id=\"formTitulo\"]/div[5]/div/div/div/input");
	public By textBoxDenominacionDelTituloOtro = By.xpath("//*[@id=\"formTitulo\"]/div[5]/div/div/div/input");
	public By textBoxUniversidad = By.xpath("//*[@id=\"formTitulo\"]/div[8]/div/div/div/input");
	public By textBoxNombreSolicitante = By.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[1]/div[1]/div/input");
	public By textBoxPrimerApellidoSolicitante = By
			.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[2]/div[1]/div/input");
	public By textBoxSegundoApellidoSolicitante = By
			.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[1]/div[2]/div/div/input");
	public By textBoxNumDocumentoSolicitante = By
			.xpath("//*[@id=\"formSolicitante\"]/div[5]/div/div[1]/div[2]/div/div/input");
	public By textBoxEmailSolicitante = By.xpath("//*[@id=\"formSolicitante\"]/div[7]/div/div[1]/div[1]/div/input");
	public By textBoxTelefonoMovilDatosdeNotification = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/form/div[2]/div[1]/div/div/input");
	public By textBoxEmailDatosDeNotificationHomologacion = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/form/div[2]/div/div/div/input");
	public By textBoxEmailDatosDeNotificationConPostales = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/form/div[5]/div/div/div/input");
	public By textBoxObservaciones = By.xpath("//*[@id=\"observaciones\"]");
	public By textBoxTipoDeSolicitudFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[1]/div/div/div/div[1]/input");
	public By textBoxDenominacionDelTítuloFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[2]/div/div/input");
	public By textBoxFechaInicioFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[3]/div/div[1]/input");
	public By textBoxFechaFinFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[3]/div/div[2]/input");
	public By textBoxUniversidadFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[4]/div/div/input");
	public By textBoxPaisFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[5]/div/div/input");
	public By textBoxProfesionFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[6]/div/div/input");
	public By textBoxProfesionAccriditacionFP = By.xpath("");
	public By textBoxNombreFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[1]");
	public By textBoxPrimerApellidoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[2]/input[1]");
	public By textBoxSegundoApellidoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[2]");
	public By textBoxGeneroFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[2]/input[2]");
	public By textBoxPaisDeNacimientoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[3]");
	public By textBoxFechaDeNacimientoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[2]/input[3]");
	public By textBoxNacionalidadFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[4]");
	public By textBoxTipoDeDocumentoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[4]/div/div[1]/div/div/input");
	public By textBoxPaisDelDocumentoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[4]/div/div[2]/input");
	public By textBoxNumdocumentoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[4]/div/div[1]/input");
	public By textBoxRazonFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[4]/div[1]/div/input");
	public By textBoxTipoDocumentoRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[3]/div[2]/div[1]/input");
	public By textBoxNumDocumentoRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[3]/div[3]/div/input");
	public By textBoxTelefonoRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[4]/div[3]/div/input");
	public By textBoxTelefonoFijoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[8]/div[2]/div/div[1]/input");
	public By textBoxTelefonoMovilFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[8]/div[2]/div/div[2]/input");
	public By textBoxRazonER = By.xpath("//*[@id=\"formRepresentante\"]/div[4]/div/div/div/input");
	public By textBoxNumdocumentoER = By.xpath("//*[@id=\"formRepresentante\"]/div[5]/div/div[2]/div/input");
	public By textBoxTelefonoRJ = By.xpath("//*[@id=\"formRepresentante\"]/div[6]/div/div[1]/div/div/div/div/input");
	public By textBoxTelefonoRF = By.xpath("//*[@id=\"formRepresentante\"]/div[6]/div/div[1]/div/div/div/div/input");
	public By textBoxEmailDatosElectroFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[8]/div[4]/div/div/input");
	public By textBoxApudActaFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div");
	public By textBoxApudActaValueFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div/div[2]/div");
	public By textBoxAcreditativoIdentidadNacionalidadFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[1]/div/div/div");
	public By textBoxDeclaracionResponsableFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[2]/div/div/div");
	public By TextBoxTituloAcademicoCertificadoUniversidadFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[3]/div/div/div");
	public By textBoxCertificacionAcademicaEstudiosRealizadosFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[4]/div/div/div");
	public By textBoxAcreditacionCompetenciaLinguisticaFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div");
	public By textBoxOtrosDocumentosFPConDIS = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[6]/div/div/div");
	public By textBoxOtrosDocumentosFPTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[6]/div/div/div/div[2]/div");
	public By textBoxOtrosDocumentosReconocimientoFPValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div/div[2]/div");
	public By textBoxOtrosDocumentosReconocimientoFPTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div");
	public By textBoxAcreditativoIdentidadNacionalidadRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[1]/div/div/div");
	public By textBoxDeclaracionResponsableRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[2]/div/div/div");
	public By TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[3]/div/div/div");
	public By textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[4]/div/div/div");
	public By textBoxAcreditacionCompetenciaLinguisticaRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[5]/div/div/div");
	public By textBoxOtrosDocumentosFPRepresentanteTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[6]/div/div/div");
	public By textBoxDatosIdentificativosDelSolicitanteValueConDISRepresentante = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[7]/div/div/div");
	public By textBoxOtrosDocumentosFPRepresentanteValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[6]/div/div/div/div[2]/div");
	public By textBoxOtrosDocumentosFPRepresentanteReconocimientoValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[5]/div/div/div/div[2]/div");
	public By textBoxOtrosDocumentosFPRepresentanteReconocimientoTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[5]/div/div/div");
	public By textBoxObservacionesFP = By.xpath("//*[@id=\"observaciones\"]");
	public By textBoxSolicitudFirmadaYPresentada = By
			.xpath("/html/body/div[2]/div/div/div/div[7]/div/div[2]/div/div[2]/div/div/div[2]/div");
	public By textBoxIdSolicitud = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div[1]/label");
	public By textBoxIdSolicitudComoSolicitanteTable = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[2]/div/div[6]/div");
	public By textBoxIdSolicitudComoRepresentanteTable = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[2]/div/div[6]/div");
	public By textBoxTestDocumentNamePopUp = By.xpath("//*[@id=\\\"modalDocumentacion\\\"]/div/div/div[4]");
	public By textBoxTelefonoFijoDatosDeNotification = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/form/div[2]/div[2]/div/div/input");
	public By textBoxEmailDatosDeNotificationSinPostales = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/form/div[4]/div/div/div/input");

	// ======================== CheckBox Locators ======================= //

	public By checkBoxVeracidadDeDocument = By.xpath("//*[@id=\"textUploadDocument\"]");
	public By checkBoxNoAutorizoComprobacionConDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[8]/div/div/label/input");
	public By checkBoxNoAutorizoComprobacionSinDIS = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div/div[7]/div/div/label/input");
	public By checkBoxAceptarCondiciones = By.xpath("//*[@id=\"AceptarCondiciones\"]");
	public By checkBoxVeracidadApudActa = By.xpath("//*[@id=\"textUploadDocument\"]");

	// ======================== ComboBox Locators ======================= //

	public By comboBoxDenominacionDelTitulo = By.xpath("//*[@id=\"formTitulo\"]/div[4]/div/div/div/select");
	public By comboBoxDenominacionDelTituloValueOtro = By
			.xpath("//*[@id=\"formTitulo\"]/div[4]/div/div/div/select/option[6]");
	public By comboBoxPais = By.xpath("//*[@id=\"formTitulo\"]/div[9]/div/div/div/select");
	public By comboBoxPaisvalueSpain = By.xpath("//*[@id=\"formTitulo\"]/div[9]/div/div/div/select/option[61]");
	public By comboBoxPaisProfesionAcreditacion = By.xpath("//*[@id=\"formTitulo\"]/div[12]/div/div/div/select");
	public By comboBoxPaisProfesionAcriditacionvalueSpain = By
			.xpath("//*[@id=\"formTitulo\"]/div[12]/div/div/div/select/option[61]");
	public By comboBoxPaisUniversidadAcreditacion = By.xpath("//*[@id=\"formTitulo\"]/div[9]/div/div/div/select");
	public By comboBoxPaisUniversidadAcreditacionvalueSpain = By
			.xpath("//*[@id=\"formTitulo\"]/div[9]/div/div/div/select/option[61]");
	public By comboBoxProfesion = By.xpath("//*[@id=\"formTitulo\"]/div[11]/div/div/div/select");
	public By comboboxProfesionvalueProfesion1 = By
			.xpath("//*[@id=\"formTitulo\"]/div[11]/div/div/div/select/option[2]");
	public By comboBoxProfesionAccriditacion = By.xpath("//*[@id=\"formTitulo\"]/div[11]/div/div/div/select");
	public By comboboxProfesionAccriditacionvalueProfesion1 = By
			.xpath("//*[@id=\"formTitulo\"]/div[11]/div/div/div/select/option[2]");
	public By comboboxPaisDeNacimineto = By.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[1]/div[3]/div/select");
	public By comboboxPaisDeNaciminetoValueSpain = By
			.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[1]/div[3]/div/select/option[61]");
	public By comboboxNationalidad = By.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[1]/div[4]/div/select");
	public By comboboxNationalidadValueSpain = By
			.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[1]/div[4]/div/select/option[168]");
	public By comboboxTipoDeDocumento = By
			.xpath("//*[@id=\"formSolicitante\"]/div[5]/div/div[1]/div[1]/div[1]/div[2]/div/div/select");
	public By comboboxTipoDeDocumentoValueDni = By
			.xpath("//*[@id=\"formSolicitante\"]/div[5]/div/div[1]/div[1]/div[1]/div[2]/div/div/select/option[2]");
	public By comboboxPaisDelDocumento = By.xpath("//*[@id=\"formSolicitante\"]/div[5]/div/div[2]/div/select");
	public By comboboxPaisDelDocumentoValueSpain = By
			.xpath("//*[@id=\"formSolicitante\"]/div[5]/div/div[2]/div/select/option[164]");
	public By comboboxTipoDeDocumentoRJ = By
			.xpath("//*[@id=\"formRepresentante\"]/div[5]/div/div[1]/div/div[1]/div[2]/div/select");
	public By comboboxTipoDeDocumentoRF = By
			.xpath("//*[@id=\"formRepresentante\"]/div[5]/div/div[1]/div/div[1]/div[2]/div/select");
	public By comboboxTipoDeDocumentoRJValueDNI = By
			.xpath("//*[@id=\"formRepresentante\"]/div[5]/div/div[1]/div/div[1]/div[2]/div/select/option[2]");
	public By comboboxTipoDeDocumentoRFValueDNI = By
			.xpath("//*[@id=\"formRepresentante\"]/div[5]/div/div[1]/div/div[1]/div[2]/div/select/option[2]");
	public By comboBoxRamaDeConocimiento = By.xpath("//*[@id=\"formTitulo\"]/div[11]/div/div[1]/div[1]/div/select");
	public By comboboxRamaDeConocimientoArtesYHumanidades = By
			.xpath("//*[@id=\"formTitulo\"]/div[11]/div/div[1]/div[1]/div/select/option[2]");

	// ======================= Radio Button Locators ======================= //

	public By radioButtonTarjetaCredito = By.xpath(
			"//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/div/div/div[1]/div/div[3]/div[2]/div[1]/label/input");
	public By radioButtonUsuarioSolicitante = By.xpath("//*[@id=\"formTitulo\"]/div[2]/div/div/div[1]/div/label/input");
	public By radioButtonUsuarioRepresentante = By
			.xpath("//*[@id=\"formTitulo\"]/div[2]/div/div/div[2]/div/label/input");
	public By radioButtonPersonaJuridica = By
			.xpath("//*[@id=\"formRepresentante\"]/div[2]/div/div[2]/div/div[1]/div/label/input");
	public By radioButtonPersonaFisica = By
			.xpath("//*[@id=\"formRepresentante\"]/div[2]/div/div[2]/div/div[2]/div/label/input");
	public By radiobuttonAdjuntarDocumentoApudActa = By
			.xpath("//*[@id=\"formRepresentante\"]/div[9]/div[1]/div/div/div/label/input");
	public By radioButtonGenero = By
			.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div/label");
	public By radioButtonGeneroAcriditacion = By
			.xpath("//*[@id=\"formSolicitante\"]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div/label/input");
}
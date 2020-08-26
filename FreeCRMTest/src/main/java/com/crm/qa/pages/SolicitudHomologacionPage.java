package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class SolicitudHomologacionPage extends TestBase {

	// ====== Page Factory (Objects Repository)======//

	// Tab Datos Relativos Al Procedimiento

	By buttonHomologacion = By.xpath("//*[@alt=\"Homologacion\"]");
	By tabDatosRelativosAlProcedimiento = By.xpath("//*[@data-ui-sref=\"tituloSolicitud\"]");
	By radioButtonUsuarioSolicitante = By.xpath("//*[@id=\"formTitulo\"]/div[2]/div/div/div[1]/div/label/input");
	By textBoxDenominacionDelTitulo = By.xpath(
			"(//input[@name=\"nombreTitulo\"][@class=\"form-control inputborder ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required\"])[2]");
	By datePickerFechaInicioDRAP = By.xpath("//*[@id=\"fechaInicioMask\"]");
	By datePickerFechaFinDRAP = By.xpath("//*[@id=\"fechaFinMask\"]");
	By textBoxUniversidad = By.xpath("(//*[@name=\"nombreUniversidad\"])[1]");
	By comboBoxPais = By.xpath("(//*[@name=\"idPaisUniversidad\"])[1]");
	By comboBoxPaisvalueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	By comboBoxProfesion = By.xpath("(//*[@name=\"idProfesion\"])[1]");
	By comboboxProfesionvalueProfesion1 = By.xpath("(//*[@value=\"number:35\"])[6]");

	// Tab Solicitante

	By buttonSolicitante = By.xpath("//*[@data-ui-sref=\"solicitanteSolicitud\"]");
	By radioButtonGenero = By.xpath("//*[@value=\"H\"]");
	By comboboxPaisDeNacimineto = By.xpath("(//*[@name=\"idPaisNacimientoSol\"])[1]");
	By comboboxPaisDeNaciminetoValueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	By datePickerFechaDeNacimiento = By.xpath("//*[@id=\"fechaNacimientoSolMask\"]");
	By comboboxNationalidad = By.xpath("(//*[@name=\"idNacionalidad\"])[1]");
	By comboboxNationalidadValueSpain = By.xpath("(//*[@value=\"number:167\"])[6]");

	// Tab Representante

	By buttonRepresentante = By.xpath("//*[@data-ui-sref=\"representanteSolicitud\"]");

	// Tab Datos De Notification

	By buttonDatosDeNotificacion = By.xpath(" //*[@data-ui-sref=\"notificacionSolicitud\"]");
	By textBoxTelefonoMovilDatosdeNotification = By.xpath("//*[@name=\"telefonoMovilSol\"]");
	By textBoxTelefonoFijoDatosDeNotification = By.xpath("//*[@name=\"telefonoFijoSol\"]");
	By textBoxEmailDatosDeNotificationSinPostales = By.xpath("//*[@name=\"emailNot\"]");

	// Tab Documentacion

	By buttonDocumentacion = By.xpath("//*[@data-ui-sref=\"documentacionSolicitud\"]");
	By buttonAnadirDocumentPopup = By.xpath("(//*[@value=\"Añadir documento\"])[8]");
	By buttonAnadirAcreditativoIdentidadNacionalidad = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Documento acreditativo de identidad' ,'acreditativo')\"]");
	By buttonAnadirDeclaracionResponsable = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Declaracion responsable', 'responsable')\"]");
	By buttonAnadirTituloAcadémicoCertificadoUniversidad = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Titulo Academico', 'academico')\"]");
	By buttonAnadirCertificacionAcademicaEstudiosRealizados = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Certificacion de Estudios realizados', 'estudios')\"]");
	By buttonAnadirAcreditacionCompetenciaLinguistica = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Acreditacion Competencia Liguistica' , 'competencia')\"]");
	By buttonAnadirOtrosDocumentos = By.xpath("//*[@data-ng-click=\"tipoDocumento('Otros','otros')\"]");
	By buttonActualizarDoc1 = By.xpath(
			"//*[@data-ng-click=\"tipoDocumento('Documento acreditativo de identidad', 'acreditativo');idDocumento(identidadFileId)\"]");
	By buttonActualizarDoc2 = By.xpath(
			"//*[@data-ng-click=\"tipoDocumento('Declaracion responsable' , 'responsable');idDocumento(declarationResponsableFileId)\"]");
	By buttonActualizarDoc3 = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Titulo Academico', 'academico');idDocumento(tituloFileId)\"]");
	By buttonActualizarDoc4 = By.xpath(
			"//*[@data-ng-click=\"tipoDocumento('Certificacion de Estudios realizados' , 'estudios');idDocumento(certificationFileId)\"]");
	By buttonActualizarDoc5 = By.xpath(
			"//*[@data-ng-click=\"tipoDocumento('Acreditacion Competencia Liguistica' , 'competencia');idDocumento(acreditacionFileId)\"]");
	By buttonActualizarOtroDoc1ConDIS = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Otros');idDocumento(documento.fileId)\"]");
	By checkBoxVeracidadDeDocument = By.xpath("//*[@id=\"textUploadDocument\"]");

	// Tab Pagos De Tasas

	By buttonPagosDeTasas = By.xpath("//*[@data-ui-sref=\"pagoSolicitud\"]");
	By buttonContinuarConElPagoTC = By.xpath("//*[@data-ng-click=\"goToPasarelaPago('pasarelaPago')\"]");
	By radioButtonPagoOnline = By.xpath("//*[@value=\"tarjeta\"]");

	// Tab Presentacion

	By buttonPresentacion = By.xpath("//*[@data-ui-sref=\"presentacionSolicitud\"]");
	By buttonRevisarYFirmar = By.xpath("//*[@data-ng-click=\"goToFirmar('presentarSolicitud')\"]");
	By textBoxObservaciones = By.xpath("//*[@id=\"observaciones\"]");
	By checkBoxAceptarCondiciones = By.xpath("//*[@id=\"AceptarCondiciones\"]");

	// Tab Firmar Y Presentar

	By textBoxTipoDeSolicitudFP = By.xpath("//*[@data-ng-repeat=\"procedimientoDB in procedimientosDB\"]");
	By textBoxDenominacionDelTítuloFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[2]/div/div/input");
	By textBoxFechaInicioFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[3]/div/div[1]/input");
	By textBoxFechaFinFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[3]/div/div[2]/input");
	By textBoxUniversidadFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[4]/div/div/input");
	By textBoxPaisFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[5]/div/div/input");
	By textBoxProfesionFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[4]/div[6]/div/div/input");
	By textBoxProfesionAccriditacionFP = By.xpath("");
	By textBoxNombreFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[1]");
	By textBoxPrimerApellidoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[2]/input[1]");
	By textBoxSegundoApellidoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[2]");
	By textBoxGeneroFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[2]/input[2]");
	By textBoxPaisDeNacimientoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[3]");
	By textBoxFechaDeNacimientoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[2]/input[3]");
	By textBoxNacionalidadFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[2]/div/div[1]/input[4]");
	By textBoxTipoDeDocumentoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[4]/div/div[1]/div/div/input");
	By textBoxPaisDelDocumentoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[4]/div/div[2]/input");
	By textBoxNumdocumentoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[6]/div[4]/div/div[1]/input");
	By textBoxRazonFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[4]/div[1]/div/input");
	By textBoxTipoDocumentoRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[3]/div[2]/div[1]/input");
	By textBoxNumDocumentoRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[3]/div[3]/div/input");
	By textBoxTelefonoRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[4]/div[3]/div/input");
	By textBoxTelefonoFijoFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[8]/div[2]/div/div[1]/input");
	By textBoxTelefonoMovilFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[8]/div[2]/div/div[2]/input");
	By textBoxRazonER = By.xpath("//*[@id=\"formRepresentante\"]/div[4]/div/div/div/input");
	By textBoxNumdocumentoER = By.xpath("//*[@id=\"formRepresentante\"]/div[5]/div/div[2]/div/input");
	By textBoxTelefonoRJ = By.xpath("//*[@id=\"formRepresentante\"]/div[6]/div/div[1]/div/div/div/div/input");
	By textBoxTelefonoRF = By.xpath("//*[@id=\"formRepresentante\"]/div[6]/div/div[1]/div/div/div/div/input");
	By textBoxEmailDatosElectroFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[8]/div[4]/div/div/input");
	By textBoxApudActaFP = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div");
	By textBoxApudActaValueFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div/div[2]/div");
	By textBoxAcreditativoIdentidadNacionalidadFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[1]/div/div/div");
	By textBoxDeclaracionResponsableFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[2]/div/div/div");
	By TextBoxTituloAcademicoCertificadoUniversidadFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[3]/div/div/div");
	By textBoxCertificacionAcademicaEstudiosRealizadosFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[4]/div/div/div");
	By textBoxAcreditacionCompetenciaLinguisticaFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div");
	By textBoxOtrosDocumentosFPConDIS = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[6]/div/div/div");
	By textBoxOtrosDocumentosFPTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[6]/div/div/div/div[2]/div");
	By textBoxOtrosDocumentosReconocimientoFPValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div/div[2]/div");
	By textBoxOtrosDocumentosReconocimientoFPTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[10]/div[5]/div/div/div");
	By textBoxAcreditativoIdentidadNacionalidadRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[1]/div/div/div");
	By textBoxDeclaracionResponsableRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[2]/div/div/div");
	By TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[3]/div/div/div");
	By textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[4]/div/div/div");
	By textBoxAcreditacionCompetenciaLinguisticaRepresentanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[5]/div/div/div");
	By textBoxOtrosDocumentosFPRepresentanteTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[6]/div/div/div");
	By textBoxDatosIdentificativosDelSolicitanteValueConDISRepresentante = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[7]/div/div/div");
	By textBoxOtrosDocumentosFPRepresentanteValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[6]/div/div/div/div[2]/div");
	By textBoxOtrosDocumentosFPRepresentanteReconocimientoValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[5]/div/div/div/div[2]/div");
	By textBoxOtrosDocumentosFPRepresentanteReconocimientoTextValue = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[12]/div[5]/div/div/div");
	By textBoxObservacionesFP = By.xpath("//*[@id=\"observaciones\"]");
	By textBoxSolicitudFirmadaYPresentada = By
			.xpath("/html/body/div[2]/div/div/div/div[7]/div/div[2]/div/div[2]/div/div/div[2]/div");

	By buttonFirmarYPresentarSolicitanteFP = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div/div[14]/div/div/div/button[1]");
	By buttonFirmarYPresentar = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div/div[7]/div/div[3]/button[1]");

//======================================================================//

	// Actions on Tabs

	// Tab Datos Relativos Al Procedimiento

	public void clickOnButtonHomologacion() {
		driver.findElement(buttonHomologacion).click();
		sleep(null);
	}

	public void clickOnUsuarioSolicitante() {
		driver.findElement(radioButtonUsuarioSolicitante).click();
		sleep(null);
	}

	public void fillDenominacionDelTituloSolicitante() {
		driver.findElement(textBoxDenominacionDelTitulo).click();
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Solicitante");
		sleep(null);
	}

	public void fillFechainicio() {
		driver.findElement(datePickerFechaInicioDRAP).click();
		driver.findElement(datePickerFechaInicioDRAP).sendKeys("01/01/2019");
		sleep(null);
	}

	public void fillFechaFin() {
		driver.findElement(datePickerFechaFinDRAP).click();
		driver.findElement(datePickerFechaFinDRAP).sendKeys("01/01/2020");
		sleep(null);
	}

	public void fillUniversidad() {
		driver.findElement(textBoxUniversidad).sendKeys("Test_Automatico_Universidad");
		sleep(null);
	}

	public void fillPais() {
		driver.findElement(comboBoxPais).click();
		driver.findElement(comboBoxPaisvalueSpain).click();
		sleep(null);
	}

	public void fillProfesion() {
		driver.findElement(comboBoxProfesion).click();
		driver.findElement(comboboxProfesionvalueProfesion1).click();
		sleep(null);
	}

	public void fillTabDatosRelativosAlProcedimientoParaSolicitante() {
		clickOnUsuarioSolicitante();
		fillDenominacionDelTituloSolicitante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillProfesion();
	}

	// Tab Solicitante

	public void clickOnButtonSolicitante() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonSolicitante)).click().perform();
		sleep(null);
	}

	public void fillGenero() {
		driver.findElement(radioButtonGenero).click();
		sleep(null);
	}

	public void fillPaisDeNacimientoSolicitante() {
		driver.findElement(comboboxPaisDeNacimineto).click();
		driver.findElement(comboboxPaisDeNaciminetoValueSpain).click();
		sleep(null);
	}

	public void fillFechaDeNacimientoSolicitante() {
		driver.findElement(datePickerFechaDeNacimiento).click();
		driver.findElement(datePickerFechaDeNacimiento).sendKeys("09/06/2020");
		sleep(null);
	}

	public void fillNationalidadSolicitante() {
		driver.findElement(comboboxNationalidad).click();
		driver.findElement(comboboxNationalidadValueSpain).click();
		sleep(null);
	}

	public void fillTabSolicitanteParaSolicitante() {
		clickOnButtonSolicitante();
		fillGenero();
		fillPaisDeNacimientoSolicitante();
		fillFechaDeNacimientoSolicitante();
		fillNationalidadSolicitante();
	}

	// Tab Representante

	public void clickOnButtonRepresentante() {
		driver.findElement(buttonRepresentante).click();
		sleep(null);
	}

	public void fillTabRepresentanteParaSolicitante() {
		clickOnButtonRepresentante();
	}

	// Tab Datos De Notification

	public void clickOnButtonDatosDeNotificacion() {
		driver.findElement(buttonDatosDeNotificacion).click();
		sleep(null);
	}

	public void fillTelefonoMovilDatosDeNotification() {
		driver.findElement(textBoxTelefonoMovilDatosdeNotification).click();
		driver.findElement(textBoxTelefonoMovilDatosdeNotification).sendKeys("606060606");
		sleep(null);
	}

	public void fillTelefonoFijoDatosDeNotification() {
		driver.findElement(textBoxTelefonoFijoDatosDeNotification).click();
		driver.findElement(textBoxTelefonoFijoDatosDeNotification).sendKeys("606060606");
		sleep(null);
	}

	public void fillEmailDatosDeNotificationSinPostales() {
		driver.findElement(textBoxEmailDatosDeNotificationSinPostales).click();
		driver.findElement(textBoxEmailDatosDeNotificationSinPostales).sendKeys("Test@email.es");
		sleep(null);
	}

	public void fillTabDatosDeNotificacion() {
		clickOnButtonDatosDeNotificacion();
		fillTelefonoMovilDatosDeNotification();
		fillTelefonoFijoDatosDeNotification();
		fillEmailDatosDeNotificationSinPostales();
	}

	// Tab Documentation

	public void clickOnButtonDocumentacion() {
		driver.findElement(buttonDocumentacion).click();
		sleep(null);
	}

	public void uploadDocumentAction() {
		WebElement fileInput = driver.findElement(By.id("file"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("file"));
		js.executeScript("arguments[0].setAttribute('style', 'left:30px')", element);
		fileInput.sendKeys(prop.getProperty("DATA_FILE"));
		driver.findElement(checkBoxVeracidadDeDocument).click();
		driver.findElement(buttonAnadirDocumentPopup).click();
		sleep(null);
	}

	public void uploadAcreditativoIdentidadNacionalidad() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirAcreditativoIdentidadNacionalidad)).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadDeclaracionResponsable() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc1));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirDeclaracionResponsable)).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadTituloAcadémicoCertificadoUniversidad() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc2));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirTituloAcadémicoCertificadoUniversidad)).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadCertificacionAcademicaLosEstudiosRealizados() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc3));
		driver.findElement(buttonAnadirCertificacionAcademicaEstudiosRealizados).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadAcreditacionCompetenciaLinguistica() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc4));
		driver.findElement(buttonAnadirAcreditacionCompetenciaLinguistica).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadOtrosDocumentos() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc5));
		driver.findElement(buttonAnadirOtrosDocumentos).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void fillTabDocumentacion() {
		clickOnButtonDocumentacion();
		uploadAcreditativoIdentidadNacionalidad();
		uploadDeclaracionResponsable();
		uploadTituloAcadémicoCertificadoUniversidad();
		uploadCertificacionAcademicaLosEstudiosRealizados();
		uploadAcreditacionCompetenciaLinguistica();
		uploadOtrosDocumentos();
	}

	// Tab Pago De Tasas

	public void clickOnButtonPagosDeTasas() {

		wait.until(ExpectedConditions.elementToBeClickable(buttonActualizarOtroDoc1ConDIS));
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonPagosDeTasas)).click().perform();
		sleep(null);
	}

	public void chooseTarjetaDeCredito() {
		// Click on "Tarjeta de crédito" Radio button
		driver.findElement(radioButtonPagoOnline).click();
		sleep(null);

		// Click on "Continuar con el Pago"
		driver.findElement(buttonContinuarConElPagoTC).click();
		sleep(null);
	}

	public void fillTabPagosDeTasas() {
		clickOnButtonPagosDeTasas();
		chooseTarjetaDeCredito();
	}

	// Tab Presentacion

	public void clickOnButtonPresentacion() {
		driver.findElement(buttonPresentacion).click();
		sleep(null);
	}

	public void fillObservacionesDePresentacion() {
		driver.findElement(textBoxObservaciones).click();
		driver.findElement(textBoxObservaciones).sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis.");
		sleep(null);
	}

	public void clickOnCheckBoxAceptarCondiciones() {
		driver.findElement(checkBoxAceptarCondiciones).click();
		sleep(null);
	}

	public void clickOnButtonRevisarYFirmar() {
		driver.findElement(buttonRevisarYFirmar).click();
		sleep(null);
	}

	public void fillTabPresentacion() {
		clickOnButtonPresentacion();
		fillObservacionesDePresentacion();
		clickOnCheckBoxAceptarCondiciones();
		clickOnButtonRevisarYFirmar();
	}

	// Asserts

	public void assertTipoDeSolicitudFP() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxTipoDeSolicitudFP));
	}

	public void assertDenominacionDelTítuloSolicitanteFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxDenominacionDelTítuloFP,
				"Prueba_Auto_Solicitante"));
	}

	public void assertDenominacionDelTítuloRepresentanteFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxDenominacionDelTítuloFP,
				"Prueba_Auto_Representante"));
	}

	public void assertFechaInicioFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxFechaInicioFP, "01/01/2019"));
	}

	public void assertFechaFinFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxFechaFinFP, "01/01/2020"));
	}

	public void assertUniversidadFP() {
		scrollDown();
		wait.until(
				ExpectedConditions.textToBePresentInElementValue(textBoxUniversidadFP, "Test_Automatico_Universidad"));
	}

	public void assertPaisFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxPaisFP, "España"));
	}

	public void assertProfesionFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxProfesionFP, "Abogado"));
	}

	public void assertProfesionAccriditacionFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxProfesionFP, "Abogado"));
	}

	public void assertNombreFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxNombreFP, "Ciudadano"));
	}

	public void assertNombreParaRepresentanteFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxNombreFP, "Apollo"));
	}

	public void assertPrimerApellidoFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxPrimerApellidoFP, "Ficticio"));
	}

	public void assertPrimerApellidoParaRepresentanteFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxPrimerApellidoFP, "Taurus"));
	}

	public void assertSegundoApellidoFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxSegundoApellidoFP, ""));
	}

	public void assertSegundoApellidoParaRepresentanteFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxSegundoApellidoFP, "Medusa"));
	}

	public void assertGeneroFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxGeneroFP, "H"));
	}

	public void assertPaisDeNaciminetoFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxPaisDeNacimientoFP, "España"));
	}

	public void assertFechaDeNaciminetoFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxFechaDeNacimientoFP, "09/06/2020"));
	}

	public void assertNacionalidadFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxNacionalidadFP, "Spanish"));
	}

	public void assertTipoDeDocumentoFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxTipoDeDocumentoFP, "DNI"));
	}

	public void assertPaisDelDocumentoFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxPaisDelDocumentoFP, "España"));
	}

	public void assertNumDocumentoFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxNumdocumentoFP, "99999018D"));
	}

	public void assertNumDocumentoPararepresentanteFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxNumdocumentoFP, "99999018D"));
	}

	public void assertRazonFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxRazonFP, "Prueba_Razon"));
	}

	public void assertTipoDocumentoRepresentanteFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxTipoDocumentoRepresentanteFP, "DNI"));
	}

	public void assertNumDocumentoRepresentanteJuridicaFP() {
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxNumDocumentoRepresentanteFP, "99999018D"));
	}

	public void assertNumDocumentoRepresentanteFisicaFP() {
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxNumDocumentoRepresentanteFP, "99999018D"));
	}

	public void assertTelefonoRepresentanteFP() {
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxTelefonoRepresentanteFP, "606060606"));
	}

	public void assertTelefonoFijoFP() {
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxTelefonoFijoFP, "606060606"));
	}

	public void assertTelefonoMovilFP() {
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxTelefonoMovilFP, "606060606"));
	}

	public void assertEmailDatosElectroFP() {
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxEmailDatosElectroFP, "Test@email.es"));
	}

	public void assertDocumenApudActa() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxApudActaValueFP));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxApudActaFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoAcreditativoIdentidadNacionalidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoDeclaracionResponsableFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoDeclaracionResponsableRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoTituloAcademicoCertificadoUniversidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(TextBoxTituloAcademicoCertificadoUniversidadFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoCertificacionAcademicaEstudiosRealizadosFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoAcreditacionCompetenciaLinguisticaFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditacionCompetenciaLinguisticaFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoAcreditacionCompetenciaLinguisticaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditacionCompetenciaLinguisticaRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoOtrosDocumentosFP() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosFPTextValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoOtrosDocumentosReconocimientoFP() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosReconocimientoFPValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosReconocimientoFPTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoOtrosDocumentosFPRepresentante() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosFPRepresentanteValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPRepresentanteTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertDocumentoOtrosDocumentosRepresentanteReconocimientoFP() {
		scrollDown();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(textBoxOtrosDocumentosFPRepresentanteReconocimientoValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPRepresentanteReconocimientoTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void assertObservacionesFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxObservacionesFP,
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis."));
	}

	public void clickOnButtonFirmarYPresentarSolitanteFP() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentarSolicitanteFP)).click();
	}

	public void clickOnButtonFirmarYPresentar() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentar)).click();
	}

	public void assertSolicitudFirmadaYPresentada() {
		sleep(15000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxSolicitudFirmadaYPresentada));
		String expectedMessage = "En base a su solicitud se ha creado el";
		String message = driver.findElement(textBoxSolicitudFirmadaYPresentada).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: Documento invalid data or not found");
	}

	public void checkTabFirmaYPresentacionDeSolicitudDataParaSolicitante() {
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
		assertTelefonoFijoFP();
		assertTelefonoMovilFP();
		assertEmailDatosElectroFP();
		assertDocumentoAcreditativoIdentidadNacionalidadFP();
		assertDocumentoDeclaracionResponsableFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosFP();
		assertDocumentoAcreditacionCompetenciaLinguisticaFP();
		assertDocumentoOtrosDocumentosFP();
		assertObservacionesFP();
	}

}

package com.mcin.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.mcin.qa.base.TestBase;

public class SolicitudReconocimientoPage extends TestBase {
	// ====== Page Factory (Objects Repository) ====== //

	// Tab Datos Relativos Al Procedimiento
	// We us @CacheLookup annotation in order to store the element Xpath in the
	// cache in order
	// to speed up the Xpath search procedur and speed up the test framework
	// performance

	private By buttonReconocimiento = By.xpath("//*[@alt=\"Reconocimiento\"]");
	private By tabDatosRelativosAlProcedimiento = By.xpath("//*[@data-ui-sref=\"tituloSolicitud\"]");
	private By radioButtonUsuarioRepresentante = By.xpath("//*[@value=\"REPRESENTANTE\"]");
	private By textBoxDenominacionDelTitulo = By.xpath(
			"(//input[@name=\"nombreTitulo\"][@class=\"form-control inputborder ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required\"])[2]");
	private By textBoxUniversidad = By.xpath("(//*[@name=\"nombreUniversidad\"])[1]");
	private By datePickerFechaInicioDRAP = By.xpath("//*[@id=\"fechaInicioMask\"]");
	private By datePickerFechaFinDRAP = By.xpath("//*[@id=\"fechaFinMask\"]");
	private By comboBoxPais = By.xpath("(//*[@name=\"idPaisUniversidad\"])[1]");
	private By comboBoxPaisvalueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	private By comboBoxProfesion = By.xpath("(//*[@name=\"idProfesion\"])[1]");
	private By comboboxProfesionvalueMaestroEnEducacionInfantil = By.xpath("(//*[@value=\"number:22\"])[6]");

	// Tab Solicitante

	private By buttonSolicitante = By.xpath("//*[@data-ng-click=\"next(buttonNext);\"]");
	private By radioButtonGenero = By.xpath("//*[@value=\"H\"]");
	private By datePickerFechaDeNacimiento = By.xpath("//*[@id=\"fechaNacimientoSolMask\"]");
	private By comboboxPaisDeNacimineto = By.xpath("(//*[@name=\"idPaisNacimientoSol\"])[1]");
	private By comboboxPaisDeNaciminetoValueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	private By comboboxNationalidad = By.xpath("(//*[@name=\"idNacionalidad\"])[1]");
	private By comboboxNationalidadValueSpain = By.xpath("(//*[@value=\"number:167\"])[6]");
	private By comboboxTipoDeDocumento = By.xpath("//*[@name=\"idTipoDocumentoSolElec\"]");
	private By comboboxTipoDeDocumentoValueDni = By.xpath("(//*[@value=\"number:1\"])[11]");
//	private By comboboxPaisDelDocumento = By.xpath("(//*[@name=\"idPaisDocumentoSolElec\"])[1]");
//	private By comboboxPaisDelDocumentoValueSpain = By.xpath("(//*[@value=\"number:164\"])[7]");
	private By textBoxNumDocumentoSolicitante = By.xpath("(//*[@name=\"numDocumentoSol\"])[2]");
	private By textBoxNombreSolicitante = By.xpath("//*[@name=\"nombreSol\"]");
	private By textBoxPrimerApellidoSolicitante = By.xpath("//*[@name=\"apellido1sol\"]");
	private By textBoxSegundoApellidoSolicitante = By.xpath("//*[@name=\"apellido2sol\"]");

	// Tab Representante

	private By buttonRepresentante = By.xpath("//*[@data-ui-sref=\"representanteSolicitud\"]");
	private By buttonAnadirDocumentApudActaPopup = By.xpath("//*[@data-ng-click=\"uploadFile()\"]");
	private By buttonActualizarDocumentApudActaPopup = By.xpath("//*[@value=\"Actualizar\"]");

	private By radiobuttonAdjuntarDocumentoApudActa = By.xpath("(//*[@name=\"optionsAPUD\"])[1]");
	private By buttonAnadirApudActa = By.xpath("(//*[@value=\"Añadir documento\"])[1]");

	// Tab Datos De Notification

	private By buttonDatosDeNotificacion = By.xpath("//*[@data-ng-click=\"next(buttonNext);\"]");
	private By textBoxTelefonoMovilDatosdeNotification = By.xpath("//*[@name=\"telefonoMovilSol\"]");
	private By textBoxTelefonoFijoDatosDeNotification = By.xpath("//*[@name=\"telefonoFijoSol\"]");
//	private By textBoxEmailDatosDeNotification = By.xpath("//*[@name=\"emailNot\"]");
	private By checkboxDatosPostales = By.xpath("(//*[@type=\"checkbox\"])[1]");
	private By comboboxPaisDatosPostales = By.xpath("(//*[@data-ng-model=\"solicitud.idPaisNot\"])[1]");
	private By comboboxPaisDatosPostalesValueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	private By textBoxDireccionDatosDeNotificationPostales = By.xpath("//*[@name=\"direccionNot\"]");
	private By textBoxCiudadDatosDeNotificationPostales = By.xpath("//*[@name=\"ciudadNot\"]");
	private By textBoxCodigoPostalDatosDeNotificationPostales = By.xpath("//*[@name=\"codigoPostalNot\"]");
	private By textBoxProvinciaDatosDeNotificationPostales = By.xpath("//*[@name=\"provinciaNot\"]");

	// Tab Documentacion

	private By buttonDocumentacion = By.xpath("//*[@data-ui-sref=\"documentacionSolicitud\"]");
	private By buttonAnadirDocumentPopup = By.xpath("(//*[@value=\"Añadir documento\"])[7]");
	private By buttonAnadirAcreditativoIdentidadNacionalidad = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Documento acreditativo de identidad' ,'acreditativo')\"]");
	private By buttonAnadirDeclaracionResponsable = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Declaracion responsable', 'responsable')\"]");
	private By buttonAnadirTituloAcadémicoCertificadoUniversidad = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Titulo Academico', 'academico')\"]");
	private By buttonAnadirCertificacionAcademicaEstudiosRealizados = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Certificacion de Estudios realizados', 'estudios')\"]");
	private By buttonAnadirOtrosDocumentos = By.xpath("//*[@data-ng-click=\"tipoDocumento('Otros','otros')\"]");
	private By buttonActualizarDoc1 = By.xpath(
			"//*[@data-ng-click=\"tipoDocumento('Documento acreditativo de identidad', 'acreditativo');idDocumento(identidadFileId)\"]");
	private By buttonActualizarDoc2 = By.xpath(
			"//*[@data-ng-click=\"tipoDocumento('Declaracion responsable' , 'responsable');idDocumento(declarationResponsableFileId)\"]");
	private By buttonActualizarDoc3 = By
			.xpath("//*[@data-ng-click=\"tipoDocumento('Titulo Academico', 'academico');idDocumento(tituloFileId)\"]");
	private By buttonActualizarDoc4 = By.xpath(
			"//*[@data-ng-click=\"tipoDocumento('Certificacion de Estudios realizados' , 'estudios');idDocumento(certificationFileId)\"]");

	// Tab Presentacion

	private By buttonPresentacion = By.xpath("//*[@data-ui-sref=\"presentacionSolicitud\"]");
	private By buttonRevisarYFirmar = By.xpath("//*[@data-ng-click=\"goToFirmar('presentarSolicitud')\"]");
	private By textBoxObservaciones = By.xpath("//*[@id=\"observaciones\"]");
	private By checkBoxAceptarCondiciones = By.xpath("//*[@id=\"AceptarCondiciones\"]");

	// Tab Firmar Y Presentar

	private By textBoxTipoDeSolicitudFP = By.xpath("//*[@data-ng-model=\"procedimientoDB.nombre\"]");
	private By textBoxDenominacionDelTítuloFP = By.xpath("//*[@data-ng-model=\"solicitud.nombreTitulo\"]");
	private By textBoxFechaInicioFP = By.xpath("//*[@data-ng-model=\"solicitud.fechaInicio\"]");
	private By textBoxFechaFinFP = By.xpath("//*[@data-ng-model=\"solicitud.fechaFin\"]");
	private By textBoxUniversidadFP = By.xpath("//*[@data-ng-model=\"solicitud.nombreUniversidad\"]");
	private By textBoxPaisFP = By.xpath("//*[@data-ng-model=\"pais.nombre\"]");
	private By textBoxProfesionFP = By.xpath("//*[@data-ng-model=\"profesionDB.denominacion\"]");
	private By textBoxNombreFP = By.xpath("//*[@data-ng-model=\"solicitud.nombreSol\"]");
	private By textBoxPrimerApellidoFP = By.xpath("//*[@data-ng-model=\"solicitud.apellido1sol\"]");
	private By textBoxSegundoApellidoFP = By.xpath("//*[@data-ng-model=\"solicitud.apellido2sol\"]");
	private By textBoxGeneroFP = By.xpath("//*[@data-ng-model=\"solicitud.sexoSol\"]");
	private By textBoxPaisDeNacimientoFP = By.xpath("(//*[@data-ng-model=\"pais.nombre\"])[2]");
	private By textBoxFechaDeNacimientoFP = By.xpath("//*[@data-ng-model=\"solicitud.fechaNacimientoSol\"]");
	private By textBoxNacionalidadFP = By.xpath("//*[@data-ng-model=\"nacionalidad.nacionalidad\"]");
	private By textBoxTipoDeDocumentoFP = By.xpath("//*[@data-ng-model=\"tipoDocumentoIdentidadDB.tipo\"]");
	private By textBoxPaisDelDocumentoFP = By.xpath("(//*[@data-ng-model=\"pais.nombre\"])[3]");
	private By textBoxNumdocumentoFP = By.xpath("//*[@data-ng-model=\"solicitud.numDocumentoSol\"]");
	private By textBoxTelefonoFijoFP = By.xpath("//*[@data-ng-model=\"solicitud.telefonoFijoSol\"]");
	private By textBoxTelefonoMovilFP = By.xpath("//*[@data-ng-model=\"solicitud.telefonoMovilSol\"]");
	private By textBoxPaisDatosPostalesFP = By.xpath("(//*[@data-ng-model=\"pais.nombre\"])[4]");
	private By textBoxDireccionDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.direccionNot\"]");
	private By textBoxCodigoPostalDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.codigoPostalNot\"]");
	private By textBoxCiudadDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.ciudadNot\"]");
	private By textBoxProvinciaDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.provinciaNot\"]");
//	private By textBoxEmailDatosElectroFP = By.xpath("//*[@data-ng-model=\"solicitud.emailNot\"]");
	private By textBoxAcreditativoIdentidadNacionalidadFP = By.xpath("(//*[@class=\"dashed mtop15\"])[1]");
	private By textBoxDeclaracionResponsableFP = By.xpath("(//*[@class=\"dashed mtop15\"])[2]");
	private By textBoxTituloAcademicoCertificadoUniversidadFP = By.xpath("(//*[@class=\"dashed mtop15\"])[3]");
	private By textBoxCertificacionAcademicaEstudiosRealizadosFP = By.xpath("(//*[@class=\"dashed mtop15\"])[4]");
	private By textBoxOtrosDocumentosFPTextValue = By.xpath("//*[@data-ng-repeat=\"documento in otrosDocumentos\"]");
	private By textBoxObservacionesFP = By.xpath("//*[@id=\"observaciones\"]");
	private By textBoxSolicitudFirmadaYPresentada = By.xpath("//*[@class=\"alert alert-dismissible\"]");
	private By textBoxTipoDocumentoRepresentanteFP = By
			.xpath("(//*[@data-ng-model=\"tipoDocumentoIdentidadDB.tipo\"])[2]");
	private By textBoxNumDocumentoRepresentanteFP = By.xpath("//*[@data-ng-model=\"solicitud.numDocumentoRep\"]");
	private By textBoxApudActaFP = By.xpath("(//*[@class=\"dashed mtop15\"])[1]");
	private By textBoxAcreditativoIdentidadNacionalidadRepresentanteFP = By.xpath("(//*[@class=\"dashed mtop15\"])[2]");
	private By textBoxDeclaracionResponsableRepresentanteFP = By.xpath("(//*[@class=\"dashed mtop15\"])[3]");
	private By TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP = By
			.xpath("(//*[@class=\"dashed mtop15\"])[4]");
	private By textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP = By
			.xpath("(//*[@class=\"dashed mtop15\"])[5]");
	private By textBoxOtrosDocumentosFPRepresentanteTextValue = By.xpath("(//*[@class=\"dashed mtop15\"])[6]");

	// Pantalla enviar solicitud

	private By buttonFirmarYPresentarFP = By.xpath("//*[@data-ng-click=\"goToFirmar('firmarSolicitud')\"]");
	private By buttonFirmarYPresentar = By.xpath("//*[@data-ng-click=\"firmarSolicitud(idSolicitud)\"]");

	// ======================================================================//

	// ====== Actions ====== //

	// Tab Datos Relativos Al Procedimiento

	public void clickOnButtonReconocimiento() {
		sleep(2000L);
		driver.findElement(buttonReconocimiento).click();
		sleep(null);
	}

	private void clickOnButtonDatosRelativosAlProcedimiento() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(tabDatosRelativosAlProcedimiento)).click().perform();
		sleep(null);
	}

	private void clickOnUsuarioRepresentante() {
		sleep(2000L);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(radioButtonUsuarioRepresentante)).click().perform();
		sleep(3000L);
	}

	private void fillDenominacionDelTituloSolicitante() {
		driver.findElement(textBoxDenominacionDelTitulo).click();
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Solicitante");
		sleep(null);
	}

	private void fillDenominacionDelTituloRepresentante() {
		driver.findElement(textBoxDenominacionDelTitulo).click();
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Representante");
		sleep(null);
	}

	private void fillFechainicio() {
		driver.findElement(datePickerFechaInicioDRAP).click();
		driver.findElement(datePickerFechaInicioDRAP).sendKeys("01/01/2019");
		sleep(null);
	}

	private void fillFechaFin() {
		driver.findElement(datePickerFechaFinDRAP).click();
		driver.findElement(datePickerFechaFinDRAP).sendKeys("01/01/2020");
		sleep(null);
	}

	private void fillUniversidad() {
		driver.findElement(textBoxUniversidad).sendKeys("Test_Automatico_Universidad");
		sleep(null);
	}

	private void fillPais() {
		driver.findElement(comboBoxPais).click();
		driver.findElement(comboBoxPaisvalueSpain).click();
		sleep(null);
	}

	private void fillProfesion() {
		driver.findElement(comboBoxProfesion).click();
		driver.findElement(comboboxProfesionvalueMaestroEnEducacionInfantil).click();
		sleep(3000L);
	}

	public void fillTabDatosRelativosAlProcedimientoParaSolicitante() {
		// clickOnUsuarioSolicitante();
		fillDenominacionDelTituloSolicitante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillProfesion();
	}

	public void fillTabDatosRelativosAlProcedimientoParaRepresentante() {
		clickOnUsuarioRepresentante();
		fillDenominacionDelTituloRepresentante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillProfesion();
		clickOnButtonSolicitante();
		clickOnButtonDatosRelativosAlProcedimiento();
		clickOnUsuarioRepresentante();
	}

	// Tab Solicitante

	private void clickOnButtonSolicitante() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonSolicitante)).click().perform();
		sleep(null);
	}

	private void fillGenero() {
		driver.findElement(radioButtonGenero).click();
		sleep(null);
	}

	private void fillPaisDeNacimientoSolicitante() {
		driver.findElement(comboboxPaisDeNacimineto).click();
		driver.findElement(comboboxPaisDeNaciminetoValueSpain).click();
		sleep(null);
	}

	private void fillFechaDeNacimientoSolicitante() {
		driver.findElement(datePickerFechaDeNacimiento).click();
		driver.findElement(datePickerFechaDeNacimiento).sendKeys("09/06/2020");
		sleep(null);
	}

	private void fillNationalidadSolicitante() {
		driver.findElement(comboboxNationalidad).click();
		driver.findElement(comboboxNationalidadValueSpain).click();
		sleep(null);
	}

	private void fillNombreSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNombreSolicitante)).click();
		driver.findElement(textBoxNombreSolicitante).sendKeys("Apollo");
		sleep(null);
	}

	private void fillPrimerApellidoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPrimerApellidoSolicitante)).click();
		driver.findElement(textBoxPrimerApellidoSolicitante).sendKeys("Taurus");
		sleep(null);
	}

	private void fillSegundoApellidoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxSegundoApellidoSolicitante)).click();
		driver.findElement(textBoxSegundoApellidoSolicitante).sendKeys("Medusa");
		sleep(null);
	}

	private void fillTipoDeDocumentoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumento)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumentoValueDni)).click();
		sleep(null);
	}

//	private void fillPaisDelDocumentoSolicitante() {
//		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDelDocumento)).click();
//		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDelDocumentoValueSpain)).click();
//		sleep(null);
//	}

	private void fillNumDocumentoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNumDocumentoSolicitante)).click();
		driver.findElement(textBoxNumDocumentoSolicitante).sendKeys("99999018D");
		sleep(null);
	}

	public void fillTabSolicitanteParaSolicitante() {
		clickOnButtonSolicitante();
		fillGenero();
		fillPaisDeNacimientoSolicitante();
		fillFechaDeNacimientoSolicitante();
		fillNationalidadSolicitante();
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
//		fillPaisDelDocumentoSolicitante();
		fillNumDocumentoSolicitante();
	}

	// Tab Representante

	private void clickOnButtonRepresentante() {
		driver.findElement(buttonRepresentante).click();
		sleep(null);
	}

	public void fillTabRepresentanteParaSolicitante() {
		clickOnButtonRepresentante();
	}

	private void uploadApudActaRF() {
		wait.until(ExpectedConditions.elementToBeClickable(radiobuttonAdjuntarDocumentoApudActa)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirApudActa)).click();
		uploadDocumentApudActaAction();
		sleep(null);
	}

	private void uploadDocumentApudActaAction() {
		WebElement fileInput = driver.findElement(By.id("file"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("file"));
		js.executeScript("arguments[0].setAttribute('style', 'left:30px')", element);
		fileInput.sendKeys(prop.getProperty("DATA_FILE"));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirDocumentApudActaPopup)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonActualizarDocumentApudActaPopup));
		scrollDown();
		sleep(null);
	}

	public void fillTabRepresentanteParaRepresentanteFisica() {
		clickOnButtonRepresentante();
		uploadApudActaRF();
	}

	// Tab Datos De Notification

	private void clickOnButtonDatosDeNotificacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonDatosDeNotificacion)).click().perform();
		sleep(null);
	}

	private void fillTelefonoMovilDatosDeNotification() {
		driver.findElement(textBoxTelefonoMovilDatosdeNotification).click();
		driver.findElement(textBoxTelefonoMovilDatosdeNotification).sendKeys("0606060606");
		sleep(null);
	}

	private void fillTelefonoFijoDatosDeNotification() {
		driver.findElement(textBoxTelefonoFijoDatosDeNotification).click();
		driver.findElement(textBoxTelefonoFijoDatosDeNotification).sendKeys("0606060606");
		sleep(null);
	}

	private void clickOnCheckboxDatosDeNotificationPostales() {
		driver.findElement(checkboxDatosPostales).click();
		sleep(null);
	}

	private void fillPaisDatosPostales() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDatosPostales)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDatosPostalesValueSpain)).click();
		sleep(null);
	}

	private void fillDireccionDatosDeNotificationPostales() {
		driver.findElement(textBoxDireccionDatosDeNotificationPostales).click();
		driver.findElement(textBoxDireccionDatosDeNotificationPostales).sendKeys("TESTDireccion");
		sleep(null);
	}

	private void fillCiudadDatosDeNotificationPostales() {
		driver.findElement(textBoxCiudadDatosDeNotificationPostales).click();
		driver.findElement(textBoxCiudadDatosDeNotificationPostales).sendKeys("TESTCiudad");
		sleep(null);
	}

	private void fillCodigoPostalDatosDeNotificationPostales() {
		driver.findElement(textBoxCodigoPostalDatosDeNotificationPostales).click();
		driver.findElement(textBoxCodigoPostalDatosDeNotificationPostales).sendKeys("34001");
		sleep(null);
	}

	private void fillProvinciaPostalDatosDeNotificationPostales() {
		driver.findElement(textBoxProvinciaDatosDeNotificationPostales).click();
		driver.findElement(textBoxProvinciaDatosDeNotificationPostales).sendKeys("TESTProvincia");
		sleep(null);
	}

//	private void fillEmailDatosDeNotificationPostales() {
//		driver.findElement(textBoxEmailDatosDeNotification).click();
//		driver.findElement(textBoxEmailDatosDeNotification).sendKeys("Test@email.es");
//		sleep(null);
//	}

	public void fillTabDatosDeNotificacion() {
		clickOnButtonDatosDeNotificacion();
		fillTelefonoMovilDatosDeNotification();
		fillTelefonoFijoDatosDeNotification();
		clickOnCheckboxDatosDeNotificationPostales();
		fillPaisDatosPostales();
		fillDireccionDatosDeNotificationPostales();
		fillCiudadDatosDeNotificationPostales();
		fillCodigoPostalDatosDeNotificationPostales();
		fillProvinciaPostalDatosDeNotificationPostales();
		// fillEmailDatosDeNotificationPostales();

	}
	// Tab Documentation

	private void clickOnButtonDocumentacion() {
		driver.findElement(buttonDocumentacion).click();
		sleep(null);
	}

	private void uploadDocumentAction() {
		WebElement fileInput = driver.findElement(By.id("file"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("file"));
		js.executeScript("arguments[0].setAttribute('style', 'left:30px')", element);
		fileInput.sendKeys(prop.getProperty("DATA_FILE"));
		driver.findElement(buttonAnadirDocumentPopup).click();
		sleep(null);
	}

	private void uploadAcreditativoIdentidadNacionalidad() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirAcreditativoIdentidadNacionalidad)).click();
		uploadDocumentAction();
		sleep(null);
	}

	private void uploadDeclaracionResponsable() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc1));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirDeclaracionResponsable)).click();
		uploadDocumentAction();
		sleep(null);
	}

	private void uploadTituloAcadémicoCertificadoUniversidad() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc2));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirTituloAcadémicoCertificadoUniversidad)).click();
		uploadDocumentAction();
		sleep(null);
	}

	private void uploadCertificacionAcademicaLosEstudiosRealizados() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc3));
		driver.findElement(buttonAnadirCertificacionAcademicaEstudiosRealizados).click();
		uploadDocumentAction();
		sleep(null);
	}

	private void uploadOtrosDocumentos() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc4));
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
		uploadOtrosDocumentos();
	}

	// Tab Presentacion

	private void clickOnButtonPresentacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonPresentacion)).click().perform();
		sleep(null);
	}

	private void fillObservacionesDePresentacion() {
		driver.findElement(textBoxObservaciones).click();
		driver.findElement(textBoxObservaciones).sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis.");
		sleep(null);
	}

	private void clickOnCheckBoxAceptarCondiciones() {
		driver.findElement(checkBoxAceptarCondiciones).click();
		sleep(null);
	}

	private void clickOnButtonRevisarYFirmar() {
		driver.findElement(buttonRevisarYFirmar).click();
		sleep(null);
	}

	public void fillTabPresentacion() {
		clickOnButtonPresentacion();
		fillObservacionesDePresentacion();
		clickOnCheckBoxAceptarCondiciones();
		clickOnButtonRevisarYFirmar();
	}

	// Pantalla enviar solicitud

	private void clickOnButtonFirmarYPresentarFP() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentarFP)).click();
	}

	private void clickOnButtonFirmarYPresentar() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentar)).click();
	}

	public void enviarSolicitud() {
		clickOnButtonFirmarYPresentarFP();
		clickOnButtonFirmarYPresentar();
	}

	// Asserts

	private void assertTipoDeSolicitudFP() {
		sleep(5000L);
		String expectedMessage = "Reconocimiento";
		String message = driver.findElement(textBoxTipoDeSolicitudFP).getAttribute("value");
		System.out.println("This is the expected message: " + " " + message);
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		scrollDown();
	}

	private void assertDenominacionDelTítuloSolicitanteFP() {
		scrollDown();
		String expectedMessage = "Prueba_Auto_Solicitante";
		String message = driver.findElement(textBoxDenominacionDelTítuloFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertDenominacionDelTítuloRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Prueba_Auto_Representante";
		String message = driver.findElement(textBoxDenominacionDelTítuloFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertFechaInicioFP() {
		scrollDown();
		String expectedMessage = "01/01/2019";
		String message = driver.findElement(textBoxFechaInicioFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertFechaFinFP() {
		scrollDown();
		String expectedMessage = "01/01/2020";
		String message = driver.findElement(textBoxFechaFinFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertUniversidadFP() {
		scrollDown();
		String expectedMessage = "Test_Automatico_Universidad";
		String message = driver.findElement(textBoxUniversidadFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertPaisFP() {
		scrollDown();
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertProfesionFP() {
		scrollDown();
		String expectedMessage = "Maestro en educación infantil";
		String message = driver.findElement(textBoxProfesionFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertNombreFP() {
		scrollDown();
		String expectedMessage = "Ciudadano";
		String message = driver.findElement(textBoxNombreFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertNombreParaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Apollo";
		String message = driver.findElement(textBoxNombreFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertPrimerApellidoFP() {
		scrollDown();
		String expectedMessage = "Ficticio";
		String message = driver.findElement(textBoxPrimerApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertPrimerApellidoParaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Taurus";
		String message = driver.findElement(textBoxPrimerApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertSegundoApellidoFP() {
		scrollDown();
		String expectedMessage = "";
		String message = driver.findElement(textBoxSegundoApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertSegundoApellidoParaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Medusa";
		String message = driver.findElement(textBoxSegundoApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertGeneroFP() {
		scrollDown();
		String expectedMessage = "H";
		String message = driver.findElement(textBoxGeneroFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertPaisDeNaciminetoFP() {
		scrollDown();
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisDeNacimientoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertFechaDeNaciminetoFP() {
		scrollDown();
		String expectedMessage = "09/06/2020";
		String message = driver.findElement(textBoxFechaDeNacimientoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertNacionalidadFP() {
		scrollDown();
		String expectedMessage = "Español";
		String message = driver.findElement(textBoxNacionalidadFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertTipoDeDocumentoFP() {
		String expectedMessage = "DNI";
		String message = driver.findElement(textBoxTipoDeDocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertPaisDelDocumentoFP() {
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisDelDocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertNumDocumentoFP() {
		String expectedMessage = "99999018D";
		String message = driver.findElement(textBoxNumdocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertNumDocumentoPararepresentanteFP() {
		String expectedMessage = "99999018D";
		String message = driver.findElement(textBoxNumdocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertTelefonoFijoFP() {
		String expectedMessage = "0606060606";
		String message = driver.findElement(textBoxTelefonoFijoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertTelefonoMovilFP() {
		String expectedMessage = "0606060606";
		String message = driver.findElement(textBoxTelefonoMovilFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertPaisDatosPostalesFP() {
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertDireccionDatosPostalesFP() {
		String expectedMessage = "TESTDireccion";
		String message = driver.findElement(textBoxDireccionDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertCodigoPostalDatosPostalesFP() {
		String expectedMessage = "34001";
		String message = driver.findElement(textBoxCodigoPostalDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertCiudadDatosPostalesFP() {
		String expectedMessage = "TESTCiudad";
		String message = driver.findElement(textBoxCiudadDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertProvinciaDatosPostalesFP() {
		String expectedMessage = "TESTProvincia";
		String message = driver.findElement(textBoxProvinciaDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

//	private void assertEmailDatosElectroFP() {
//		String expectedMessage = "Test@email.es";
//		String message = driver.findElement(textBoxEmailDatosElectroFP).getAttribute("value");
//		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
//	}

	private void assertTipoDocumentoRepresentanteFP() {
		scrollDown();
		String expectedMessage = "DNI";
		String message = driver.findElement(textBoxTipoDocumentoRepresentanteFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertNumDocumentoRepresentanteFisicaFP() {
		String expectedMessage = "99999018D";
		String message = driver.findElement(textBoxNumDocumentoRepresentanteFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertDocumenApudActa() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxApudActaFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);
	}

	private void assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");

	}

	private void assertDocumentoDeclaracionResponsableRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");

	}

	private void assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");

	}

	private void assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");

	}

	private void assertDocumentoOtrosDocumentosFPRepresentante() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPRepresentanteTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");

	}

	private void assertDocumentoAcreditativoIdentidadNacionalidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertDocumentoDeclaracionResponsableFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertDocumentoTituloAcademicoCertificadoUniversidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxTituloAcademicoCertificadoUniversidadFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertDocumentoCertificacionAcademicaEstudiosRealizadosFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertDocumentoOtrosDocumentosFP() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosFPTextValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	private void assertObservacionesFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxObservacionesFP,
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis."));
	}

	public void assertSolicitudFirmadaYPresentada() {
		sleep(40000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxSolicitudFirmadaYPresentada));
		String expectedMessage = "En base a su solicitud se ha creado el Expediente";
		String message = driver.findElement(textBoxSolicitudFirmadaYPresentada).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertTabFirmaYPresentacionDeSolicitudDataParaSolicitante() {
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
		assertPaisDatosPostalesFP();
		assertDireccionDatosPostalesFP();
		assertCodigoPostalDatosPostalesFP();
		assertCiudadDatosPostalesFP();
		assertProvinciaDatosPostalesFP();
//			assertEmailDatosElectroFP();
		assertDocumentoAcreditativoIdentidadNacionalidadFP();
		assertDocumentoDeclaracionResponsableFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosFP();
//			assertDocumentoAcreditacionCompetenciaLinguisticaFP();
		assertDocumentoOtrosDocumentosFP();
		assertObservacionesFP();
	}

	public void assertTabFirmaYPresentacionDeSolicitudDataParaRepresentanteFisica() {
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
		assertTelefonoFijoFP();
		assertTelefonoMovilFP();
		assertPaisDatosPostalesFP();
		assertDireccionDatosPostalesFP();
		assertCodigoPostalDatosPostalesFP();
		assertCiudadDatosPostalesFP();
		assertProvinciaDatosPostalesFP();
//	 		assertEmailDatosElectroFP();
		assertTipoDocumentoRepresentanteFP();
		assertNumDocumentoRepresentanteFisicaFP();
		assertDocumenApudActa();
		assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP();
		assertDocumentoDeclaracionResponsableRepresentanteFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP();
//			assertDocumentoAcreditacionCompetenciaLinguisticaRepresentanteFP();
		assertDocumentoOtrosDocumentosFPRepresentante();
		assertObservacionesFP();
	}
}

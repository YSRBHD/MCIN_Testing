package com.mcin.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import com.mcin.qa.base.TestBase;

public class SolicitudEquivalenciaPage extends TestBase {
	// ====== Page Factory (Objects Repository) ====== //

	// Tab Datos Relativos Al Procedimiento
	// We us @CacheLookup annotation in order to store the element Xpath in the
	// cache in order
	// to speed up the Xpath search procedur and speed up the test framework
	// performance

	By buttonEquivalencia = By.xpath("//*[@alt=\"Equivalencia\"]");
	By tabDatosRelativosAlProcedimiento = By.xpath("//*[@data-ui-sref=\"tituloSolicitud\"]");
	By radioButtonUsuarioSolicitante = By.xpath("(//*[@name=\"tipoUsuario\"])[1]");
	By radioButtonUsuarioRepresentante = By.xpath("(//*[@name=\"tipoUsuario\"])[2]");
	By textBoxDenominacionDelTitulo = By.xpath(
			"(//input[@name=\"nombreTitulo\"][@class=\"form-control inputborder ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required\"])[2]");
	By textBoxUniversidad = By.xpath("(//*[@name=\"nombreUniversidad\"])[1]");
	By datePickerFechaInicioDRAP = By.xpath("//*[@id=\"fechaInicioMask\"]");
	By datePickerFechaFinDRAP = By.xpath("//*[@id=\"fechaFinMask\"]");
	By comboBoxPais = By.xpath("(//*[@name=\"idPaisUniversidad\"])[1]");
	By comboBoxPaisvalueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	By comboBoxProfesion = By.xpath("(//*[@name=\"idProfesion\"])[1]");
	By comboboxProfesionvalueProfesion1 = By.xpath("(//*[@value=\"number:35\"])[6]");
	By comboBoxRamaDeConocimiento = By.xpath("(//*[@name=\"idRamaConocimiento\"])[1]");
	By comboboxRamaDeConocimientoArtesYHumanidades = By
			.xpath("(//*[@data-ng-value=\"ramaConocimientoDB.idRamaConocimiento\"])[1]");
	By radioButtonNivelAcademico = By.xpath("(//*[@name=\"optionsRadios\"])[1]");

	// Tab Solicitante

	By buttonSolicitante = By.xpath("//*[@data-ng-click=\"next(buttonNext);\"]");
	By radioButtonGenero = By.xpath("//*[@value=\"H\"]");
	By datePickerFechaDeNacimiento = By.xpath("//*[@id=\"fechaNacimientoSolMask\"]");
	By comboboxPaisDeNacimineto = By.xpath("(//*[@name=\"idPaisNacimientoSol\"])[1]");
	By comboboxPaisDeNaciminetoValueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	By comboboxNationalidad = By.xpath("(//*[@name=\"idNacionalidad\"])[1]");
	By comboboxNationalidadValueSpain = By.xpath("(//*[@value=\"number:167\"])[6]");
	By comboboxTipoDeDocumento = By.xpath("//*[@name=\"idTipoDocumentoSolElec\"]");
	By comboboxTipoDeDocumentoValueDni = By.xpath("(//*[@value=\"number:1\"])[11]");
	By comboboxPaisDelDocumento = By.xpath("(//*[@name=\"idPaisDocumentoSolElec\"])[1]");
	By comboboxPaisDelDocumentoValueSpain = By.xpath("(//*[@value=\"number:164\"])[7]");
	By textBoxNumDocumentoSolicitante = By.xpath("(//*[@name=\"numDocumentoSol\"])[2]");
	By textBoxNombreSolicitante = By.xpath("//*[@name=\"nombreSol\"]");
	By textBoxPrimerApellidoSolicitante = By.xpath("//*[@name=\"apellido1sol\"]");
	By textBoxSegundoApellidoSolicitante = By.xpath("//*[@name=\"apellido2sol\"]");

	// Tab Representante

	By buttonRepresentante = By.xpath("//*[@data-ui-sref=\"representanteSolicitud\"]");
	By buttonAnadirDocumentApudActaPopup = By.xpath("//*[@data-ng-click=\"uploadFile()\"]");
	By buttonActualizarDocumentApudActaPopup = By.xpath("//*[@value=\"Actualizar\"]");

	By radiobuttonAdjuntarDocumentoApudActa = By.xpath("(//*[@name=\"optionsAPUD\"])[1]");
	By buttonAnadirApudActa = By.xpath("(//*[@value=\"Añadir documento\"])[1]");

	// Tab Datos De Notification

	By buttonDatosDeNotificacion = By.xpath("//*[@data-ng-click=\"next(buttonNext);\"]");
	By textBoxTelefonoMovilDatosdeNotification = By.xpath("//*[@name=\"telefonoMovilSol\"]");
	By textBoxTelefonoFijoDatosDeNotification = By.xpath("//*[@name=\"telefonoFijoSol\"]");
	By textBoxEmailDatosDeNotification = By.xpath("//*[@name=\"emailNot\"]");
	By checkboxDatosPostales = By.xpath("(//*[@type=\"checkbox\"])[1]");
	By comboboxPaisDatosPostales = By.xpath("(//*[@data-ng-model=\"solicitud.idPaisNot\"])[1]");
	By comboboxPaisDatosPostalesValueSpain = By.xpath("(//*[@value=\"number:164\"])[1]");
	By textBoxDireccionDatosDeNotificationPostales = By.xpath("//*[@name=\"direccionNot\"]");
	By textBoxCiudadDatosDeNotificationPostales = By.xpath("//*[@name=\"ciudadNot\"]");
	By textBoxCodigoPostalDatosDeNotificationPostales = By.xpath("//*[@name=\"codigoPostalNot\"]");
	By textBoxProvinciaDatosDeNotificationPostales = By.xpath("//*[@name=\"provinciaNot\"]");

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

	By textBoxTipoDeSolicitudFP = By.xpath("(//*[@type=\"text\"])[1]");
	By textBoxDenominacionDelTítuloFP = By.xpath("//*[@data-ng-model=\"solicitud.nombreTitulo\"]");
	By textBoxFechaInicioFP = By.xpath("//*[@data-ng-model=\"solicitud.fechaInicio\"]");
	By textBoxFechaFinFP = By.xpath("//*[@data-ng-model=\"solicitud.fechaFin\"]");
	By textBoxUniversidadFP = By.xpath("//*[@data-ng-model=\"solicitud.nombreUniversidad\"]");
	By textBoxPaisFP = By.xpath("//*[@data-ng-model=\"pais.nombre\"]");
	By textBoxRamaDeConocimiento = By.xpath("//*[@data-ng-model=\"ramaConocimientoDB.rama\"]");
	By textBoxProfesionFP = By.xpath("//*[@data-ng-model=\"profesionDB.denominacion\"]");
	By textBoxNombreFP = By.xpath("//*[@data-ng-model=\"solicitud.nombreSol\"]");
	By textBoxPrimerApellidoFP = By.xpath("//*[@data-ng-model=\"solicitud.apellido1sol\"]");
	By textBoxSegundoApellidoFP = By.xpath("//*[@data-ng-model=\"solicitud.apellido2sol\"]");
	By textBoxGeneroFP = By.xpath("//*[@data-ng-model=\"solicitud.sexoSol\"]");
	By textBoxPaisDeNacimientoFP = By.xpath("(//*[@data-ng-model=\"pais.nombre\"])[2]");
	By textBoxFechaDeNacimientoFP = By.xpath("//*[@data-ng-model=\"solicitud.fechaNacimientoSol\"]");
	By textBoxNacionalidadFP = By.xpath("//*[@data-ng-model=\"nacionalidad.nacionalidad\"]");
	By textBoxTipoDeDocumentoFP = By.xpath("//*[@data-ng-model=\"tipoDocumentoIdentidadDB.tipo\"]");
	By textBoxPaisDelDocumentoFP = By.xpath("(//*[@data-ng-model=\"pais.nombre\"])[3]");
	By textBoxNumdocumentoFP = By.xpath("//*[@data-ng-model=\"solicitud.numDocumentoSol\"]");
	By textBoxTelefonoFijoFP = By.xpath("//*[@data-ng-model=\"solicitud.telefonoFijoSol\"]");
	By textBoxTelefonoMovilFP = By.xpath("//*[@data-ng-model=\"solicitud.telefonoMovilSol\"]");
	By textBoxPaisDatosPostalesFP = By.xpath("(//*[@data-ng-model=\"pais.nombre\"])[4]");
	By textBoxDireccionDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.direccionNot\"]");
	By textBoxCodigoPostalDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.codigoPostalNot\"]");
	By textBoxCiudadDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.ciudadNot\"]");
	By textBoxProvinciaDatosPostalesFP = By.xpath("//*[@data-ng-model=\"solicitud.provinciaNot\"]");
	By textBoxEmailDatosElectroFP = By.xpath("//*[@data-ng-model=\"solicitud.emailNot\"]");
	By textBoxAcreditativoIdentidadNacionalidadFP = By.xpath("(//*[@class=\"dashed mtop15\"])[1]");
	By textBoxDeclaracionResponsableFP = By.xpath("(//*[@class=\"dashed mtop15\"])[2]");
	By textBoxTituloAcademicoCertificadoUniversidadFP = By.xpath("(//*[@class=\"dashed mtop15\"])[3]");
	By textBoxCertificacionAcademicaEstudiosRealizadosFP = By.xpath("(//*[@class=\"dashed mtop15\"])[4]");
	By textBoxAcreditacionCompetenciaLinguisticaFP = By.xpath("(//*[@class=\"dashed mtop15\"])[5]");
	By textBoxOtrosDocumentosFPTextValue = By.xpath("//*[@data-ng-repeat=\"documento in otrosDocumentos\"]");
	By textBoxObservacionesFP = By.xpath("//*[@id=\"observaciones\"]");
	By textBoxSolicitudFirmadaYPresentada = By.xpath("//*[@class=\"alert alert-dismissible\"]");
	By textBoxTipoDocumentoRepresentanteFP = By.xpath("(//*[@data-ng-model=\"tipoDocumentoIdentidadDB.tipo\"])[2]");
	By textBoxNumDocumentoRepresentanteFP = By.xpath("//*[@data-ng-model=\"solicitud.numDocumentoRep\"]");
	By textBoxApudActaFP = By.xpath("(//*[@class=\"dashed mtop15\"])[1]");
	By textBoxAcreditativoIdentidadNacionalidadRepresentanteFP = By.xpath("(//*[@class=\"dashed mtop15\"])[2]");
	By textBoxDeclaracionResponsableRepresentanteFP = By.xpath("(//*[@class=\"dashed mtop15\"])[3]");
	By TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP = By.xpath("(//*[@class=\"dashed mtop15\"])[4]");
	By textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP = By.xpath("(//*[@class=\"dashed mtop15\"])[5]");
	By textBoxAcreditacionCompetenciaLinguisticaRepresentanteFP = By.xpath("(//*[@class=\"dashed mtop15\"])[6]");
	By textBoxOtrosDocumentosFPRepresentanteTextValue = By.xpath("(//*[@class=\"dashed mtop15\"])[7]");

	// Pantalla enviar solicitud

	By buttonFirmarYPresentarFP = By.xpath("//*[@data-ng-click=\"goToFirmar('firmarSolicitud')\"]");
	By buttonFirmarYPresentar = By.xpath("//*[@data-ng-click=\"firmarSolicitud(idSolicitud)\"]");

	// ======================================================================//

	// ====== Actions ====== //

	// Tab Datos Relativos Al Procedimiento

	public void clickOnButtonEquivalencia() {
		driver.findElement(buttonEquivalencia).click();
		sleep(null);
	}

	public void clickOnButtonDatosRelativosAlProcedimiento() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(tabDatosRelativosAlProcedimiento)).click().perform();
		sleep(null);
	}

	public void clickOnUsuarioSolicitante() {
		driver.findElement(radioButtonUsuarioSolicitante).click();
		sleep(null);
	}

	public void clickOnUsuarioRepresentante() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(radioButtonUsuarioRepresentante)).click().perform();
		sleep(3000L);
	}

	public void fillDenominacionDelTituloSolicitante() {
		driver.findElement(textBoxDenominacionDelTitulo).click();
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Solicitante");
		sleep(null);
	}

	public void fillDenominacionDelTituloRepresentante() {
		driver.findElement(textBoxDenominacionDelTitulo).click();
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Representante");
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
		sleep(3000L);
	}

	public void clickOnNivelAcademico() {
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonNivelAcademico)).click();
		sleep(null);
	}

	public void fillRamaDeConocimiento() {
		driver.findElement(comboBoxRamaDeConocimiento).click();
		driver.findElement(comboboxRamaDeConocimientoArtesYHumanidades).click();
		sleep(null);
	}

	public void fillTabDatosRelativosAlProcedimientoParaSolicitante() {
		// clickOnUsuarioSolicitante();
		fillDenominacionDelTituloSolicitante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		clickOnNivelAcademico();
		fillRamaDeConocimiento();
	}

	public void fillTabDatosRelativosAlProcedimientoParaRepresentante() {
		clickOnUsuarioRepresentante();
		fillDenominacionDelTituloRepresentante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		clickOnNivelAcademico();
		fillRamaDeConocimiento();
		clickOnButtonSolicitante();
		clickOnButtonDatosRelativosAlProcedimiento();
		clickOnUsuarioRepresentante();
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

	public void fillNombreSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNombreSolicitante)).click();
		driver.findElement(textBoxNombreSolicitante).sendKeys("Apollo");
		sleep(null);
	}

	public void fillPrimerApellidoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPrimerApellidoSolicitante)).click();
		driver.findElement(textBoxPrimerApellidoSolicitante).sendKeys("Taurus");
		sleep(null);
	}

	public void fillSegundoApellidoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxSegundoApellidoSolicitante)).click();
		driver.findElement(textBoxSegundoApellidoSolicitante).sendKeys("Medusa");
		sleep(null);
	}

	public void fillTipoDeDocumentoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumento)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumentoValueDni)).click();
		sleep(null);
	}

	public void fillPaisDelDocumentoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDelDocumento)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDelDocumentoValueSpain)).click();
		sleep(null);
	}

	public void fillNumDocumentoSolicitante() {
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
		fillNumDocumentoSolicitante();
	}

	// Tab Representante

	public void clickOnButtonRepresentante() {
		driver.findElement(buttonRepresentante).click();
		sleep(null);
	}

	public void fillTabRepresentanteParaSolicitante() {
		clickOnButtonRepresentante();
	}

	public void uploadApudActaRF() {
		wait.until(ExpectedConditions.elementToBeClickable(radiobuttonAdjuntarDocumentoApudActa)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirApudActa)).click();
		uploadDocumentApudActaAction();
		sleep(null);
	}

	public void uploadDocumentApudActaAction() {
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

	public void clickOnButtonDatosDeNotificacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonDatosDeNotificacion)).click().perform();
		sleep(null);
	}

	public void fillTelefonoMovilDatosDeNotification() {
		driver.findElement(textBoxTelefonoMovilDatosdeNotification).click();
		driver.findElement(textBoxTelefonoMovilDatosdeNotification).sendKeys("0606060606");
		sleep(null);
	}

	public void fillTelefonoFijoDatosDeNotification() {
		driver.findElement(textBoxTelefonoFijoDatosDeNotification).click();
		driver.findElement(textBoxTelefonoFijoDatosDeNotification).sendKeys("0606060606");
		sleep(null);
	}

	public void clickOnCheckboxDatosDeNotificationPostales() {
		driver.findElement(checkboxDatosPostales).click();
		sleep(null);
	}

	public void fillPaisDatosPostales() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDatosPostales)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDatosPostalesValueSpain)).click();
		sleep(null);
	}

	public void fillDireccionDatosDeNotificationPostales() {
		driver.findElement(textBoxDireccionDatosDeNotificationPostales).click();
		driver.findElement(textBoxDireccionDatosDeNotificationPostales).sendKeys("TESTDireccion");
		sleep(null);
	}

	public void fillCiudadDatosDeNotificationPostales() {
		driver.findElement(textBoxCiudadDatosDeNotificationPostales).click();
		driver.findElement(textBoxCiudadDatosDeNotificationPostales).sendKeys("TESTCiudad");
		sleep(null);
	}

	public void fillCodigoPostalDatosDeNotificationPostales() {
		driver.findElement(textBoxCodigoPostalDatosDeNotificationPostales).click();
		driver.findElement(textBoxCodigoPostalDatosDeNotificationPostales).sendKeys("34001");
		sleep(null);
	}

	public void fillProvinciaPostalDatosDeNotificationPostales() {
		driver.findElement(textBoxProvinciaDatosDeNotificationPostales).click();
		driver.findElement(textBoxProvinciaDatosDeNotificationPostales).sendKeys("TESTProvincia");
		sleep(null);
	}

	public void fillEmailDatosDeNotificationPostales() {
		driver.findElement(textBoxEmailDatosDeNotification).click();
		driver.findElement(textBoxEmailDatosDeNotification).sendKeys("Test@email.es");
		sleep(null);
	}

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
		scrollDown();
	}

	public void uploadAcreditacionCompetenciaLinguistica() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc4));
		driver.findElement(buttonAnadirAcreditacionCompetenciaLinguistica).click();
		uploadDocumentAction();
		sleep(null);
		scrollDown();
	}

	public void uploadOtrosDocumentos() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc5));
		driver.findElement(buttonAnadirOtrosDocumentos).click();
		uploadDocumentAction();
		sleep(null);
		scrollDown();
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

	// Pantalla enviar solicitud

	public void clickOnButtonFirmarYPresentarFP() {
		sleep(3000L);
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentarFP)).click();
	}

	public void clickOnButtonFirmarYPresentar() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentar)).click();
	}

	public void enviarSolicitud() {
		clickOnButtonFirmarYPresentarFP();
		clickOnButtonFirmarYPresentar();
	}

	// Asserts

	public void assertTipoDeSolicitudFP() {
		sleep(5000L);
		String expectedMessage = "Equivalencia";
		String message = driver.findElement(textBoxTipoDeSolicitudFP).getAttribute("value");
		System.out.println("This is the expected message: " + " " + message);
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		scrollDown();
	}

	public void assertDenominacionDelTítuloSolicitanteFP() {
		scrollDown();
		String expectedMessage = "Prueba_Auto_Solicitante";
		String message = driver.findElement(textBoxDenominacionDelTítuloFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertDenominacionDelTítuloRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Prueba_Auto_Representante";
		String message = driver.findElement(textBoxDenominacionDelTítuloFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertFechaInicioFP() {
		scrollDown();
		String expectedMessage = "01/01/2019";
		String message = driver.findElement(textBoxFechaInicioFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertFechaFinFP() {
		scrollDown();
		String expectedMessage = "01/01/2020";
		String message = driver.findElement(textBoxFechaFinFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertUniversidadFP() {
		scrollDown();
		String expectedMessage = "Test_Automatico_Universidad";
		String message = driver.findElement(textBoxUniversidadFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertPaisFP() {
		scrollDown();
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertProfesionFP() {
		scrollDown();
		String expectedMessage = "Abogado";
		String message = driver.findElement(textBoxProfesionFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertRamaDeConocimineto() {
		scrollDown();
		String expectedMessage = "ARTES Y HUMANIDADES";
		String message = driver.findElement(textBoxRamaDeConocimiento).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");

	}

	public void assertProfesionAccriditacionFP() {
		scrollDown();
		String expectedMessage = "Abogado";
		String message = driver.findElement(textBoxProfesionFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertNombreFP() {
		scrollDown();
		String expectedMessage = "Ciudadano";
		String message = driver.findElement(textBoxNombreFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertNombreParaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Apollo";
		String message = driver.findElement(textBoxNombreFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertPrimerApellidoFP() {
		scrollDown();
		String expectedMessage = "Ficticio";
		String message = driver.findElement(textBoxPrimerApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertPrimerApellidoParaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Taurus";
		String message = driver.findElement(textBoxPrimerApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertSegundoApellidoFP() {
		scrollDown();
		String expectedMessage = "";
		String message = driver.findElement(textBoxSegundoApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertSegundoApellidoParaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "Medusa";
		String message = driver.findElement(textBoxSegundoApellidoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertGeneroFP() {
		scrollDown();
		String expectedMessage = "H";
		String message = driver.findElement(textBoxGeneroFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertPaisDeNaciminetoFP() {
		scrollDown();
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisDeNacimientoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertFechaDeNaciminetoFP() {
		scrollDown();
		String expectedMessage = "09/06/2020";
		String message = driver.findElement(textBoxFechaDeNacimientoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertNacionalidadFP() {
		scrollDown();
		String expectedMessage = "Español";
		String message = driver.findElement(textBoxNacionalidadFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertTipoDeDocumentoFP() {
		String expectedMessage = "DNI";
		String message = driver.findElement(textBoxTipoDeDocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertPaisDelDocumentoFP() {
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisDelDocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertNumDocumentoFP() {
		String expectedMessage = "99999018D";
		String message = driver.findElement(textBoxNumdocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertNumDocumentoPararepresentanteFP() {
		String expectedMessage = "99999018D";
		String message = driver.findElement(textBoxNumdocumentoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertTelefonoFijoFP() {
		String expectedMessage = "0606060606";
		String message = driver.findElement(textBoxTelefonoFijoFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertTelefonoMovilFP() {
		String expectedMessage = "0606060606";
		String message = driver.findElement(textBoxTelefonoMovilFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertPaisDatosPostalesFP() {
		String expectedMessage = "España";
		String message = driver.findElement(textBoxPaisDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertDireccionDatosPostalesFP() {
		String expectedMessage = "TESTDireccion";
		String message = driver.findElement(textBoxDireccionDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertCodigoPostalDatosPostalesFP() {
		String expectedMessage = "34001";
		String message = driver.findElement(textBoxCodigoPostalDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertCiudadDatosPostalesFP() {
		String expectedMessage = "TESTCiudad";
		String message = driver.findElement(textBoxCiudadDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertProvinciaDatosPostalesFP() {
		String expectedMessage = "TESTProvincia";
		String message = driver.findElement(textBoxProvinciaDatosPostalesFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertEmailDatosElectroFP() {
		String expectedMessage = "Test@email.es";
		String message = driver.findElement(textBoxEmailDatosElectroFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertTipoDocumentoRepresentanteFP() {
		scrollDown();
		String expectedMessage = "DNI";
		String message = driver.findElement(textBoxTipoDocumentoRepresentanteFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertNumDocumentoRepresentanteFisicaFP() {
		String expectedMessage = "99999018D";
		String message = driver.findElement(textBoxNumDocumentoRepresentanteFP).getAttribute("value");
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertDocumenApudActa() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxApudActaFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);
	}

	public void assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);

	}

	public void assertDocumentoDeclaracionResponsableRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);

	}

	public void assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);

	}

	public void assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);

	}

	public void assertDocumentoAcreditacionCompetenciaLinguisticaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditacionCompetenciaLinguisticaRepresentanteFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);

	}

	public void assertDocumentoOtrosDocumentosFPRepresentante() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPRepresentanteTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);

	}

	public void assertDocumentoAcreditativoIdentidadNacionalidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);
	}

	public void assertDocumentoDeclaracionResponsableFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);
	}

	public void assertDocumentoTituloAcademicoCertificadoUniversidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxTituloAcademicoCertificadoUniversidadFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
		sleep(2000L);
	}

	public void assertDocumentoCertificacionAcademicaEstudiosRealizadosFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertDocumentoAcreditacionCompetenciaLinguisticaFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditacionCompetenciaLinguisticaFP).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertDocumentoOtrosDocumentosFP() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosFPTextValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPTextValue).getText();
		Assert.assertTrue(message.contains(expectedMessage), "TEST FAILED: invalid data or not found");
	}

	public void assertObservacionesFP() {
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
		sleep(5000L);
		assertTipoDeSolicitudFP();
		assertDenominacionDelTítuloSolicitanteFP();
		assertFechaInicioFP();
		assertFechaFinFP();
		assertUniversidadFP();
		assertPaisFP();
		assertRamaDeConocimineto();
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
		// assertEmailDatosElectroFP();
		assertDocumentoAcreditativoIdentidadNacionalidadFP();
		assertDocumentoDeclaracionResponsableFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosFP();
		assertDocumentoAcreditacionCompetenciaLinguisticaFP();
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
		// assertEmailDatosElectroFP();
		assertTipoDocumentoRepresentanteFP();
		assertNumDocumentoRepresentanteFisicaFP();
		assertDocumenApudActa();
		assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP();
		assertDocumentoDeclaracionResponsableRepresentanteFP();
		assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP();
		assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP();
		assertDocumentoAcreditacionCompetenciaLinguisticaRepresentanteFP();
		assertDocumentoOtrosDocumentosFPRepresentante();
		assertObservacionesFP();
	}
}

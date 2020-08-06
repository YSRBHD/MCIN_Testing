package org.mcin.utils;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SolicitudPageObject extends SolicitudElementsLocators {
	WebDriver driver;
	WebDriverWait wait;

	// =========== Waiting Time =========== //

	public SolicitudPageObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 40);
	}

	public void sleep(Long time) {
		if (time == null) {
			time = 1000L;
		}
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// =========== scroll Down ============ //

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,130)");
	}

	// ========== Authentication ========== //

	public void clickOnButtonAcceder() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAcceder)).click();
		sleep(null);
	}

	public void clickOnButtonAccess() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAccess)).click();
		sleep(null);
	}

	public void chooseCertificate() {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					clickOnButtonAccess();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		// Choose first certificate
		try {
			Robot robot = new Robot();
			Thread t = new Thread(r);
			t.start();
			robot.delay(10000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
	}

	public void authentication() {
		clickOnButtonAcceder();
		chooseCertificate();

	}

	// =========== Create New "Solicitud" =========== //

	public void clickOnButtonNuevaSolicitud() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonNuevaSolicitud)).click();
		sleep(null);
	}

	// =========== Solicitud Type choice =========== //

	public void clickOnButtonHomologacion() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonHomologacion)).click();
		sleep(null);
	}

	public void clickOnButtonEquivalencia() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonEquivalencia)).click();
		sleep(null);
	}

	public void clickOnButtonReconocimiento() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonReconocimineto)).click();
		sleep(null);
	}

	public void clickOnButtonAcreditacion() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAcreditacion)).click();
		sleep(null);
	}

	// =========== Solicitud Type choice =========== //

	public void clickOnUsuarioSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonUsuarioSolicitante)).click();
		sleep(null);
	}

	public void clickOnUsuarioRepresentante() {
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonUsuarioRepresentante)).click();
		sleep(null);
	}
	// ======= Tab Datos Relativos Al Procedimiento ======= //

	public void clickOnButtonDatosRelativosAlProcedimiento() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonDatosRelativosAlProcedimiento)).click();
		sleep(null);
	}

	public void clickOnTabDatosRelativosAlProcedimiento() {
		wait.until(ExpectedConditions.elementToBeClickable(tabDatosRelativosAlProcedimiento)).click();
		sleep(null);
	}

	public void fillDenominacionDelTituloSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDenominacionDelTitulo));
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Solicitante");
		sleep(null);
	}

	public void fillDenominacionDelTituloRepresentante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDenominacionDelTitulo));
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Representante");
		sleep(null);
	}

	public void fillDenominacionDelTituloAcriditacionSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxDenominacionDelTitulo)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxDenominacionDelTituloValueOtro)).click();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDenominacionDelTituloOtro)).click();
		driver.findElement(textBoxDenominacionDelTituloOtro).sendKeys("Prueba_Auto_Solicitante");
		sleep(null);
	}

	public void fillDenominacionDelTituloAcriditacionRepresentante() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxDenominacionDelTitulo)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxDenominacionDelTituloValueOtro)).click();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDenominacionDelTituloOtro)).click();
		driver.findElement(textBoxDenominacionDelTituloOtro).sendKeys("Prueba_Auto_Representante");
		sleep(null);
	}

	public void fillFechainicio() {
		wait.until(ExpectedConditions.elementToBeClickable(datePickerFechaInicioDRAP)).click();
		driver.findElement(datePickerFechaInicioDRAP).sendKeys("01/01/2019");
		sleep(null);
	}

	public void fillFechaFin() {
		wait.until(ExpectedConditions.elementToBeClickable(datePickerFechaFinDRAP)).click();
		driver.findElement(datePickerFechaFinDRAP).sendKeys("01/01/2020");
		sleep(null);
	}

	public void fillUniversidad() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxUniversidad));
		driver.findElement(textBoxUniversidad).sendKeys("Test_Automatico_Universidad");
		sleep(null);
	}

	public void fillPais() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPais)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisvalueSpain)).click();
		sleep(null);
	}

	public void fillPaisUniversidadAccriditacion() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisUniversidadAcreditacion)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisUniversidadAcreditacionvalueSpain)).click();
		sleep(null);
	}

	public void fillPaisProfesionAccriditacion() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisProfesionAcreditacion)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisProfesionAcriditacionvalueSpain)).click();
		sleep(null);
	}

	public void fillProfesion() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProfesion)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxProfesionvalueProfesion1)).click();
		sleep(null);
	}

	public void fillProfesionAccriditacion() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProfesionAccriditacion)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxProfesionAccriditacionvalueProfesion1)).click();
		sleep(null);
	}

	public void fillRamaDeConocimiento() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxRamaDeConocimiento)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxRamaDeConocimientoArtesYHumanidades)).click();
		sleep(null);
	}

	// ======= Tab Solicitante ======= //

	public void clickOnButtonSolicitante() {
		driver.findElement(buttonSolicitante).click();
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

	public void fillGenero() {
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonGenero)).click();
		sleep(null);
	}

//	public void fillGeneroAcriditacion() {
//		wait.until(ExpectedConditions.elementToBeClickable(radioButtonGeneroAcriditacion)).click();
//		sleep(null);
//	}

	public void fillPaisDeNacimientoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDeNacimineto)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxPaisDeNaciminetoValueSpain)).click();
		sleep(null);
	}

	public void fillFechaDeNacimientoSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(datePickerFechaDeNacimiento)).click();
		driver.findElement(datePickerFechaDeNacimiento).sendKeys("09/06/2020");
		sleep(null);
	}

	public void fillNationalidadSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(comboboxNationalidad)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxNationalidadValueSpain)).click();
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

	public void fillEmailSolicitante() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmailSolicitante)).click();
		driver.findElement(textBoxEmailSolicitante).sendKeys("Test@email.es");
		sleep(null);
	}

	// ======= Tab Representante ======= //

	public void clickOnButtonRepresentante() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonRepresentante)).click();
		sleep(null);
	}

	public void clickOnRadioButtonPersonaJuridica() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonPersonaJuridica)).click();
		sleep(null);
	}

	public void clickOnRadioButtonPersonaFisica() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonPersonaFisica)).click();
		sleep(null);
	}

	public void fillRazonRJ() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxRazonER)).click();
		driver.findElement(textBoxRazonER).sendKeys("Prueba_Razon");
		sleep(null);
	}

	public void fillTipoDeDocumentoRJ() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumentoRJ)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumentoRJValueDNI)).click();
		sleep(null);
	}

	public void fillTipoDeDocumentoRF() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumentoRF)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboboxTipoDeDocumentoRFValueDNI)).click();
		sleep(null);
	}

	public void fillTelefonoRJ() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxTelefonoRJ)).click();
		driver.findElement(textBoxTelefonoRJ).sendKeys("606060606");
		sleep(null);
	}

	public void fillTelefonoRF() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxTelefonoRF)).click();
		driver.findElement(textBoxTelefonoRF).sendKeys("606060606");
		sleep(null);
	}

	public void fillNumdocumentoRJ() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNumdocumentoER)).click();
		driver.findElement(textBoxNumdocumentoER).sendKeys("99999018D");
		sleep(null);
	}

	public void uploadApudActaRJ() {
		wait.until(ExpectedConditions.elementToBeClickable(radiobuttonAdjuntarDocumentoApudActa)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirApudActa)).click();
		uploadDocumentApudActaAction();
		sleep(null);
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
		fileInput.sendKeys(testDocument);
		wait.until(ExpectedConditions.elementToBeClickable(checkBoxVeracidadApudActa)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonAnadirDocumentApudActaPopup)).click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonActualizarDocumentApudActaPopup));
		scrollDown();
		sleep(null);
	}

	// ======= Tab Datos De Notificacion ======= //

	public void clickOnButtonDatosDeNotificacion() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonDatosDeNotificacion)).click();
		sleep(null);
	}

	public void fillTelefonoMovilDatosDeNotification() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxTelefonoMovilDatosdeNotification)).click();
		driver.findElement(textBoxTelefonoMovilDatosdeNotification).sendKeys("606060606");
		sleep(null);
	}

	public void fillTelefonoFijoDatosDeNotification() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxTelefonoFijoDatosDeNotification)).click();
		driver.findElement(textBoxTelefonoFijoDatosDeNotification).sendKeys("606060606");
		sleep(null);
	}

	public void fillEmailDatosDeNotificationSinPostales() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmailDatosDeNotificationSinPostales)).click();
		driver.findElement(textBoxEmailDatosDeNotificationSinPostales).sendKeys("Test@email.es");
		sleep(null);
	}

	public void fillEmailDatosDeNotificationConPostales() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmailDatosDeNotificationConPostales)).click();
		driver.findElement(textBoxEmailDatosDeNotificationConPostales).sendKeys("Test@email.es");
		sleep(null);
	}

	// ======= Tab Documentacion ======= //

	public void clickOnButtonDocumentacion() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonDocumentacion)).click();
		sleep(null);
	}

	public void uploadDocumentAction() {

		// driver.findElement(buttonAdjuntarArchivoDocumentPopup).click();
		WebElement fileInput = driver.findElement(By.id("file"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.id("file"));
		js.executeScript("arguments[0].setAttribute('style', 'left:30px')", element);
		fileInput.sendKeys(testDocument);
		driver.findElement(checkBoxVeracidadDeDocument).click();
		driver.findElement(buttonAnadirDocumentPopup).click();
		scrollDown();
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
		driver.findElement(buttonAnadirOtrosDocumentosConDIS).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadOtrosDocumentosSinDIS() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarDoc4));
		driver.findElement(buttonAnadirOtrosDocumentosSinDIS).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadDatosIdentificativosSolicitanteConDIS() {
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarOtroDoc1ConDIS));
		driver.findElement(checkBoxNoAutorizoComprobacionConDIS).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAnadirDatosIdentificativosSolicitanteConDIS));
		driver.findElement(buttonAnadirDatosIdentificativosSolicitanteConDIS).click();
		uploadDocumentAction();
		sleep(null);
	}

	public void uploadDatosIdentificativosSolicitanteSinDIS() {
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonActualizarOtroDoc1SinDIS));
		driver.findElement(checkBoxNoAutorizoComprobacionSinDIS).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonAnadirDatosIdentificativosSolicitanteSinDIS));
		driver.findElement(buttonAnadirDatosIdentificativosSolicitanteSinDIS).click();
		uploadDocumentAction();
		sleep(null);
	}

	// ======= Tab Pagos De Tasas ======= //

	public void clickOnButtonPagosDeTasas() {
		scrollDown();
		wait.until(ExpectedConditions.elementToBeClickable(buttonActualizarOtroDoc1ConDIS));
		wait.until(ExpectedConditions.elementToBeClickable(buttonPagosDeTasas)).click();
		sleep(null);
	}

	public void chooseTarjetaDeCredito() {
		// Click on "Tarjeta de crédito" Radio button
		wait.until(ExpectedConditions.elementToBeClickable(radioButtonTarjetaCredito)).click();
		sleep(null);

		// Click on "Continuar con el Pago"
		wait.until(ExpectedConditions.elementToBeClickable(buttonContinuarConElPagoTC)).click();
		sleep(null);
	}

	// ======= Tab Presentacion ======= //

	public void clickOnButtonPresentacion() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonPresentacion)).click();
		sleep(null);
	}

	public void fillObservacionesDePresentacion() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		wait.until(ExpectedConditions.elementToBeClickable(textBoxObservaciones)).click();
		driver.findElement(textBoxObservaciones).sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis.");
		sleep(null);
	}

	public void clickOnCheckBoxAceptarCondiciones() {
		wait.until(ExpectedConditions.elementToBeClickable(checkBoxAceptarCondiciones)).click();
		sleep(null);
	}

	public void clickOnButtonRevisarYFirmar() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonRevisarYFirmar)).click();
		sleep(null);
	}

	// ======= Tab Firma y presentación de solicitud Data assertion ======= //

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
		assertTrue("TEST FAILED: Documento acreditativo identidad y nacionalidad invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoAcreditativoIdentidadNacionalidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadFP).getText();
		assertTrue("TEST FAILED: Documento acreditativo identidad y nacionalidad invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoAcreditativoIdentidadNacionalidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditativoIdentidadNacionalidadRepresentanteFP).getText();
		assertTrue("TEST FAILED: Documento acreditativo identidad y nacionalidad invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoDeclaracionResponsableFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableFP).getText();
		assertTrue("TEST FAILED: Declaración responsable invalid data or not found", message.contains(expectedMessage));
	}

	public void assertDocumentoDeclaracionResponsableRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxDeclaracionResponsableRepresentanteFP).getText();
		assertTrue("TEST FAILED: Declaración responsable invalid data or not found", message.contains(expectedMessage));
	}

	public void assertDocumentoTituloAcademicoCertificadoUniversidadFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(TextBoxTituloAcademicoCertificadoUniversidadFP).getText();
		assertTrue("TEST FAILED: Título académico o certificado de la universidad invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoTituloAcademicoCertificadoUniversidadRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(TextBoxTituloAcademicoCertificadoUniversidadRepresentanteFP).getText();
		assertTrue("TEST FAILED: Título académico o certificado de la universidad invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoCertificacionAcademicaEstudiosRealizadosFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosFP).getText();
		assertTrue("TEST FAILED: Certificación académica de los estudios realizados invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoCertificacionAcademicaEstudiosRealizadosRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxCertificacionAcademicaEstudiosRealizadosRepresentanteFP).getText();
		assertTrue("TEST FAILED: Certificación académica de los estudios realizados invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoAcreditacionCompetenciaLinguisticaFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditacionCompetenciaLinguisticaFP).getText();
		assertTrue("TEST FAILED: Acreditación competencia lingüistica invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoAcreditacionCompetenciaLinguisticaRepresentanteFP() {
		scrollDown();
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxAcreditacionCompetenciaLinguisticaRepresentanteFP).getText();
		assertTrue("TEST FAILED: Acreditación competencia lingüistica invalid data or not found",
				message.contains(expectedMessage));
	}

	public void assertDocumentoOtrosDocumentosFP() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosFPTextValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPTextValue).getText();
		assertTrue("TEST FAILED: Otros documentos invalid data or not found", message.contains(expectedMessage));
	}

	public void assertDocumentoOtrosDocumentosReconocimientoFP() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosReconocimientoFPValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosReconocimientoFPTextValue).getText();
		assertTrue("TEST FAILED: Otros documentos invalid data or not found", message.contains(expectedMessage));
	}

	public void assertDocumentoOtrosDocumentosFPRepresentante() {
		scrollDown();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxOtrosDocumentosFPRepresentanteValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPRepresentanteTextValue).getText();
		assertTrue("TEST FAILED: Otros documentos invalid data or not found", message.contains(expectedMessage));
	}

	public void assertDocumentoOtrosDocumentosRepresentanteReconocimientoFP() {
		scrollDown();
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(textBoxOtrosDocumentosFPRepresentanteReconocimientoValue));
		String expectedMessage = "TEST";
		String message = driver.findElement(textBoxOtrosDocumentosFPRepresentanteReconocimientoTextValue).getText();
		assertTrue("TEST FAILED: Otros documentos invalid data or not found", message.contains(expectedMessage));
	}

	public void assertObservacionesFP() {
		scrollDown();
		wait.until(ExpectedConditions.textToBePresentInElementValue(textBoxObservacionesFP,
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis."));
	}

	public void clickOnButtonFirmarYPresentarSolitanteFP() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentarSolicitanteFP)).click();
	}

	public void clickOnButtonFirmarYPresentarRepresentanteFP() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentarRepresentanteFP)).click();
	}

	public void clickOnButtonFirmarYPresentar() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonFirmarYPresentar)).click();
	}

	public void assertSolicitudFirmadaYPresentada() {
		sleep(15000L);
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxSolicitudFirmadaYPresentada));
		String expectedMessage = "En base a su solicitud se ha creado el";
		String message = driver.findElement(textBoxSolicitudFirmadaYPresentada).getText();
		assertTrue("TEST FAILED: Solicitud invalid or not created", message.contains(expectedMessage));
	}

//	public void clickOnIrAMisTramites() {
//		wait.until(ExpectedConditions.elementToBeClickable(buttonIrAMisTramites)).click();
//
//	}
//
//	public void getIdSolicitud() {
//		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxIdSolicitud));
//		String message = driver.findElement(textBoxIdSolicitud).getText();
//		String expectedMessage = message.replaceAll("[^\\d.]", "");
//	}

	public void assertCreationSolicitudComoSolicitante() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxIdSolicitud));
		String idSolicitud = driver.findElement(textBoxIdSolicitud).getText();
		String expectedId = idSolicitud.replaceAll("[^\\d.]", "");
		System.out.println(expectedId);
		wait.until(ExpectedConditions.elementToBeClickable(buttonIrAMisTramites)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(tabExpedientes)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(tabMisExpedientes)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxIdSolicitudComoSolicitanteTable));
		String idsInTable = driver.findElement(textBoxIdSolicitudComoSolicitanteTable).getText();
		System.out.println(idsInTable);
		assertTrue(idsInTable.contains(expectedId));

	}

	public void assertCreationSolicitudComoRepresentante() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxIdSolicitud));
		String idSolicitud = driver.findElement(textBoxIdSolicitud).getText();
		String expectedId = idSolicitud.replaceAll("[^\\d.]", "");
		System.out.println(expectedId);
		wait.until(ExpectedConditions.elementToBeClickable(buttonIrAMisTramites)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(tabExpedientes)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(tabExpedientesDeMisRepresentadores)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxIdSolicitudComoRepresentanteTable));
		String idsInTable = driver.findElement(textBoxIdSolicitudComoRepresentanteTable).getText();
		System.out.println(idsInTable);
		assertTrue(idsInTable.contains(expectedId));

	}
}

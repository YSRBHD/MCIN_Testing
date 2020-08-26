package com.crm.qa.pages;

import org.openqa.selenium.By;

import com.crm.qa.base.TestBase;

public class SolicitudHomologacionPage extends TestBase {

	// Page Factory (Objects Repository)

	By buttonHomologacion = By.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div/div[4]/div/div[1]/div/div/div[1]/img");
	By tabDatosRelativosAlProcedimiento = By
			.xpath("//*[@id=\"mainWrapper\"]/div[2]/div/div[1]/div[4]/div[1]/ul/li[1]/a");
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

	// Actions

	public void clickOnButtonHomologacion() {
		// wait.until(ExpectedConditions.elementToBeClickable(buttonHomologacion)).click();
		driver.findElement(buttonHomologacion).click();
		sleep(null);
	}

	public void clickOnTabDatosRelativosAlProcedimiento() {
		// wait.until(ExpectedConditions.elementToBeClickable(tabDatosRelativosAlProcedimiento)).click();
		driver.findElement(tabDatosRelativosAlProcedimiento).click();
		sleep(null);
	}

	public void clickOnUsuarioSolicitante() {
		// wait.until(ExpectedConditions.elementToBeClickable(radioButtonUsuarioSolicitante)).click();
		driver.findElement(radioButtonUsuarioSolicitante).click();
		sleep(null);
	}

	public void fillDenominacionDelTituloSolicitante() {
		// wait.until(ExpectedConditions.elementToBeClickable(textBoxDenominacionDelTitulo));
		driver.findElement(textBoxDenominacionDelTitulo).click();
		driver.findElement(textBoxDenominacionDelTitulo).sendKeys("Prueba_Auto_Solicitante");
		sleep(null);
	}

	public void fillFechainicio() {
		// wait.until(ExpectedConditions.elementToBeClickable(datePickerFechaInicioDRAP)).click();
		driver.findElement(datePickerFechaInicioDRAP).click();
		driver.findElement(datePickerFechaInicioDRAP).sendKeys("01/01/2019");
		sleep(null);
	}

	public void fillFechaFin() {
		// wait.until(ExpectedConditions.elementToBeClickable(datePickerFechaFinDRAP)).click();
		driver.findElement(datePickerFechaFinDRAP).click();
		driver.findElement(datePickerFechaFinDRAP).sendKeys("01/01/2020");
		sleep(null);
	}

	public void fillUniversidad() {
		// wait.until(ExpectedConditions.elementToBeClickable(textBoxUniversidad));
		driver.findElement(textBoxUniversidad).sendKeys("Test_Automatico_Universidad");
		sleep(null);
	}

	public void fillPais() {
		// wait.until(ExpectedConditions.elementToBeClickable(comboBoxPais)).click();
		// wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisvalueSpain)).click();
		driver.findElement(comboBoxPais).click();
		driver.findElement(comboBoxPaisvalueSpain).click();
		sleep(null);
	}

	public void fillProfesion() {
		// wait.until(ExpectedConditions.elementToBeClickable(comboBoxProfesion)).click();
		// wait.until(ExpectedConditions.elementToBeClickable(comboboxProfesionvalueProfesion1)).click();
		driver.findElement(comboBoxProfesion).click();
		driver.findElement(comboboxProfesionvalueProfesion1).click();
		sleep(null);
	}

	public void fillTabDatosRelativosAlProcedimientoParaSolicitante() {
		clickOnTabDatosRelativosAlProcedimiento();
		clickOnUsuarioSolicitante();
		fillDenominacionDelTituloSolicitante();
		fillFechainicio();
		fillFechaFin();
		fillUniversidad();
		fillPais();
		fillProfesion();
	}

}

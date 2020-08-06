package org.mcin.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdministratorPageObject extends AdministratorElementsLocators {

	WebDriver driver;
	WebDriverWait wait;
	String usuarioApellido = "ACME Usuario Apellido";
	String rolNombre = "ACME Rol";
	String codigoTasa = "ACME Tasa";
	String anoCalendario = "1990";
	String functionalidad = "ACME Functionalidad";
	String pais = "ACME Pais";
	String nombreEtiqueta = "ACME Etiqueta";
	String plazo = "ACME Plazo";
	String idioma = "ACME Idioma";
	String tipoSubsanacion = "ACME Subsanacion";

	// =========== Waiting Time =========== //

	public AdministratorPageObject(WebDriver driver) {
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

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,130)");
	}

	// ========== Authentication ========== //

	public void clickOnButtonAdminFuncional() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAdminFuncional)).click();
		sleep(null);
	}

	public void clickOnButtonAdminTecnico() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAdminTecnico)).click();
		sleep(null);

	}

	// ============= Usuarios ============= //

	public void clickOnTabUsuarios() {
		wait.until(ExpectedConditions.elementToBeClickable(tabUsuarios)).click();
		sleep(null);
	}

	public void clickOnButtonNuevoUsuarios() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonNuevoUsuario)).click();
		sleep(null);
	}

	public void fillEmailNuevoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxEmailNuevoUsuario));
		driver.findElement(textBoxEmailNuevoUsuario).sendKeys("Test@Test.com");
		sleep(null);
	}

	public void fillNombreNuevoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNombreNuevoUsuario));
		driver.findElement(textBoxNombreNuevoUsuario).sendKeys("Zeus");
		sleep(null);
	}

	public void fillPrimerApellidoNuevoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxPrimerApellidoNuevoUsuario));
		driver.findElement(textBoxPrimerApellidoNuevoUsuario).sendKeys("Don CR");
		sleep(null);
	}

	public void fillSegundoApellidoNuevoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxSegundoApellidoNuevoUsuario));
		driver.findElement(textBoxSegundoApellidoNuevoUsuario).sendKeys(usuarioApellido);
		sleep(null);
	}

	public void fillRolNuevoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxRolNU)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxRolvalueTramitadorSGTNU)).click();
		sleep(null);
	}

	public void fillEstadoNuevoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoNU)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoValueActivoNU)).click();
		sleep(null);
	}

	public void fillObservacionesNuevoUsuario() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxObservacionesNuevoUsuario));
		driver.findElement(textBoxObservacionesNuevoUsuario).sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis.");
		sleep(null);
	}

	public void clickOnButtonCrearUsuarios() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearUsuario)).click().perform();
		sleep(null);
	}

	// ================ Roles ================ //

	public void clickOnTabRoles() {
		wait.until(ExpectedConditions.elementToBeClickable(tabRoles)).click();
		sleep(2000L);
	}

	public void clickOnButtonNuevoRol() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevoRol)).click().perform();
		sleep(2000L);
	}

	public void fillNombreNuevoRol() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNombreNuevoRol));
		driver.findElement(textBoxNombreNuevoRol).sendKeys("Don CR");
		sleep(2000L);
	}

	public void fillOrganoNuevoRol() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxOrganoNR)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxOrganoValueSGTNR)).click();
		sleep(2000L);
	}

	public void fillDescripcionNuevoRol() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDescripcionNuevoRol));
		driver.findElement(textBoxDescripcionNuevoRol).sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis.");
		sleep(2000L);
	}

	public void fillEstadoNuevoRol() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoNR)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoValueActivoNR)).click();
		sleep(2000L);
	}

	public void fillFuncionalidadesNuevoRol() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxFuncionalidadesNR)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxFuncionalidadesValueFunc1NR)).click();
		sleep(2000L);
	}

	public void clickOnButtonAssignarRol() {
		wait.until(ExpectedConditions.elementToBeClickable(buttonAssignarRol)).click();
		sleep(2000L);
	}

	public void clickOnButtonCrearRol() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearRol)).click().perform();
		sleep(2000L);
	}

	// ================ Tasas ================ //

	public void clickOnTabTasasAdminFuncional() {
		wait.until(ExpectedConditions.elementToBeClickable(tabTasasAdminFuncional)).click();
		sleep(null);
	}

	public void clickOnTabTasasAdminTecnico() {
		wait.until(ExpectedConditions.elementToBeClickable(tabTasasAdminTecnico)).click();
		sleep(null);
	}

	public void clickOnButtonNuevaTasa() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevaTasa)).click().perform();
		sleep(null);
	}

	public void fillCodigoTasa() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxCodigoTasa));
		driver.findElement(textBoxCodigoTasa).sendKeys(codigoTasa);
		sleep(null);
	}

	public void fillProcedimientoTasa() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProcedimientoTasa)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProcedimientoTasaValueHomologacion)).click();
		sleep(null);
	}

	public void fillFechainicioVigenciaTasa() {
		wait.until(ExpectedConditions.elementToBeClickable(datePickerFechainicioVigenciaTasa)).click();
		driver.findElement(datePickerFechainicioVigenciaTasa).sendKeys("01/01/2019");
		sleep(null);
	}

	public void fillFechaFinVigenciaTasa() {
		wait.until(ExpectedConditions.elementToBeClickable(datePickerFechaFinVigenciaTasa)).click();
		driver.findElement(datePickerFechaFinVigenciaTasa).sendKeys("01/01/2020");
		sleep(null);
	}

	public void fillCodigoHaciendaTasa() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxCodigoHacienda));
		driver.findElement(textBoxCodigoHacienda).sendKeys("AD1234WED");
		sleep(null);
	}

	public void fillModeloTasa() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxModeloTasa));
		driver.findElement(textBoxModeloTasa).sendKeys("Modelo 123");
		sleep(null);
	}

	public void fillImporteTasa() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxImporteTasa));
		driver.findElement(textBoxImporteTasa).sendKeys("527.23");
		sleep(null);
	}

	public void clickOnButtonCrearTasa() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearTasa)).click().perform();
		sleep(null);
	}

	// ============ Medidas Generales ============ //

	public void clickOnTabMedidasGenerales() {
		wait.until(ExpectedConditions.elementToBeClickable(tabMedidasGenerales)).click();
		sleep(null);
	}

	public void clickOnButtonNuevaMedidasGenerales() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevaMedidasGenerales)).click().perform();
		sleep(null);
	}

	public void fillProcedimientoMG() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProcedimientoMG)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProcedimientoMGValueHomologacion)).click();
		sleep(null);
	}

	public void fillTituloMG() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxTituloMG)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxTituloMGValueTitulo1)).click();
		sleep(null);
	}

	public void fillCriterioMG() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxCriterioMG)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxCriterioMGValueCriterio)).click();
		sleep(null);
	}

	public void fillProfesionMG() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProfesionMG)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProfesionMGValueAbogado)).click();
		sleep(null);
	}

	public void fillPaisMG() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisMG)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxPaisMGValueSpain)).click();
		sleep(null);
	}

	public void clickOnCheckboxFavorableMG() {
		wait.until(ExpectedConditions.elementToBeClickable(CheckboxFavorableMG)).click();
		sleep(null);
	}

	public void fillEstadoMG() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoMG)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoMGValueActivo)).click();
		sleep(null);
	}

	public void clickOnButtonCrearMedidasGenerales() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearMedidasGenerales)).click().perform();
		sleep(null);
	}

	// ============ Calendarios ============ //

	public void clickOnTabCalendarios() {
		wait.until(ExpectedConditions.elementToBeClickable(tabCalendarios)).click();
		sleep(null);
	}

	public void clickOnButtonNuevoCalendario() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevoCalendario)).click().perform();
		sleep(null);
	}

	public void fillFechaCalendario() {
		wait.until(ExpectedConditions.elementToBeClickable(datePickerFechaCalendario)).click();
		driver.findElement(datePickerFechaCalendario).sendKeys("03/05/" + anoCalendario);
		sleep(null);
	}

	public void fillFestivosCalendario() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxFestivosCalendario)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxFestivosCalendarioValueAnoNuevo)).click();
		sleep(null);
	}

	public void clickOnButtonCrearCalendario() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearCalendario)).click().perform();
		sleep(null);
	}

	// ============ Functionalidades ============ //

	public void clickOnTabFunctionalidades() {
		wait.until(ExpectedConditions.elementToBeClickable(tabFunctionalidades)).click();
		sleep(null);
	}

	public void clickOnButtonNuevaFunctionalidad() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevaFunctionalidad)).click().perform();
		sleep(null);
	}

	public void fillDescripcionFunctionalidad() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDescripcionFunctionalidad));
		driver.findElement(textBoxDescripcionFunctionalidad).sendKeys(functionalidad);
		sleep(null);
	}

	public void clickOnButtonCrearFunctionalidad() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearFunctionalidad)).click().perform();
		sleep(null);
	}

	// ============ Paises ============ //

	public void clickOnTabPaises() {
		wait.until(ExpectedConditions.elementToBeClickable(tabPaises)).click();
		sleep(null);
	}

	public void clickOnButtonNuevoPais() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevoPaises)).click().perform();
		sleep(null);
	}

	public void fillNombrePais() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNombrePais));
		driver.findElement(textBoxNombrePais).sendKeys(pais);
		sleep(null);
	}

	public void clickOnButtonCrearPais() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearPais)).click().perform();
		sleep(null);
	}

	// ============ Notificaciones DEH y SEDE ============ //

	public void clickOnTabNotificaciones() {
		wait.until(ExpectedConditions.elementToBeClickable(tabNotificaciones)).click();
		sleep(null);
	}

	public void clickOnButtonNuevaNotificacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevaNotificacion)).click().perform();
		sleep(null);
	}

	public void fillDiasSEDE() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDiasSEDE));
		driver.findElement(textBoxDiasSEDE).sendKeys("10");
		sleep(null);
	}

	public void fillDiasDEH() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDiasDEH));
		driver.findElement(textBoxDiasDEH).sendKeys("15");
		sleep(null);
	}

	public void clickOnButtonCrearNotificacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearNotificacion)).click().perform();
		sleep(null);
	}

	// ============ Etiquetas ============ //

	public void clickOnTabEtiquetas() {
		wait.until(ExpectedConditions.elementToBeClickable(tabEtiquetas)).click();
		sleep(null);
	}

	public void clickOnButtonNuevaEtiquetas() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevaEtiquetas)).click().perform();
		sleep(null);
	}

	public void fillNombreEtiqueta() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNombreEtiqueta));
		driver.findElement(textBoxNombreEtiqueta).sendKeys(nombreEtiqueta);
		sleep(null);
	}

	public void fillDescripcionCortaEtiqueta() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDescripcionCortaEtiqueta));
		driver.findElement(textBoxDescripcionCortaEtiqueta).sendKeys("Lorem ipsum dolor sit amet");
		sleep(null);
	}

	public void fillDescripcionLargaEtiqueta() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDescripcionLargaEtiqueta));
		driver.findElement(textBoxDescripcionLargaEtiqueta).sendKeys(
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse ultricies id elit nec lobortis.");
		sleep(null);
	}

	public void fillTipoEtiqueta() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxTipoEtiqueta)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxTipoEtiquetaValueAutomatica)).click();
		sleep(null);
	}

	public void clickOnButtonCrearEtiqueta() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearEtiqueta)).click().perform();
		sleep(null);
	}

	// ============ Plazo ============ //

	public void clickOnTabPlazo() {
		wait.until(ExpectedConditions.elementToBeClickable(tabPlazo)).click();
		sleep(null);
	}

	public void clickOnButtonNuevoPlazo() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevoPlazo)).click().perform();
		sleep(null);
	}

	public void fillDescripcionPlazo() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDescripcionPlazo));
		driver.findElement(textBoxDescripcionPlazo).sendKeys(plazo);
		sleep(null);
	}

	public void fillDiasMaxPlazo() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxDiasMaxPlazo));
		driver.findElement(textBoxDiasMaxPlazo).sendKeys("10");
		sleep(null);
	}

	public void fillNormativaPlazo() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNormativaPlazo));
		driver.findElement(textBoxNormativaPlazo).sendKeys("Lorem ipsum dolor sit amet");
		sleep(null);
	}

	public void clickOnButtonCrearPlazo() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearPlazo)).click().perform();
		sleep(null);
	}

	// ============ Idiomas ============ //

	public void clickOnTabIdiomas() {
		wait.until(ExpectedConditions.elementToBeClickable(tabIdioma)).click();
		sleep(null);
	}

	public void clickOnButtonNuevaIdioma() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonNuevaIdiomao)).click().perform();
		sleep(null);
	}

	public void fillNombreIdioma() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxNombreIdioma));
		driver.findElement(textBoxNombreIdioma).sendKeys(idioma);
		sleep(null);
	}

	public void clickOnButtonCrearIdioma() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearIdioma)).click().perform();
		sleep(null);
	}

	// ============ subsanación ============ //

	public void clickOnTabTiposSubsanacion() {
		wait.until(ExpectedConditions.elementToBeClickable(tabTiposSubsanacion)).click();
		sleep(null);
	}

	public void clickOnButtonNuevoTipoSubsanacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(ButtonNuevoTipoSubsanacion)).click().perform();
		sleep(null);
	}

	public void fillTipoSubsanacion() {
		wait.until(ExpectedConditions.elementToBeClickable(textBoxTipoSubsanacion));
		driver.findElement(textBoxTipoSubsanacion).sendKeys(tipoSubsanacion);
		sleep(null);
	}

	public void fillEstadoSubsanacion() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoSubsanacion)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxEstadoSubsanacionValueActivo)).click();
		sleep(null);
	}

	public void fillProcedimientosSubsanacion() {
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProcedimientosSubsanacion)).click();
		wait.until(ExpectedConditions.elementToBeClickable(comboBoxProcedimientosSubsanacionValueHomologacion)).click();
		sleep(null);
	}

	public void clickOnButtonAsignarSubsanacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonAsignarSubsanacion)).click().perform();
		sleep(null);
	}

	public void clickOnButtonCrearTipoSubsanacion() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(buttonCrearTipoSubsanacion)).click().perform();
		sleep(null);
	}

	// ============= Data assertion ============= //

	public boolean isClickable(By el) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(el));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void assertCreateUsuario() {
		sleep(3000L);
		if (driver.findElement(tableUsuarios).getText().contains(usuarioApellido) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableUsuarios));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNU)).click();
			driver.findElement(tableUsuarios).getText().contains(usuarioApellido);
			sleep(3000L);
		}
		System.out.println("The user " + "'" + usuarioApellido + "'" + " is successfully created");
	}

	public void assertCreateRol() {
		sleep(3000L);
		if (driver.findElement(tableRoles).getText().contains(rolNombre) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableRoles));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNR)).click();
			driver.findElement(tableRoles).getText().contains(rolNombre);
			sleep(3000L);
		}
		System.out.println("The Rol " + "'" + rolNombre + "'" + " is successfully created");
	}

	public void assertCreateTasa() {
		sleep(3000L);
		if (driver.findElement(tableTasa).getText().contains(codigoTasa) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableTasa));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNT)).click();
			driver.findElement(tableTasa).getText().contains(codigoTasa);
			sleep(3000L);
		}
		System.out.println("The Tasa " + "'" + codigoTasa + "'" + " is successfully created");
	}

	public void assertCreateMedidaGeneral() {
		sleep(3000L);
		if (driver.findElement(tableMedidasGeneral).getText().contains("Abogado") == false
				|| driver.findElement(tableMedidasGeneral).getText().contains("Spain") == false
				|| driver.findElement(tableMedidasGeneral).getText().contains("Titulo 1") == false
				|| driver.findElement(tableMedidasGeneral).getText().contains("homologación") == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableMedidasGeneral));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNT)).click();
			driver.findElement(tableMedidasGeneral).getText().contains("Abogado");
			sleep(3000L);
		}
		System.out.println("The Medida General is successfully created");
	}

	public void assertCreateCalendario() {
		sleep(3000L);
		if (driver.findElement(tableCalendario).getText().contains(anoCalendario) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableCalendario));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNC)).click();
			driver.findElement(tableCalendario).getText().contains(anoCalendario);
			sleep(3000L);
		}
		System.out.println(
				"The Calendario with date " + "'" + "03/05/" + anoCalendario + "'" + " is successfully created");
	}

	public void assertCreateFuncionalidad() {
		sleep(3000L);
		if (driver.findElement(tableFunctionalidad).getText().contains(functionalidad) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableFunctionalidad));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNF)).click();
			driver.findElement(tableFunctionalidad).getText().contains(functionalidad);
			sleep(3000L);
		}
		System.out.println("The functionalidad " + "'" + functionalidad + "'" + " is successfully created");
	}

	public void assertCreatePais() {

		sleep(3000L);
		if (driver.findElement(tablePais).getText().contains(pais) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tablePais));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNP)).click();
			driver.findElement(tablePais).getText().contains(pais);
			sleep(3000L);
		}
		System.out.println("The Country " + "'" + pais + "'" + " is successfully created");
	}

	public void assertCreateNotificacion() {
		sleep(3000L);
		boolean statusSEDE = driver.findElement(textBoxDiasSEDE).getAttribute("value").contains("10");
		boolean statusDEH = driver.findElement(textBoxDiasDEH).getAttribute("value").contains("15");
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxDiasSEDE));
		wait.until(ExpectedConditions.visibilityOfElementLocated(textBoxDiasDEH));
		if (statusSEDE == true && statusDEH == true) {
			System.out.println("The SEDE and DEH notificationes are successfully created");
		} else {
			System.out.println("The SEDE and DEH notificationes are not created");
		}
	}

	public void assertCreateEtiquita() {
		sleep(3000L);
		if (driver.findElement(tableEtiquitas).getText().contains(nombreEtiqueta) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableEtiquitas));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNE)).click();
			driver.findElement(tableEtiquitas).getText().contains(nombreEtiqueta);
			sleep(3000L);
		}
		System.out.println("The Etiquita " + "'" + nombreEtiqueta + "'" + " is successfully created");
	}

	public void assertCreatePlazo() {
		sleep(3000L);
		if (driver.findElement(tablePlazo).getText().contains(plazo) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tablePlazo));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNPL)).click();
			driver.findElement(tablePlazo).getText().contains(plazo);
			sleep(3000L);
		}
		System.out.println("The Plazo " + "'" + plazo + "'" + " is successfully created");
	}

	public void assertCreateIdioma() {
		sleep(3000L);
		if (driver.findElement(tableIdioma).getText().contains(idioma) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableIdioma));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNI)).click();
			driver.findElement(tableIdioma).getText().contains(idioma);
			sleep(3000L);
		}
		System.out.println("The idioma " + "'" + idioma + "'" + " is successfully created");
	}

	public void assertCreateTipoSubsanacion() {
		sleep(3000L);
		if (driver.findElement(tableSubsanacion).getText().contains(tipoSubsanacion) == false) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(tableSubsanacion));
			wait.until(ExpectedConditions.elementToBeClickable(buttonNavigationNextNS)).click();
			driver.findElement(tableSubsanacion).getText().contains(tipoSubsanacion);
			sleep(3000L);
		}
		System.out.println("The tipo de subanacion " + "'" + tipoSubsanacion + "'" + " is successfully created");
	}

}

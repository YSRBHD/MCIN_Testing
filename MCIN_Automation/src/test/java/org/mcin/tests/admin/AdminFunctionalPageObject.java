package org.mcin.tests.admin;

import org.mcin.utils.AdministratorPageObject;
import org.openqa.selenium.WebDriver;

public class AdminFunctionalPageObject extends AdministratorPageObject {

	public AdminFunctionalPageObject(WebDriver driver) {
		super(driver);
	}

	public void autentificationAdminFunctional() {
		clickOnButtonAdminFuncional();
	}

	public void crearNuevoUsuario() {

		clickOnButtonNuevoUsuarios();
		fillEmailNuevoUsuario();
		fillNombreNuevoUsuario();
		fillPrimerApellidoNuevoUsuario();
		fillSegundoApellidoNuevoUsuario();
		fillRolNuevoUsuario();
		fillEstadoNuevoUsuario();
		fillObservacionesNuevoUsuario();
		clickOnButtonCrearUsuarios();
		assertCreateUsuario();
	}

	public void crearNuevoRole() {
		clickOnTabRoles();
		clickOnButtonNuevoRol();
		fillNombreNuevoRol();
		fillOrganoNuevoRol();
		fillDescripcionNuevoRol();
		fillEstadoNuevoRol();
		fillFuncionalidadesNuevoRol();
		clickOnButtonAssignarRol();
		clickOnButtonCrearRol();
		assertCreateRol();

	}

	public void crearNuevaTasaAdminFunctional() {
		clickOnTabTasasAdminFuncional();
		clickOnButtonNuevaTasa();
		fillCodigoTasa();
		fillProcedimientoTasa();
		fillFechainicioVigenciaTasa();
		fillFechaFinVigenciaTasa();
		fillCodigoHaciendaTasa();
		fillModeloTasa();
		fillImporteTasa();
		clickOnButtonCrearTasa();
		assertCreateTasa();

	}

	public void crearNuevaMedidaGeneral() {
		clickOnTabMedidasGenerales();
		clickOnButtonNuevaMedidasGenerales();
		fillProcedimientoMG();
		fillTituloMG();
		fillCriterioMG();
		fillProfesionMG();
		fillPaisMG();
		clickOnCheckboxFavorableMG();
		fillEstadoMG();
		clickOnButtonCrearMedidasGenerales();
		assertCreateMedidaGeneral();

	}

	public void crearNuevoCalendarios() {
		clickOnTabCalendarios();
		clickOnButtonNuevoCalendario();
		fillFechaCalendario();
		fillFestivosCalendario();
		clickOnButtonCrearCalendario();
		assertCreateCalendario();
	}

}

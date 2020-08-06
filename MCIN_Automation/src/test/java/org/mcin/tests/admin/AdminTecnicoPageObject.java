package org.mcin.tests.admin;

import org.mcin.utils.AdministratorPageObject;
import org.openqa.selenium.WebDriver;

public class AdminTecnicoPageObject extends AdministratorPageObject {

	public AdminTecnicoPageObject(WebDriver driver) {
		super(driver);
	}

	public void autentificationAdminTecnicol() {
		clickOnButtonAdminTecnico();
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

	public void crearNuevaFuncionalidad() {
		clickOnTabFunctionalidades();
		clickOnButtonNuevaFunctionalidad();
		fillDescripcionFunctionalidad();
		clickOnButtonCrearFunctionalidad();
		assertCreateFuncionalidad();
	}

	public void crearNuevoPais() {
		clickOnTabPaises();
		clickOnButtonNuevoPais();
		fillNombrePais();
		clickOnButtonCrearPais();
		assertCreatePais();

	}

	public void crearNuevaNotificacion() {
		clickOnTabNotificaciones();
		clickOnButtonNuevaNotificacion();
		fillDiasSEDE();
		fillDiasDEH();
		clickOnButtonCrearNotificacion();
		assertCreateNotificacion();
	}

	public void crearNuevaEtiquita() {
		clickOnTabEtiquetas();
		clickOnButtonNuevaEtiquetas();
		fillNombreEtiqueta();
		fillDescripcionCortaEtiqueta();
		fillDescripcionLargaEtiqueta();
		fillTipoEtiqueta();
		clickOnButtonCrearEtiqueta();
		assertCreateEtiquita();
	}

	public void crearNuevoPlazo() {
		clickOnTabPlazo();
		clickOnButtonNuevoPlazo();
		fillDescripcionPlazo();
		fillDiasMaxPlazo();
		fillNormativaPlazo();
		clickOnButtonCrearPlazo();
		assertCreatePlazo();

	}

	public void crearNuevaIdioma() {
		clickOnTabIdiomas();
		clickOnButtonNuevaIdioma();
		fillNombreIdioma();
		clickOnButtonCrearIdioma();
		assertCreateIdioma();
	}

	public void crearNuevaTasaAdminTecnico() {
		clickOnTabTasasAdminTecnico();
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

	public void crearNuevoTipoSubsanacion() {
		clickOnTabTiposSubsanacion();
		clickOnButtonNuevoTipoSubsanacion();
		fillTipoSubsanacion();
		fillEstadoSubsanacion();
		fillProcedimientosSubsanacion();
		clickOnButtonAsignarSubsanacion();
		clickOnButtonCrearTipoSubsanacion();
		assertCreateTipoSubsanacion();

	}

}

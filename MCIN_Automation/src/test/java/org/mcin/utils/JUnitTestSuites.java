package org.mcin.utils;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.mcin.tests.solicitud.AcreditacionEsTestCase;
import org.mcin.tests.solicitud.EquivalenciaEsTestCase;
import org.mcin.tests.solicitud.HomologacionEsTestCase;
import org.mcin.tests.solicitud.ReconocimientoEsTestCase;

@RunWith(Suite.class)

@Suite.SuiteClasses({ EquivalenciaEsTestCase.class, HomologacionEsTestCase.class, ReconocimientoEsTestCase.class,
		AcreditacionEsTestCase.class, /* AdminFunctionalTestCase.class, AdminTecnicoPageObject.class */ })

public class JUnitTestSuites {

}

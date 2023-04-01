package fr.gouv.esante.finess.controller.health_check;

import org.junit.jupiter.api.Test;
import fr.gouv.esante.finess.controller.RequestTestCase;

final class HealthCheckGetControllerTest extends RequestTestCase {
    @Test
    public void shouldCheckTheAppIsWorkingOk() throws Exception {
        this.getRequest("/health-check", 200, "{'status': 'ok'}");
    }
}

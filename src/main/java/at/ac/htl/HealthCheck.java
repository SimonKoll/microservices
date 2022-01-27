package at.ac.htl;

import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Liveness
public class HealthCheck implements org.eclipse.microprofile.health.HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return null;
    }
}

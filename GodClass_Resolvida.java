public class GodClass_Resolvida {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator();
        DashboardLoader dashboardLoader = new DashboardLoader();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        ReportGenerator reportGenerator = new ReportGenerator();

        Application app = new Application(authenticator, dashboardLoader, paymentProcessor, reportGenerator);
        app.run();
    }
}


class Application {
    private final Authenticator authenticator;
    private final DashboardLoader dashboardLoader;
    private final PaymentProcessor paymentProcessor;
    private final ReportGenerator reportGenerator;

    public Application(
        Authenticator authenticator,
        DashboardLoader dashboardLoader,
        PaymentProcessor paymentProcessor,
        ReportGenerator reportGenerator
    ) {
        this.authenticator = authenticator;
        this.dashboardLoader = dashboardLoader;
        this.paymentProcessor = paymentProcessor;
        this.reportGenerator = reportGenerator;
    }

    public void run() {
        System.out.println("Running application...");
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}


class Authenticator {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}


class DashboardLoader {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}


class PaymentProcessor {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}


class ReportGenerator {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}

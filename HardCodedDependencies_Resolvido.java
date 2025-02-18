public class HardCodedDependencies_Resolvido {
    public static void main(String[] args) {
        ReportGenerator pdfGenerator = new PDFReportGenerator();
        Report report = new Report(pdfGenerator);
        report.generateReport();

        ReportGenerator htmlGenerator = new HTMLReportGenerator();
        Report htmlReport = new Report(htmlGenerator);
        htmlReport.generateReport();
    }
}


interface ReportGenerator {
    void generate();
}


class PDFReportGenerator implements ReportGenerator {
    
    public void generate() {
        System.out.println("Generating PDF Report...");
    }
}


class HTMLReportGenerator implements ReportGenerator {
    @Override
    public void generate() {
        System.out.println("Generating HTML Report...");
    }
}


class Report {
    private final ReportGenerator reportGenerator;

    public Report(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        reportGenerator.generate();
    }
}

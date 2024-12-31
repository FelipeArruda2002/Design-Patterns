package report;

public class ReportGenerator {
    public void loadData(String source) {
        System.out.println("Loading data from: " + source);
    }

    public void filterData() {
        System.out.println("Filtering data (default implementation).");
    }

    public void processData() {
        System.out.println("Processing data (default implementation).");
    }

    public void generateReport(String output) {
        System.out.println("Generating report at: " + output);
    }

    public void optionalStep() {
        // Hook method: by default, it does nothing.
    }

    public void generate(String source, String output) {
        loadData(source);
        filterData();
        processData();
        optionalStep();
        generateReport(output);
    }
}
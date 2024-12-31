package report;

public abstract class ReportGenerator {
    public final void loadData(String source) {
        System.out.println("Loading data from: " + source);
    }

    public final void generateReport(String output) {
        System.out.println("Generating report at: " + output);
    }
    
    public abstract void filterData();
    public abstract void processData();

    public void optionalStep() {
        // Hook method: by default, it does nothing.
    }

    public final void generate(String source, String output) {
        loadData(source);
        filterData();
        processData();
        optionalStep();
        generateReport(output);
    }
}
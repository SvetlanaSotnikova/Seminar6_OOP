package dip1.model;

import java.util.List;

import dip1.model.util.ReportTable;

public class ReportManager {
    ReportTable reportTable;

    public ReportManager(ReportTable reportTable) {
        this.reportTable = reportTable;
    }

    public void output(List<ReportItem> items) {
        reportTable.output(items);
    }
}

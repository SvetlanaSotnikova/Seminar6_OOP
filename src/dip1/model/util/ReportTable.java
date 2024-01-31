package dip1.model.util;

import java.util.List;

import dip1.model.ReportItem;

public interface ReportTable {
    void output(List<ReportItem> items);
}

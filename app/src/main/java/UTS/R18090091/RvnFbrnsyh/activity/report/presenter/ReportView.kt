package UTS.R18090091.RvnFbrnsyh.activity.report.presenter

import UTS.R18090091.RvnFbrnsyh.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}
package UTS.R18090091.RvnFbrnsyh.activity.data_barang.presenter

import UTS.R18090091.RvnFbrnsyh.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}
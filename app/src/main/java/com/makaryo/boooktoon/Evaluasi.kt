package com.makaryo.boooktoon


class Evaluasi(
    val soal: String,
    val jwbnA: String, val jwbnB: String, val jwbnC: String,
    val jwbnD: String, val jwbnE: String, val kunci: String
) {
    var pilihan: String? = null
    var pilihanRes: Int = 0

    init {
        pilihan = "-"
        pilihanRes = 0
    }
}

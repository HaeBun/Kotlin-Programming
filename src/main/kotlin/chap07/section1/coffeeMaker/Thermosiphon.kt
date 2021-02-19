package chap07.section1.coffeeMaker

class Theromsiphon(heater: Heater) : Pump, Heater by heater { // 위임의 사용
    override fun pump() {
        if (isHot()) {
            println("[Thermosiphon] pumping...")
        }
    }
}
package chap07.section1.coffeeMaker

class MyDripCoffeeModule : CoffeeModule {
    companion object {
        val electricHeater: ElectricHeater by lazy { // lazy를 이용한 지연 초기화
            ElectricHeater()
        }
    }

    private val _thermosiphon : Theromsiphon by lazy { // 임시적인 private 프로퍼티
        Theromsiphon(electricHeater)
    }
    // 오직 이 메서드에서만 Thermosiphon을 초기화
    override fun getThermosiphon() : Theromsiphon = _thermosiphon
}
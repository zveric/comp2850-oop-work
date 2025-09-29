// Task 13.4

class CurrencyConverter(val service: ExchangeRateService) {
    fun convertTo(currency: String, amount: Double): Double {
        return service.rateFor(currency) * amount
    }
}
